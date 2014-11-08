package com.freeshow.service;

import com.freeshow.Response;
import com.freeshow.service.models.*;

/**
 * 登陆信息服务接口
 * Created by Mac Zhang on 14-11-3 下午6:00
 */
public interface LoginInfoFacade {

    /**
     * 创建登陆信息，一般情况下登陆信息是跟客户创建时一起创建，单独创建登陆
     * 信息只有在机构客户的管理员增加其他类型的登陆信息
     * @param reqDto 请求信息
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 是否创建成功
     */
    Response<Boolean> createLoginInfo(LoginInfoCreateReqDTO reqDto, String traceLogId);

    /**
     * 用户登陆
     * @param loginNo 登陆号
     * @param loginPwd 登陆密码
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 登陆响应信息
     */
    Response<LoginResDTO> login(String loginNo,String loginPwd, String traceLogId);

    /**
     * 查询用户登陆信息
     * @param loginNo 登陆号
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 用户登陆响应信息
     */
    Response<LoginInfoResDTO> queryLoginInfo(String loginNo, String traceLogId);

    /**
     * 修改登陆密码
     * @param loginNo 登陆号
     * @param oldLoginPwd 原登陆密码
     * @param newLoginPwd 新登陆密码
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 是否修改成功
     */
    Response<Boolean> modifyLoginPwd(String loginNo,String oldLoginPwd,String newLoginPwd, String traceLogId);

    /**
     * 修改登陆信息
     * 如：修改昵称、更换图像等等
     * @param reqDTO 请求信息
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 用户登陆信息
     */
    Response<LoginInfoResDTO> modifyLoginInfo(LoginInfoModifyReqDTO reqDTO, String traceLogId);

    /**
     * 冻结登陆信息
     * @param loginNo 登陆号
     * @param des 冻结描述
     * @param traceLogId 日志跟踪id
     * @return success是否成功，失败取errorCode和errorMsg,成功取result 是否成功
     */
    Response<Boolean> freezeLoginInfo(String loginNo,String des,String traceLogId);
}
