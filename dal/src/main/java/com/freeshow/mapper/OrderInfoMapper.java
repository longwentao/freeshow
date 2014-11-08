package com.freeshow.mapper;

import com.freeshow.models.OrderInfoDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单信息持久层 Mapper
 * Created by Mac Zhang on 14-11-7 下午22:00
 */
public interface OrderInfoMapper {

    /**
     * 插入订单信息
     * @param orderInfoDO 订单信息 DO
     * @return 数据库执行条数
     */
    int insert(OrderInfoDO orderInfoDO);

    /**
     * 根据 订单号、订单请求流水 查询订单信息
     * @param orderNo 订单号
     * @param orderReqNo 订单请求流水
     * @return 订单信息
     */
    OrderInfoDO selectByOrderReqNo(@Param("orderNo") String orderNo,
                                   @Param("orderReqNo") String orderReqNo);

    /**
     * 查询订单信息集合
     * @param orderInfoDO 订单信息
     * @return 订单信息集
     */
    List<OrderInfoDO> selectByOrderReqNo(OrderInfoDO orderInfoDO);

    /**
     * 更新订单信息
     * @param orderInfoDO 订单信息 DO
     * @return 数据库执行条数
     */
    int update(OrderInfoDO orderInfoDO);

}
