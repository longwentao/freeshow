package com.freeshow.service;

import com.freeshow.Response;
import com.freeshow.service.models.CustomerAuthReqDTO;
import com.freeshow.service.models.CustomerCreateReqDTO;
import com.freeshow.service.models.CustomerQueryReqDTO;
import com.freeshow.service.models.CustomerResDTO;

/**
 * 客户信息 Facade
 * Created by Mac Zhang on 14-11-3 下午6:00
 */
public interface CustomerFacade {
    /**
     * 创建客户
     * @param reqDTO 请求信息
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 客户号
     */
    Response<String> createCustomer(CustomerCreateReqDTO reqDTO, String traceLogId);


    /**
     * 查询客户信息
     * @param reqDTO 请求信息
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 客户信息
     */
    Response<CustomerResDTO> queryCustomer(CustomerQueryReqDTO reqDTO, String traceLogId);

    /**
     * 客户认证
     * @param reqDTO 请求信息
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 认证是否成功
     */
    Response<Boolean> authCustomer(CustomerAuthReqDTO reqDTO, String traceLogId);
}
