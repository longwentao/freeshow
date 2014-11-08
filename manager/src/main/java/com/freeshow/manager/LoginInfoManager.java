package com.freeshow.manager;

import com.freeshow.manager.exception.FreeShowException;
import com.freeshow.manager.util.BeanMapperUtil;
import com.freeshow.mapper.AccountMapper;
import com.freeshow.mapper.CustomerInfoMapper;
import com.freeshow.mapper.LoginInfoMapper;
import com.freeshow.models.AccountDO;
import com.freeshow.models.CustomerInfoDO;
import com.freeshow.models.LoginInfoDO;
import com.freeshow.service.enums.BussErrorCode;
import com.freeshow.service.models.AccResDTO;
import com.freeshow.service.models.LoginInfoResDTO;
import com.freeshow.service.models.LoginResDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 登陆信息 manager
 * Created by Mac Zhang on 14-11-8 下午7:25
 */
@Component
@Slf4j
public class LoginInfoManager {

    /**
     * 登陆信息 Mapper
     */
    @Autowired
    private LoginInfoMapper loginInfoMapper;

    /**
     * 客户账户 Mapper
     */
    @Autowired
    private AccountMapper accountMapper;


    /**
     * 根据登陆名查询登陆信息
     * @param loginName 登陆名
     * @return 登陆信息
     */
    public LoginInfoDO queryLoginInfoByLoginName(String loginName){
        LoginInfoDO loginInfoDO = loginInfoMapper.selectByPrimaryKey(loginName);
        if(null == loginInfoDO){
            throw new FreeShowException(BussErrorCode.QUERY_OBJECT_NOT_EXISTED.getErrorCode(),
                    BussErrorCode.QUERY_OBJECT_NOT_EXISTED.getErrorMsg() + "登陆信息");
        }
        return loginInfoDO;
    }
    /**
     * 根据登陆名、登陆密码 查询登陆信息
     * @param loginName 登陆名
     * @param loginPwd 登陆密码
     * @return 登陆信息数据原型
     */
    public LoginResDTO login(String loginName,String loginPwd){
        //验证登陆名是否存在
        queryLoginInfoByLoginName(loginName);

        LoginInfoDO loginInfoDO = loginInfoMapper.selectByLogin(loginName,loginPwd);
        loginPwdErrorRecords(loginInfoDO);

        AccountDO accountDO = accountMapper.selectByPrimaryKey(loginInfoDO.getAccountNo());
        if(null == loginInfoDO){
            throw new FreeShowException(BussErrorCode.QUERY_OBJECT_NOT_EXISTED.getErrorCode(),
                    BussErrorCode.QUERY_OBJECT_NOT_EXISTED.getErrorMsg() + "客户账户信息");
        }
        LoginResDTO loginResDTO = new LoginResDTO();
        loginResDTO.setLoginInfoResDTO(BeanMapperUtil.map(loginInfoDO, LoginInfoResDTO.class));
        loginResDTO.setAccResDTO(BeanMapperUtil.map(accountDO, AccResDTO.class));
        return loginResDTO;
    }

    /**
     * 登陆密码错误记录
     * @param loginInfoDO
     */
    public void loginPwdErrorRecords(LoginInfoDO loginInfoDO){
        if(null != loginInfoDO) return;

        throw new FreeShowException(BussErrorCode.INVALID_PARAMETERS.getErrorCode(),
                BussErrorCode.INVALID_PARAMETERS.getErrorMsg() + "登陆密码有误");
    }
}
