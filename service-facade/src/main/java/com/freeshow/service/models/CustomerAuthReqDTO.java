package com.freeshow.service.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * 创建新客户请求DTO
 * Created by Mac Zhang on 14-11-3 下午6:00
 */
@ToString
@Getter
@Setter
public class CustomerAuthReqDTO implements Serializable {
    private static final long serialVersionUID = 1321548476804310390L;
    /**
     * 客户类型
     * O-ORG 公司
     * P-PERSON 个人
     */
    @NotBlank(message = "客户类型不能为空")
    private String customerType;

    /**
     * 登陆号
     */
    @NotBlank(message = "登陆号不能为空")
    private String loginName;

    /**
     * 注册渠道
     * WEB-网站用户注册
     * APP-App用户注册
     * OTHER-其他渠道
     * STATIION-电信营业厅
     */
    @NotBlank(message = "注册渠道不能为空")
    private String regChannel;

    /**
     * 数据来源
     * 电信用户注册
     * 自然流入
     */
    @NotBlank(message = "数据来源不能为空")
    private String dataSourceType;

    /**
     * 证件类型
     */
    @NotBlank(message = "证件类型不能为空")
    private String certificateType;

    /**
     * 证件号
     */
    @NotBlank(message = "证件号不能为空")
    private String certificateNo;

    /**
     * 客户名称
     */
    @NotBlank(message = "客户名称不能为空")
    private String customerName;

    /**
     * 登陆类型
     * EMAIL-邮箱
     * Mobile-手机
     * NICK-昵称
     */
    @NotBlank(message = "登陆类型不能为空")
    private String loginType;

    /**
     * 登陆密码
     */
    @NotBlank(message = "登陆密码不能为空")
    private String loginPwd;

    /**
     * 支付密码
     */
    @NotBlank(message = "支付密码不能为空")
    private String payPassword;


    /**
     * 职业
     */
    @NotBlank(message = "职业不能为空")
    private String occupation;

    /**
     * 证件有效期
     */
    @NotBlank(message = "证件有效期不能为空")
    private String certExpiryDate;

    /**
     * 性别
     */
    private String gender;

    /**
     * 国籍
     */
    private String citizenshipTpCd;

    /**
     * 地址类型
     * AddressType {
     HOME("HOME", "家庭"),
     OFFICE("OFFICE", "办公室"),
     OTHER("OTHER", "其他");}
     */
    private String addressType;

    /**
     * 联系地址
     */
    private String contractAddress;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 区域
     */
    @Getter
    @Setter
    private String areaCode;

    /**
     * 城市
     */
    @Getter
    @Setter
    private String cityCode;

    /**
     * 创建人编号
     */
    @NotBlank(message = "创建操作员不能为空")
    private String createdBy;

    /**
     * 最后更新人编号
     */
    @NotBlank(message = "最后更新操作员不能为空")
    private String updatedBy;

    /**
     * 密码密钥
     */
    private String pinKey;

    /**
     * 密钥索引
     */
    private String pinSeq;

    /**
     * 卡号或卡bin(只有银商号码支付对此字段有特殊处理，其他一律填卡号)
     */
    private String cardBin;

    //以下字段未确认是否需要----------------------------------------------------------------------

    /**
     * 客户等级
     */
    private String customerGrade;

    /**
     * 操作员控制类型
     * Master-主操作员
     * CONNECT-关联操作员
     * Single-独立操作员
     */
    private String operatorCtrl;

    /**
     * 操作员角色
     * ADMIN-管理员
     * OPEN-开户操作员
     * OPERATOR-普通操作员
     * AUTH-授权人员（复核员）
     */
    private String operatorRole;

    /**
     * 登录权限范围
     * USER-用户前台
     * SYS-系统内部
     * WORK-工作平台
     */
    private String loginRightRange;

    /**
     * 账号类型
     * DR-借记类账户
     * CR-贷记类账户
     */
    private String contractType;

//    /**
//     * 产品线
//     */
//    @Getter
//    @Setter
//    private String prodLine;

    /**
     * 余额支付开通标识
     * Y-开通
     * N-不开通
     */
    private String balPayFlg;

    /**
     * 电信统一账户
     */
    private String teleUnionNo;

    /**
     * 账户类型
     */
    private String accountType;

    /**
     * 脱机卡号，全开户时使用
     */
    private String cardNo;


}
