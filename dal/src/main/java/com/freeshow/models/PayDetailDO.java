package com.freeshow.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 支付明细 DO
 * Created by Mac Zhang on 14-11-7 下午22:00
 */
@Getter
@Setter
@ToString
public class PayDetailDO implements Serializable{

    private static final long serialVersionUID = 1625538457626608940L;
    /**
     * 系统id
     */
    private Long id;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 订单请求流水号
     */
    private String orderReqNo;

    /**
     * 客户账户号
     */
    private String accountNo;

    /**
     * 登陆名
     */
    private String loginName;

    /**
     *支付金额(单位：分)
     */
    private String payAmt;

    /**
     * 请求支付日期
     */
    private Date payReqDate;

    /**
     * 请求支付流水
     */
    private String payReqNo;

    /**
     * 支付响应日期
     */
    private Date payRespDate;

    /**
     * 支付响应流水
     */
    private String payRespNo;

    /**
     * 支付响应码
     */
    private String payRespCode;

    /**
     * 支付响应描述
     */
    private String payRespDesc;

    /**
     * 支付状态
     * REQ-支付请求；
     SUC-支付成功；
     FAIL-支付失败；
     */
    private String payStatus;

    /**
     * 支付机构代码
     * AILPAY-支付宝；
     TENPAY-财付通；
     BALANCE-余额支付；
     */
    private String payOrgCode;

    /**
     * 前台通知地址
     */
    private String pgUrl;

    /**
     * 后台通知地址
     */
    private String bgUrl;

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
