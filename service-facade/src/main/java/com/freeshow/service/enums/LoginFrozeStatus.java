package com.freeshow.service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 登陆冻结状态枚举
 * Created by Mac Zhang on 14-11-8 下午6:14
 */
@Getter
@AllArgsConstructor
public enum LoginFrozeStatus {
    YES("Y", "登录冻结，不允许登录"),
    NO("N", "未冻结，允许登录");

    private String code;
    private String desc;
}
