package com.freeshow.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 客户信息 DO
 * Created by Mac Zhang on 14-11-7 下午22:00
 */
@Getter
@Setter
@ToString
public class CustomerInfoDO implements Serializable{

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
     * 证件类型
     * ID-身份证;
     PASSPORT-护照;
     OTHER-其他;
     */
    private String certificateType;

    /**
     * 证件号
     */
    private String certificateNo;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 客户角色
     * NORMAL-普通
     VIP-高级
     */
    private String customerGrade;

    /**
     * 客户类型
     * ORG-公司
     PERSON-个人
     */
    private String customerType;

    /**
     * 客户状态
     */
    private String customerStatus;

    /**
     * 客户成长级别
     */
    private String customerLvl;

    /**
     * 认证状态
     * Y-已认证
     N-未认证
     */
    private String authStatus;

    /**
     * 认证方式
     * MOBILE-手机
     EMAIL-邮箱
     */
    private String authWay;

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
