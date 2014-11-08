package com.freeshow.mapper;

import com.freeshow.models.CustomerPersonDO;

/**
 * 个人客户信息持久层 Mapper
 * Created by Mac Zhang on 14-11-7 下午22:00
 */
public interface CustomerPersonMapper {

    /**
     * 插入个人客户信息
     * @param customerPersonDO 个人客户信息 DO
     * @return 数据库执行条数
     */
    int insert(CustomerPersonDO customerPersonDO);

    /**
     * 根据 客户号 查询个人客户信息
     * @param customerNo 客户号
     * @return 个人客户信息
     */
    CustomerPersonDO selectByPrimaryKey(String customerNo);

    /**
     * 更新个人客户信息
     * @param customerPersonDO 个人客户信息 DO
     * @return 数据库执行条数
     */
    int update(CustomerPersonDO customerPersonDO);

}
