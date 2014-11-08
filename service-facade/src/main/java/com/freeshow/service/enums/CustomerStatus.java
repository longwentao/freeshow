package com.freeshow.service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 客户状态枚举
 * Created by Mac Zhang on 14-11-8 下午6:14
 */
@Getter
@AllArgsConstructor
public enum CustomerStatus {
    NORMAL("N", "正常客户"),
    CLOSE("C", "销户"),;

    private String code;
    private String desc;
}
