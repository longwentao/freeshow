package com.freeshow.manager.exception;

import lombok.Getter;

/**
 * 公共异常封装类
 * Created by Mac Zhang on 14-11-7 下午22:00
 */
public class FreeShowException extends RuntimeException{

    @Getter
    private String code;

    public FreeShowException(String code) {
        this.code = code;
    }

    public FreeShowException(String code, Throwable throwable) {
        super(throwable);
        this.code = code;
    }

    public FreeShowException(String code, String message) {
        super(message);
        this.code = code;
    }

    public FreeShowException(String code, String message, String addStr) {
        super(addStr + message);
        this.code = code;
    }

    public FreeShowException(String code, String message, Throwable throwable) {
        super(message, throwable);
        this.code = code;
    }
}
