package com.freeshow.service;

import com.freeshow.Response;
import com.freeshow.service.models.*;

/**
 * 登陆信息 Facade
 * Created by Mac Zhang on 14-11-3 下午6:00
 */
public interface LoginInfoFacade {

    /**
     * 创建登陆信息，一般情况下登陆信息是跟客户创建时一起创建，单独创建登陆
     * 信息只有在机构客户的管理员增加其他类型的登陆信息
     * @param reqDTO 请求信息
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 是否创建成功
     */
    Response<Boolean> createLoginInfo(LoginInfoCreateReqDTO reqDTO, String traceLogId);

    /**
     * 用户登陆
     * @param loginName 登陆名
     * @param loginPwd 登陆密码
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 登陆响应信息
     */
    Response<LoginResDTO> login(String loginName,String loginPwd, String traceLogId);

    /**
     * 查询用户登陆信息
     * @param loginName 登陆名
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 用户登陆响应信息
     */
    Response<LoginInfoResDTO> queryLoginInfo(String loginName, String traceLogId);

    /**
     * 修改登陆密码
     * @param reqDTO 请求信息
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 是否修改成功
     */
    Response<Boolean> modifyLoginPwd(LoginPwdModifyReqDTO reqDTO, String traceLogId);

    /**
     * 修改登陆信息
     * 如：修改昵称、更换图像等等
     * @param reqDTO 请求信息
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 用户登陆信息
     */
    Response<LoginInfoResDTO> modifyLoginInfo(LoginInfoModifyReqDTO reqDTO, String traceLogId);

    /**
     * 冻结登陆号
     * @param loginName 登陆名
     * @param des 冻结描述
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 是否成功
     */
    Response<Boolean> freezeLoginName(String loginName,String des,String traceLogId);

    /**
     * 解冻登陆号
     * @param loginName 登陆名
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 是否成功
     */
    Response<Boolean> unFreezeAcc(String loginName,String traceLogId);
}
