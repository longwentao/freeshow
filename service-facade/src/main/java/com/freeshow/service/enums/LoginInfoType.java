package com.freeshow.service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 登陆类型枚举
 * Created by Mac Zhang on 14-11-8 下午6:14
 */
@Getter
@AllArgsConstructor
public enum LoginInfoType {
    NICK("N", "昵称"),
    EMAIL("E", "邮箱"),
    MOBILE("M", "手机");

    private String code;
    private String desc;
}
