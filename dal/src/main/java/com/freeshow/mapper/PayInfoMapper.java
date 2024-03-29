package com.freeshow.mapper;

import com.freeshow.models.PayDetailDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单支付信息持久层 Mapper
 * Created by Mac Zhang on 14-11-7 下午22:00
 */
public interface PayInfoMapper {

    /**
     * 插入订单支付信息
     * @param payDetailDO 订单支付信息 DO
     * @return 数据库执行条数
     */
    int insert(PayDetailDO payDetailDO);

    /**
     * 根据 订单号、订单请求流水 查询订单支付信息
     * @param orderNo 订单号
     * @param orderReqNo 订单请求流水
     * @return 订单支付信息
     */
    PayDetailDO selectByOrderReqNo(@Param("orderNo") String orderNo,
                                   @Param("orderReqNo") String orderReqNo);

    /**
     * 查询订单支付信息集合
     * @param payDetailDO 订单支付信息
     * @return 订单支付信息集
     */
    List<PayDetailDO> selectByOrderReqNo(PayDetailDO payDetailDO);

    /**
     * 更新订单支付信息
     * @param payDetailDO 订单支付信息 DO
     * @return 数据库执行条数
     */
    int update(PayDetailDO payDetailDO);

}
