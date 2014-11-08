package com.freeshow.service;

import com.freeshow.Response;
import com.freeshow.service.models.OrderCreateReqDTO;
import com.freeshow.service.models.OrderQueryReqDTO;
import com.freeshow.service.models.OrderResDTO;

/**
 * 订单服务接口
 * Created by Mac Zhang on 14-11-3 下午6:00
 */
public interface OrderInfoFacade {

    /**
     * 创建订单
     * @param reqDto 请求信息
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 订单请求流水号
     */
    Response<String> createOrder(OrderCreateReqDTO reqDto, String traceLogId);

    /**
     * 查询订单
     * @param reqDto 请求信息
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 订单信息
     */
    Response<OrderResDTO> queryOrder(OrderQueryReqDTO reqDto, String traceLogId);
}
