package com.freeshow.manager;

import com.freeshow.constant.CommonString;
import com.freeshow.manager.util.BeanMapperUtil;
import com.freeshow.mapper.AccountMapper;
import com.freeshow.mapper.CustomerInfoMapper;
import com.freeshow.mapper.LoginInfoMapper;
import com.freeshow.models.AccountDO;
import com.freeshow.models.CustomerInfoDO;
import com.freeshow.models.LoginInfoDO;
import com.freeshow.service.enums.*;
import com.freeshow.service.models.CustomerCreateReqDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 客户信息 manager
 * Created by Mac Zhang on 14-11-8 下午6:07
 */
@Component
@Slf4j
public class CustomerInfoManager {

    /**
     * 客户信息 Mapper
     */
    @Autowired
    private CustomerInfoMapper customerInfoMapper;

    /**
     * 客户账户 Mapper
     */
    @Autowired
    private AccountMapper accountMapper;

    /**
     * 登陆信息 Mapper
     */
    @Autowired
    private LoginInfoMapper loginInfoMapper;

    /**
     * 创建客户
     * @param reqDTO 请求信息DTO
     * @return 客户号
     */
    @Transactional(readOnly = false, isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public String createCustomer(CustomerCreateReqDTO reqDTO){
        String customerNo = createCustomerInfo(reqDTO);
        String accountNo = createAccount(reqDTO,customerNo);
        createLoginInfo(reqDTO,customerNo,accountNo);
        return customerNo;
    }

    /**
     * 创建客户基本信息
     * @param reqDTO 请求信息DTO
     * @return 客户号
     */
    private String createCustomerInfo(CustomerCreateReqDTO reqDTO){
        CustomerInfoDO customerInfoDO = new CustomerInfoDO();
        customerInfoDO.setCustomerGrade(CustomerGrade.NORMAL.getCode());
        customerInfoDO.setCustomerLvl(CustomerLvl.NORMAL_1.getCode());
        customerInfoDO.setCustomerType(reqDTO.getCustomerType().getCode());
        customerInfoDO.setCustomerStatus(CustomerStatus.NORMAL.getCode());
        customerInfoDO.setAuthStatus(AuthStatus.NO.getCode());

        customerInfoMapper.insert(customerInfoDO);
        return customerInfoDO.getCustomerNo();
    }

    /**
     * 创建客户账户信息
     * @param reqDTO 请求信息DTO
     * @param customerNo 客户号
     * @return 客户账户号
     */
    private String createAccount(CustomerCreateReqDTO reqDTO,String customerNo){
        AccountDO accountDO = new AccountDO();
        accountDO.setCustomerNo(customerNo);
        //注册时客户名默认：ACC+客户号 注册后客户可更改
        accountDO.setAccountName(CommonString.ACC + customerNo);
        accountDO.setAccountStatus(AccountStatus.NORMAL.getCode());
        accountDO.setPayPassword(CommonString.ACC + reqDTO.getLoginPwd());
        accountDO.setCreatedBy(reqDTO.getLoginName());
        accountDO.setUpdatedBy(reqDTO.getLoginName());
        accountMapper.insert(accountDO);
        return accountDO.getAccountNo();
    }

    /**
     * 创建登陆信息
     * @param reqDTO 请求信息DTO
     * @param customerNo 客户号
     * @param accountNo 客户账户号
     */
    private void createLoginInfo(CustomerCreateReqDTO reqDTO,String customerNo,String accountNo){
        LoginInfoDO loginInfoDO = BeanMapperUtil.map(reqDTO,LoginInfoDO.class);
        loginInfoDO.setCreatedBy(reqDTO.getLoginName());
        loginInfoDO.setUpdatedBy(reqDTO.getLoginName());
        loginInfoDO.setCustomerNo(customerNo);
        loginInfoDO.setAccountNo(accountNo);
        loginInfoDO.setRegisterChannel(reqDTO.getRegisterChannel().getCode());
        loginInfoDO.setLoginType(reqDTO.getLoginType().getCode());
        loginInfoDO.setLoginStatus(LoginInfoStatus.W.getCode());
        loginInfoDO.setLoginRole(reqDTO.getLoginInfoRole().getCode());
        loginInfoDO.setLoginFrozeStatus(LoginFrozeStatus.NO.getCode());
        loginInfoMapper.insert(loginInfoDO);
    }
}
