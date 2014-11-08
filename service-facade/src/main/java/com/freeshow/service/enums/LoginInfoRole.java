package com.freeshow.service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 登陆类型枚举
 * Created by Mac Zhang on 14-11-8 下午6:14
 */
@Getter
@AllArgsConstructor
public enum LoginInfoRole {
    SYS_ADMIN("SAM", "系统后台管理员"),
    SYS_AUTH("SAU", "系统授权人员（后台复核员）"),
    OPERATOR("OPE", "普通用户"),
    ADMIN_OPERATOR("AOPE", "普通用户主管理员");

    private String code;
    private String desc;
}
