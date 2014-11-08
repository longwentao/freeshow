package com.freeshow.mapper;

import com.freeshow.models.LoginInfoDO;

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
     * @param loginNo 登陆号
     * @return 货币
     */
    LoginInfoDO selectByPrimaryKey(String loginNo);

    /**
     * 更新登陆信息
     * @param loginInfoDO 登陆信息 DO
     * @return 数据库执行条数
     */
    int update(LoginInfoDO loginInfoDO);

}
