package com.freeshow.service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 客户账户状态枚举
 * Created by Mac Zhang on 14-11-8 下午6:14
 */
@Getter
@AllArgsConstructor
public enum AccountStatus {
    NORMAL("N", "正常"),
    FREEZE("F", "冻结"),
    CLOSE("C", "销户"),
    NO_ENABLE("NE", "未激活"),;

    private String code;
    private String desc;
}
