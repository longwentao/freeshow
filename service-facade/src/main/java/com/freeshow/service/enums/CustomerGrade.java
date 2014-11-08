package com.freeshow.service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 客户角色枚举
 * Created by Mac Zhang on 14-11-8 下午6:14
 */
@Getter
@AllArgsConstructor
public enum CustomerGrade {
    NORMAL("N", "普通"),
    VIP("V", "高级"),;

    private String code;
    private String desc;
}
