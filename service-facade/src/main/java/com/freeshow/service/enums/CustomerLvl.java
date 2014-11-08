package com.freeshow.service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 客户成长级别枚举
 * Created by Mac Zhang on 14-11-8 下午6:14
 */
@Getter
@AllArgsConstructor
public enum CustomerLvl {
    NORMAL_1("N1", "普通一级"),
    NORMAL_2("N2", "普通二级"),
    NORMAL_3("N3", "普通三级"),
    VIP_1("N", "高级一级"),
    VIP_2("N", "高级二级"),
    VIP_3("N", "高级三级");

    private String code;
    private String desc;
}
