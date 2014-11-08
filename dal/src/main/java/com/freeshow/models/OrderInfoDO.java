package com.freeshow.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单信息 DO
 * Created by Mac Zhang on 14-11-7 下午22:00
 */
@Getter
@Setter
@ToString
public class OrderInfoDO implements Serializable{

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
     * 客户账户模板编号
     */
    private String mpeAccNo;

    /**
     * 订单编号 可以重复
     */
    private String orderNo;

    /**
     * 订单请求流水号 整个系统唯一
     */
    private String orderReqNo;

    /**
     * 订单日期
     */
    private String orderDate;

    /**
     * 订单状态
     * REQ-请求；
     SUC-成功；
     FAIL失败;
     */
    private String orderStatus;

    /**
     * 订单总金额(单位：分)
     */
    private String totalAmt;

    /**
     * 附加金额(单位：分)
     */
    private String attachAmt;

    /**
     * 币种:默认 人民币
     */
    private String curType;

    /**
     * 订单有效期截止时间
     */
    private Date orderValidityTime;

    /**
     * 订单附加信息
     */
    private String attachMsg;

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
