package com.freeshow.service.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * 客户账户支付密码修改请求DTO
 * Created by Mac Zhang on 14-11-3 下午6:00
 */
@ToString
@Getter
@Setter
public class AccPayPwdModifyReqDTO implements Serializable {
    private static final long serialVersionUID = 1509248355804310390L;

    /**
     * 登陆名
     */
    @NotBlank(message = "登陆名不能为空")
    private String loginName;

    /**
     * 客户账户
     */
    @NotBlank(message = "客户账户不能为空")
    private String accountNo;

    /**
     * 原支付密码
     */
    @NotBlank(message = "原支付密码不能为空")
    private String oldPayPwd;

    /**
     * 新支付密码
     */
    @NotBlank(message = "新支付密码不能为空")
    private String newPayPwd;

    /**
     * 更新人
     */
    private String updatedBy = loginName;
}
