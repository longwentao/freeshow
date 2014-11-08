package com.freeshow.mapper;

import com.freeshow.models.OrderDetailDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单明细持久层 Mapper
 * Created by Mac Zhang on 14-11-7 下午22:00
 */
public interface OrderDetailMapper {

    /**
     * 插入订单明细
     * @param orderDetailDO 订单明细 DO
     * @return 数据库执行条数
     */
    int insert(OrderDetailDO orderDetailDO);

    /**
     * 根据 订单号、订单请求流水 查询订单明细
     * @param orderNo 订单号
     * @param orderReqNo 订单请求流水
     * @return 订单明细
     */
    OrderDetailDO selectByOrderReqNo(@Param("orderNo") String orderNo,
                                   @Param("orderReqNo") String orderReqNo);

    /**
     * 查询订单明细集合
     * @param orderDetailDO 订单明细
     * @return 订单明细集
     */
    List<OrderDetailDO> selectByOrderReqNo(OrderDetailDO orderDetailDO);

    /**
     * 更新订单明细
     * @param orderDetailDO 订单明细 DO
     * @return 数据库执行条数
     */
    int update(OrderDetailDO orderDetailDO);

}
