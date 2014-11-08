package com.freeshow.service.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 客户账户信息响应DTO
 * Created by Mac Zhang on 14-11-3 下午6:00
 */
@ToString
@Getter
@Setter
public class AccResDTO implements Serializable {
    private static final long serialVersionUID = 1501548355804310390L;

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
     * 账户名
     */
    private String accountName;

    /**
     * 账户状态
     * NORMAL-正常;
     FREEZE-冻结;
     CLOSE-销户;
     NOENABLE-未激活;
     */
    private String accountStatus;

    /**
     * 账户余额(单位：分)
     */
    private Long balance;

    /**
     * 账户可用余额(单位：分)
     */
    private Long availableBalance;

    /**
     * 账户不可用余额(单位：分)
     */
    private Long unavailableBalance;

    /**
     * 账户支付密码
     */
    private String payPassword;

    /**
     * 修改前支付密码
     */
    private String beforePayPassword;

    /**
     * 最后支付成功时间
     */
    private Date lastPaySuccessDate;

    /**
     * 最后支付失败时间
     */
    private Date lastPayFailDate;

    /**
     * 描述
     */
    private String description;

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
