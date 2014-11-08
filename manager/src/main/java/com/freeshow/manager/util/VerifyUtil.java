package com.freeshow.manager.util;

import com.freeshow.manager.exception.FreeShowException;
import com.freeshow.service.enums.BussErrorCode;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.hibernate.validator.internal.util.Contracts;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;


/**
 * 请求参数验证工具类
 * Created by Mac Zhang on 14-11-8 下午5:22
 */
@Slf4j
public class VerifyUtil {
    private final static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    /**
     * 字符串验证是否为空字符串
     * @param parameter 请求参数
     * @param message  错误描述
     */
    public static void validateNotBlank(String parameter,String message){
        if (StringUtils.isBlank(parameter)) {
            throw new FreeShowException(BussErrorCode.INVALID_PARAMETERS.getErrorCode(),message);
        }
    }

    /**
     * 对象验证是否为空
     * @param parameter 请求参数
     * @param message  错误描述
     */
    public static void validateNotNull(Object parameter,String message){
        if (null == parameter) {
            throw new FreeShowException(BussErrorCode.INVALID_PARAMETERS.getErrorCode(),message);
        }
    }

    /**
     * 单个字符串，指定错误描述 参数验证
     * @param parameter 请求参数
     * @param message  错误描述
     */
    public static void checkNotNull(Object parameter,String message){
        try {
            Contracts.assertNotNull(parameter, message);
        }catch (IllegalArgumentException e){
            throw new FreeShowException(BussErrorCode.INVALID_PARAMETERS.getErrorCode(),message);
        }
    }

    /**
     * 请求参数非空、格式验证，请求对象
     * @param object 请求校验参数
     */
    public static void validateObject(Object object){
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Object>> violations = validator.validate(object);
        if (violations.size() == 0) return;
        for (ConstraintViolation<Object> violation : violations)
            throw new FreeShowException(BussErrorCode.INVALID_PARAMETERS.getErrorCode(), violation.getMessage());
    }

    /**
     * 请求参数校验 指定属性
     * @param object 请求校验参数
     */
    public static void validateProperty(Object object,String... propertys){
        Validator validator = factory.getValidator();
        for (String property:propertys){
            Set<ConstraintViolation<Object>> violations = validator.validateProperty(object,property);
            if (violations.size() == 0)  continue;

            for (ConstraintViolation<Object> violation : violations)
                throw new FreeShowException(BussErrorCode.INVALID_PARAMETERS.getErrorCode(), violation.getMessage());
        }
    }

}


