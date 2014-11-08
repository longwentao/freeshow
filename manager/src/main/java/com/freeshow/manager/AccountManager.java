package com.freeshow.manager;

import com.freeshow.manager.exception.FreeShowException;
import com.freeshow.manager.util.BeanMapperUtil;
import com.freeshow.mapper.AccountMapper;
import com.freeshow.models.AccountDO;
import com.freeshow.service.enums.BussErrorCode;
import com.freeshow.service.models.AccPayPwdModifyReqDTO;
import com.freeshow.service.models.AccResDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 客户账户 manager
 * Created by Mac Zhang on 14-11-8 下午5:22
 */
@Component
@Slf4j
public class AccountManager {

    /**
     * 客户账户 Mapper
     */
    @Autowired
    private AccountMapper accountMapper;

    /**
     * 查询客户账户信息
     * @param accountNo 客户账户号
     * @return 客户账户数据原型
     */
    public AccountDO queryAccDO(String accountNo){
        AccountDO accountDO = accountMapper.selectByPrimaryKey(accountNo);
        if(null == accountDO){
            throw new FreeShowException(BussErrorCode.QUERY_OBJECT_NOT_EXISTED.getErrorCode(),
                    BussErrorCode.QUERY_OBJECT_NOT_EXISTED.getErrorMsg() + "客户账户");
        }
        return accountDO;
    }

    /**
     * 查询客户账户信息
     * @param accountNo 客户账户号
     * @return 客户账户响应DTO
     */
    public AccResDTO queryAcc(String accountNo){
        return BeanMapperUtil.map(queryAccDO(accountNo),AccResDTO.class);
    }

    /**
     * 客户账户支付密码鉴权
     * @param accountNo 客户账户号
     * @param payPwd 请求验证的支付密码
     * @return 是否一致
     */
    public boolean checkAccPayPwd(String accountNo, String payPwd){
        AccountDO accountDO = queryAccDO(accountNo);
        return payPwd.equals(accountDO.getPayPassword());
    }

    /**
     * 客户账户支付密更改
     * @param reqDTO 请求DTO
     * @return 是否更改成功
     */
    @Transactional(readOnly = false, isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public boolean modifyAccPayPwd(AccPayPwdModifyReqDTO reqDTO){
        queryAccDO(reqDTO.getAccountNo());
        return accountMapper.updatePayPwd(BeanMapperUtil.map(reqDTO,AccountDO.class)) > 0;
    }
}
