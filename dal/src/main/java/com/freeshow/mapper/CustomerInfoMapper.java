package com.freeshow.mapper;

import com.freeshow.models.CustomerInfoDO;

/**
 * 客户信息持久层 Mapper
 * Created by Mac Zhang on 14-11-7 下午22:00
 */
public interface CustomerInfoMapper {

    /**
     * 插入客户信息
     * @param customerInfoDO 客户信息 DO
     * @return 数据库执行条数
     */
    int insert(CustomerInfoDO customerInfoDO);

    /**
     * 根据 客户号 查询客户信息
     * @param customerNo 主键 客户号
     * @return 客户信息
     */
    CustomerInfoDO selectByPrimaryKey(String customerNo);

    /**
     * 更新客户信息
     * @param customerInfoDO 客户信息 DO
     * @return 数据库执行条数
     */
    int update(CustomerInfoDO customerInfoDO);


}
