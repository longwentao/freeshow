package com.freeshow.service.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * 用户登陆响应信息
 * Created by Mac Zhang on 14-11-3 下午6:00
 */
@ToString
@Getter
@Setter
public class LoginResDTO implements Serializable {
    private static final long serialVersionUID = 1533548336804310390L;

    /**
     * 登陆信息响应DTO
     */
    private LoginInfoResDTO loginInfoResDTO;

    /**
     * 客户账户响应DTO
     */
    private AccResDTO accResDTO;

    /**
     * 客户信息响应DTO
     */
    private CustomerResDTO customerResDTO;

}
