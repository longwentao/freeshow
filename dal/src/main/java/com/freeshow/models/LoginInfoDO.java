package com.freeshow.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 登陆信息 DO
 * Created by Mac Zhang on 14-11-7 下午22:00
 */
@Getter
@Setter
@ToString
public class LoginInfoDO implements Serializable{

    private static final long serialVersionUID = 1625538457626608940L;

    /**
     * 系统id
     */
    private Long id;

    /**
     * 客户号
     */
    private String customerNo;

    /**
     * 账户号
     */
    private String accountNo;

    /**
     * 登陆名
     */
    private String loginName;

    /**
     * 登录密码
     */
    private String loginPwd;

    /**
     * 登录类型
     * NICK-昵称
     EMAIL-邮箱
     MOBILE-手机
     */
    private String loginType;

    /**
     * 昵称
     */
    private String loginNick;

    /**
     * 登陆信息头像
     */
    private String picture;

    /**
     * 修改前登录用户号
     */
    private String loginNoBeforeModify;

    /**
     * 状态
     * W-待激活
     N-已激活
     */
    private String loginStatus;

    /**
     * 最后成功登录时间
     */
    private Date lastLoginSucDate;

    /**
     * 最后失败登录时间
     */
    private Date lastLoginFailDate;

    /**
     * 登录密码错误次数
     */
    private Long loginPwdErrorTimes;

    /**
     * 最后登录IP
     */
    private String lastLoginIp;

    /**
     * 用户角色
     SYS_ADMIN-系统后台管理员
     SYS_AUTH-系统授权人员（后台复核员）
     OPERATOR-普通用户
     ADMIN _OPERATOR-普通用户主管理员
     */
    private String loginRole;

    /**
     * 登录冻结标识
     * Y-登录冻结，不允许登录
     N-未冻结，允许登录
     */
    private String loginFrozeStatus;

    /**
     * 描述说明
     */
    private String description;

    /**
     * 最后登录时间
     */
    private Date lastLoginTime;

    /**
     * 注册渠道
     * 描述客户创建注册时的渠道：
     WEB-网站用户注册；
     WAP-手机浏览器；
     APP-App用户注册；
     OTHER-其他渠道；
     */
    private String registerChannel;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 创建用户
     */
    private String createdBy;

    /**
     * 最后更新日期
     */
    private Date updatedAt;

    /**
     * 最后更新用户
     */
    private String updatedBy;
}
