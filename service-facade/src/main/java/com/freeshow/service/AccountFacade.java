package com.freeshow.service;

import com.freeshow.Response;
import com.freeshow.service.models.AccPayReqDTO;
import com.freeshow.service.models.AccRechargeReqDTO;
import com.freeshow.service.models.AccResDTO;

/**
 * 客户账户服务接口
 * Created by Mac Zhang on 14-11-3 下午6:00
 */
public interface AccountFacade {
    /**
     * 查询客户账户信息
     * @param accountNo 客户账户号
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 客户账户信息
     */
    Response<AccResDTO> queryAcc(String accountNo, String traceLogId);

    /**
     * 客户账户支付
     * @param reqDTO 客户账户充值请求信息
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 支付是否成功
     */
    Response<Boolean> pay(AccPayReqDTO reqDTO,String traceLogId);

    /**
     * 客户账户充值
     * @param reqDTO 客户账户充值请求信息
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 充值是否成功
     */
    Response<Boolean> recharge(AccRechargeReqDTO reqDTO,String traceLogId);

    /**
     * 客户账户支付密码鉴权
     * @param loginNo 登陆号
     * @param accountNo 客户账户号
     * @param payPwd 支付密码
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 鉴权是否成功
     */
    Response<Boolean> checkAccPayPwd(String loginNo,String accountNo,String payPwd, String traceLogId);

    /**
     * 修改客户账户支付密码
     * @param loginNo 登陆号
     * @param accountNo 客户账户号
     * @param oldPayPwd 原支付密码
     * @param newPayPwd 新支付密码
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 是否成功
     */
    Response<Boolean> modifyAccPayPwd(String loginNo,String accountNo,String oldPayPwd,String newPayPwd, String traceLogId);

    /**
     * 冻结账户
     * @param loginNo 登陆号
     * @param accountNo 客户账户号
     * @param des 冻结描述
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 是否成功
     */
    Response<Boolean> freezeAcc(String loginNo,String accountNo,String des,String traceLogId);
}
