package com.freeshow.service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 注册渠道枚举
 * Created by Mac Zhang on 14-11-8 下午6:56
 */
@Getter
@AllArgsConstructor
public enum RegisterChannel {
    WEB("WEB", "网站用户注册"),
    WAP("WAP", "手机浏览器"),
    APP("APP", "App用户注册"),
    OTHER("OTH", "销户");

    private String code;
    private String desc;
}
