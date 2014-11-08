package com.freeshow.mapper;

import com.freeshow.models.AccountDO;

/**
 * 客户账户持久层 Mapper
 * Created by Mac Zhang on 14-11-7 下午22:00
 */
public interface AccountMapper {

    /**
     * 新增客户账户
     * @param accountDO 客户账户 DO
     * @return 数据库执行条数
     */
    int insert(AccountDO accountDO);

    /**
     * 根据客户账户号查询客户账户信息
     * @param accountNo 主键 客户账户号
     * @return 客户账户信息
     */
    AccountDO selectByPrimaryKey(String accountNo);

    /**
     * 更新客户账户信息
     * @param accountDO 客户账户 DO
     * @return 数据库执行条数
     */
    int update(AccountDO accountDO);

    /**
     * 更新客户账户支付密码
     * @param accountDO 客户账户 DO
     * @return 数据库执行条数
     */
    int updatePayPwd(AccountDO accountDO);
}
