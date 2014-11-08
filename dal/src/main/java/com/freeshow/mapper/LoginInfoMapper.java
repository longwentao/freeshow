package com.freeshow.mapper;

import com.freeshow.models.LoginInfoDO;
import org.apache.ibatis.annotations.Param;

/**
 * 登陆信息持久层 Mapper
 * Created by Mac Zhang on 14-11-7 下午22:00
 */
public interface LoginInfoMapper {

    /**
     * 插入登陆信息
     * @param loginInfoDO 登陆信息 DO
     * @return 数据库执行条数
     */
    int insert(LoginInfoDO loginInfoDO);

    /**
     * 根据 登陆号 查询登陆信息
     * @param loginName 登陆名
     * @return 货币
     */
    LoginInfoDO selectByPrimaryKey(String loginName);

    /**
     * 根据登陆名、登陆密码
     * @param loginName 登陆名
     * @param loginPwd 登陆密码
     * @return 登陆信息
     */
    LoginInfoDO selectByLogin(@Param("loginName") String loginName,
                              @Param("loginPwd") String loginPwd);

    /**
     * 更新登陆信息
     * @param loginInfoDO 登陆信息 DO
     * @return 数据库执行条数
     */
    int update(LoginInfoDO loginInfoDO);

}
