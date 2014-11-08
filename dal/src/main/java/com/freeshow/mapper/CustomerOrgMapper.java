package com.freeshow.mapper;

import com.freeshow.models.CustomerOrgDO;

/**
 * 机构客户信息持久层 Mapper
 * Created by Mac Zhang on 14-11-7 下午22:00
 */
public interface CustomerOrgMapper {

    /**
     * 插入机构客户信息
     * @param customerOrgDO 机构客户信息 DO
     * @return 数据库执行条数
     */
    int insert(CustomerOrgDO customerOrgDO);

    /**
     * 根据 客户号 查询机构客户信息
     * @param customerNo 客户号
     * @return 机构客户信息
     */
    CustomerOrgDO selectByPrimaryKey(String customerNo);

    /**
     * 更新机构客户信息
     * @param customerOrgDO 机构客户信息 DO
     * @return 数据库执行条数
     */
    int update(CustomerOrgDO customerOrgDO);

}
