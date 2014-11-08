package com.freeshow.mapper;

import com.freeshow.models.AccountFollowersDO;

/**
 * 客户账户关系持久层 Mapper
 * Created by Mac Zhang on 14-11-7 下午22:00
 */
public interface AccountFollowersMapper {

    /**
     * 新增客户账户关系
     * @param accountFollowersDO 客户账户关系 DO
     * @return 数据库执行条数
     */
    int insert(AccountFollowersDO accountFollowersDO);

    /**
     * 根据客户账户统计该客户账户下有多少个粉丝
     * @param accountNo 主键 客户账户号
     * @return 粉丝数
     */
    int followersNumByAccountNo(String accountNo);

    /**
     * 根据客户账户统计该客户账户是哪些客户账户的粉丝
     * @param accountNo 主键 客户账户号
     * @return 关注数
     */
    int unFollowersNumByAccountNo(String accountNo);

    /**
     * 删除客户账户关系，物理删除
     * @param accountFollowersDO 客户账户关系 DO
     * @return 数据库执行条数
     */
    int delete(AccountFollowersDO accountFollowersDO);

}
