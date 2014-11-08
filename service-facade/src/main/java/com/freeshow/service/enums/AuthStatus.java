package com.freeshow.service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 客户认证状态枚举
 * Created by Mac Zhang on 14-11-8 下午6:14
 */
@Getter
@AllArgsConstructor
public enum AuthStatus {
    YES("Y", "已认证"),
    NO("N", "未认证"),;

    private String code;
    private String desc;
}
