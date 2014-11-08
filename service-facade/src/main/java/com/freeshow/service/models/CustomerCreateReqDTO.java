package com.freeshow.service.models;

import com.freeshow.service.enums.CustomerType;
import com.freeshow.service.enums.LoginInfoRole;
import com.freeshow.service.enums.LoginInfoType;
import com.freeshow.service.enums.RegisterChannel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 创建新客户请求DTO
 * Created by Mac Zhang on 14-11-3 下午6:00
 */
@ToString
@Getter
@Setter
public class CustomerCreateReqDTO implements Serializable {
    private static final long serialVersionUID = 1501548476804310390L;
    /**
     * 客户类型
     * O-ORG 公司
     * P-PERSON 个人
     */
    @NotNull(message = "客户类型不能为空")
    private CustomerType customerType;

    /**
     * 登陆号
     */
    @NotBlank(message = "登陆号不能为空")
    private String loginName;

    /**
     * 登陆号
     */
    @NotBlank(message = "登陆密码不能为空")
    private String loginPwd;

    /**
     * 注册渠道
     WEB-网站用户注册；
     WAP-手机浏览器；
     APP-App用户注册；
     OTHER-其他渠道；
     */
    @NotNull(message = "注册渠道不能为空")
    private RegisterChannel registerChannel;

    /**
     * 用户角色
     * SYS_ADMIN-系统后台管理员
     SYS_AUTH-系统授权人员（后台复核员）
     OPERATOR-普通用户
     ADMIN _OPERATOR-普通用户主管理员
     */
    @NotNull(message = "用户角色不能为空")
    private LoginInfoRole loginInfoRole;


    /**
     * 登陆类型
     NICK-昵称
     EMAIL-邮箱
     MOBILE-手机
     */
    @NotNull(message = "登陆类型不能为空")
    private LoginInfoType loginType;

}
