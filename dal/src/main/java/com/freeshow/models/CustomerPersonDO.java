package com.freeshow.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 个人客户 DO
 * Created by Mac Zhang on 14-11-7 下午22:00
 */
@Getter
@Setter
@ToString
public class CustomerPersonDO implements Serializable{

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
     * 性别
     * M-男性；W-女性；N-未知
     */
    private String gender;

    /**
     * 婚姻状态
     */
    private String maritalStTpCd;

    /**
     * 民族
     */
    private String nationTpCd;

    /**
     * 出生地
     */
    private String birthplaceTpCd;

    /**
     * 国籍
     */
    private String citizenshipTpCd;

    /**
     * 省份
     */
    private String provinceTpId;

    /**
     * 城市
     */
    private String cityId;

    /**
     * 出生日期
     */
    private String birthDate;

    /**
     * 学历
     */
    private String highestEduTpCd;

    /**
     * 职业状况
     */
    private String occpStTpCd;

    /**
     * 职位
     */
    private String occpSt;

    /**
     * 职业类别
     */
    private String jobType;

    /**
     * 职业
     */
    private String occupation;

    /**
     * 联系地址类型
     */
    private String addressType;

    /**
     * 联系地址
     */
    private String contractAddress;

    /**
     * 邮编
     */
    private String postCode;

    /**
     * 家庭电话
     */
    private String phone;

    /**
     * 联系邮箱
     */
    private String email;

    /**
     * 手机
     */
    private String mobile;

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
