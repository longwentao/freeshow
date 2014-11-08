package com.freeshow.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 机构客户 DO
 * Created by Mac Zhang on 14-11-7 下午22:00
 */
@Getter
@Setter
@ToString
public class CustomerOrgDO implements Serializable{

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
     * 组织机构代码
     */
    private String orgCode;

    /**
     * 法人标志
     * Y-法人
     N-非法人
     */
    private String legalFlg;

    /**
     * 一般纳税人
     * Y-是一般纳税人；N-非一般纳税人
     */
    private String genrTaxFlg;

    /**
     * 客户类型
     */
    private String orgTpCd;

    /**
     * 行业类别
     */
    private String trdTpCd;

    /**
     * 经济性质
     */
    private String industryTpCd;

    /**
     * 注册国家
     */
    private String regRgnTpCd;

    /**
     * 营业国家
     */
    private String busRgnTpCd;

    /**
     * 所在省份/州
     * 营业所在地区(省)
     */
    private String provinceTpCd;

    /**
     *所在城市
     */
    private String cityCode;

    /**
     * 注册地址
     */
    private String regAddress;

    /**
     * 注册地址邮编
     */
    private String regAddressPost;

    /**
     * 营业地址
     */
    private String runAddress;

    /**
     * 营业地址邮编
     */
    private String runAddressPost;

    /**
     * 法人代表客户号
     */
    private String corpCustomerNo;

    /**
     * 主营业务
     */
    private String mainOper;

    /**
     * 兼营业务
     */
    private String partOper;

    /**
     * 营业执照开业日期
     */
    private Date licenseBeginDate;

    /**
     * 营业执照到期日
     */
    private Date licenseEndDate;

    /**
     * 开业日期
     */
    private Date openDate;

    /**
     *清盘日期
     */
    private Date orgWindDate;

    /**
     * 清算完毕日期
     */
    private Date liqEndDate;

    /**
     * 结业日期
     */
    private Date closeDate;

    /**
     * 破产宣告日
     */
    private Date orgSuspDate;

    /**
     * 主管单位名称
     */
    private String mgrUnit;

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
