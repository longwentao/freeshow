package com.freeshow.service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 错误码管理类
 * Created by Mac Zhang on 14-11-3 下午6:00
 */
@Getter
@AllArgsConstructor
public enum BussErrorCode {

    /** 业务调用成功 */
    SUCCESS("SUCCESS", "业务调用成功"),

    /** 业务流水已存在 */
    BUS_REQ_EXISTED("BUS_REQ_EXISTED", "业务流水已存在--"),

    /** 对象已存在 */
    OBJECT_EXISTED("OBJECT_EXISTED", "已存在--"),

    /** 对象不存在 */
    OBJECT_NOT_EXIST("OBJECT_NOT_EXIST", "不存在--"),

    /** 参数校验不通过 */
    INVALID_PARAMETERS("INVALID_PARAMETERS", "参数校验不通过--"),

    /** 内部系统处理异常 */
    INTERNAL_PROCESS_EXCEPTION("INTERNAL_PROCESS_EXCEPTION", "内部系统处理异常"),

    /** 查询对象不存在 */
    QUERY_OBJECT_NOT_EXISTED("QUERY_OBJECT_NOT_EXISTED", "查询对象不存在--"),

    /** 数据录入失败 */
    DATABASE_ENTERING_FAILED("DATABASE_ENTERING_FAILED", "数据录入失败"),

    /** 数据更新失败 */
    DATABASE_UPDATE_FAILED("DATABASE_UPDATE_FAILED", "数据更新失败"),

    /** 数据库处理异常 */
    DATABASE_PROCESS_EXCEPTION("DATABASE_PROCESS_EXCEPTION", "数据库处理异常");

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误描述
     */
    private String errorMsg;


}
