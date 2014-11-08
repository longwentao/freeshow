package com.freeshow.service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 登陆状态枚举
 * Created by Mac Zhang on 14-11-8 下午6:14
 */
@Getter
@AllArgsConstructor
public enum LoginInfoStatus {
    W("W", "待激活"),
    N("N", "已激活"),;

    private String code;
    private String desc;
}
