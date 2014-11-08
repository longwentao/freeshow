package com.freeshow.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;


/**
 * 客户账户关系 DO
 * Created by Mac Zhang on 14-11-7 下午22:00
 */
@Getter
@Setter
@ToString
public class AccountFollowersDO implements Serializable{

    private static final long serialVersionUID = 1625522457626608940L;

    /**
     * 系统id
     */
    private Long id;

    /**
     * 主客户账户号
     */
    private String accountNo;

    /**
     * 主客户账户号的粉丝
     */
    private String accountNoFollower;

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
