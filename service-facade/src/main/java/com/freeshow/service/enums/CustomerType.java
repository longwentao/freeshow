package com.freeshow.service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 客户类型枚举
 * Created by Mac Zhang on 14-11-8 下午6:14
 */
@Getter
@AllArgsConstructor
public enum CustomerType {
    ORG("O", "公司/组织"),
    PERSON("P", "个人");

    private String code;
    private String desc;
}
