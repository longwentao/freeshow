package com.freeshow.service;

import com.freeshow.Response;
import com.freeshow.manager.exception.FreeShowException;
import com.freeshow.manager.util.VerifyUtil;
import com.freeshow.service.enums.BussErrorCode;
import com.freeshow.service.models.*;
import com.google.common.base.Throwables;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.slf4j.Marker;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

/**
 * 登陆信息 service
 * Created by Mac Zhang on 14-11-8 下午5:09
 */
@Service
@Slf4j
public class LoginInfoFacadeImpl implements LoginInfoFacade {
    @Override
    public Response<Boolean> createLoginInfo(LoginInfoCreateReqDTO reqDTO, String traceLogId) {
        MDC.put(Marker.ANY_MARKER, traceLogId);
        log.info("call createLoginInfo, PARAMETER: {}, {}", reqDTO, traceLogId);
        Response<Boolean> response = new Response<Boolean>();
        try {
            //参数校验
            VerifyUtil.validateObject(reqDTO);

            log.info("success to createLoginInfo, RESULT: {} {}", response,traceLogId);
        } catch (FreeShowException e) {
            response.setErrorCode(e.getCode());
            response.setErrorMsg(e.getMessage());
            log.error("failed to createLoginInfo, PARAMETER: {} {}, RESULT: {}",
                    reqDTO, traceLogId, response);
        } catch (DataAccessException e) {
            response.setErrorCode(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to createLoginInfo, PARAMETER:{} {}, CAUSE:{}",
                    reqDTO, traceLogId, Throwables.getStackTraceAsString(e));
        }catch (Exception e) {
            response.setErrorCode(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to createLoginInfo, PARAMETER:{} {}, CAUSE:{}",
                    reqDTO, traceLogId, Throwables.getStackTraceAsString(e));
        }
        return response;
    }

    @Override
    public Response<LoginResDTO> login(String loginName, String loginPwd, String traceLogId) {
        MDC.put(Marker.ANY_MARKER, traceLogId);
        log.info("call login, PARAMETER: {},{}, {}", loginName,loginPwd, traceLogId);
        Response<LoginResDTO> response = new Response<LoginResDTO>();
        try {
            //参数校验
            VerifyUtil.validateNotBlank(loginName,"登陆名不能为空");
            VerifyUtil.validateNotBlank(loginPwd,"登陆密码不能为空");

            log.info("success to login, RESULT: {} {}", response,traceLogId);
        } catch (FreeShowException e) {
            response.setErrorCode(e.getCode());
            response.setErrorMsg(e.getMessage());
            log.error("failed to login, PARAMETER: {} {} {}, RESULT: {}",
                    loginName,loginPwd, traceLogId, response);
        } catch (DataAccessException e) {
            response.setErrorCode(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to login, PARAMETER:{} {} {}, CAUSE:{}",
                    loginName,loginPwd,  traceLogId, Throwables.getStackTraceAsString(e));
        }catch (Exception e) {
            response.setErrorCode(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to login, PARAMETER:{} {} {}, CAUSE:{}",
                    loginName,loginPwd, traceLogId, Throwables.getStackTraceAsString(e));
        }
        return response;
    }

    @Override
    public Response<LoginInfoResDTO> queryLoginInfo(String loginName, String traceLogId) {
        MDC.put(Marker.ANY_MARKER, traceLogId);
        log.info("call queryLoginInfo, PARAMETER: {},{}, {}", loginName, traceLogId);
        Response<LoginInfoResDTO> response = new Response<LoginInfoResDTO>();
        try {
            //参数校验
            VerifyUtil.validateNotBlank(loginName,"登陆名不能为空");

            log.info("success to queryLoginInfo, RESULT: {} {}", response,traceLogId);
        } catch (FreeShowException e) {
            response.setErrorCode(e.getCode());
            response.setErrorMsg(e.getMessage());
            log.error("failed to queryLoginInfo, PARAMETER: {}  {}, RESULT: {}",
                    loginName, traceLogId, response);
        } catch (DataAccessException e) {
            response.setErrorCode(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to queryLoginInfo, PARAMETER:{} {}, CAUSE:{}",
                    loginName,  traceLogId, Throwables.getStackTraceAsString(e));
        }catch (Exception e) {
            response.setErrorCode(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to queryLoginInfo, PARAMETER:{} {}, CAUSE:{}",
                    loginName, traceLogId, Throwables.getStackTraceAsString(e));
        }
        return response;
    }

    @Override
    public Response<Boolean> modifyLoginPwd(LoginPwdModifyReqDTO reqDTO, String traceLogId) {
        MDC.put(Marker.ANY_MARKER, traceLogId);
        log.info("call modifyLoginPwd, PARAMETER: {}, {}", reqDTO, traceLogId);
        Response<Boolean> response = new Response<Boolean>();
        try {
            //参数校验
            VerifyUtil.validateObject(reqDTO);

            log.info("success to modifyLoginPwd, RESULT: {} {}", response,traceLogId);
        } catch (FreeShowException e) {
            response.setErrorCode(e.getCode());
            response.setErrorMsg(e.getMessage());
            log.error("failed to modifyLoginPwd, PARAMETER: {} {}, RESULT: {}",
                    reqDTO, traceLogId, response);
        } catch (DataAccessException e) {
            response.setErrorCode(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to modifyLoginPwd, PARAMETER:{} {}, CAUSE:{}",
                    reqDTO, traceLogId, Throwables.getStackTraceAsString(e));
        }catch (Exception e) {
            response.setErrorCode(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to modifyLoginPwd, PARAMETER:{} {}, CAUSE:{}",
                    reqDTO, traceLogId, Throwables.getStackTraceAsString(e));
        }
        return response;
    }

    @Override
    public Response<LoginInfoResDTO> modifyLoginInfo(LoginInfoModifyReqDTO reqDTO, String traceLogId) {
        MDC.put(Marker.ANY_MARKER, traceLogId);
        log.info("call modifyLoginInfo, PARAMETER: {}, {}", reqDTO, traceLogId);
        Response<LoginInfoResDTO> response = new Response<LoginInfoResDTO>();
        try {
            //参数校验
            VerifyUtil.validateObject(reqDTO);

            log.info("success to modifyLoginInfo, RESULT: {} {}", response,traceLogId);
        } catch (FreeShowException e) {
            response.setErrorCode(e.getCode());
            response.setErrorMsg(e.getMessage());
            log.error("failed to modifyLoginInfo, PARAMETER: {} {}, RESULT: {}",
                    reqDTO, traceLogId, response);
        } catch (DataAccessException e) {
            response.setErrorCode(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to modifyLoginInfo, PARAMETER:{} {}, CAUSE:{}",
                    reqDTO, traceLogId, Throwables.getStackTraceAsString(e));
        }catch (Exception e) {
            response.setErrorCode(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to modifyLoginInfo, PARAMETER:{} {}, CAUSE:{}",
                    reqDTO, traceLogId, Throwables.getStackTraceAsString(e));
        }
        return response;
    }

    @Override
    public Response<Boolean> freezeLoginName(String loginName, String des, String traceLogId) {
        MDC.put(Marker.ANY_MARKER, traceLogId);
        log.info("call freezeLoginName, PARAMETER: {},{}, {}", loginName,des, traceLogId);
        Response<Boolean> response = new Response<Boolean>();
        try {
            //参数校验
            VerifyUtil.validateNotBlank(loginName,"登陆名不能为空");
            VerifyUtil.validateNotBlank(des,"冻结描述不能为空");

            log.info("success to freezeLoginName, RESULT: {} {}", response,traceLogId);
        } catch (FreeShowException e) {
            response.setErrorCode(e.getCode());
            response.setErrorMsg(e.getMessage());
            log.error("failed to freezeLoginName, PARAMETER: {} {} {}, RESULT: {}",
                    loginName,des, traceLogId, response);
        } catch (DataAccessException e) {
            response.setErrorCode(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to freezeLoginName, PARAMETER:{} {} {}, CAUSE:{}",
                    loginName,des,  traceLogId, Throwables.getStackTraceAsString(e));
        }catch (Exception e) {
            response.setErrorCode(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to freezeLoginName, PARAMETER:{} {} {}, CAUSE:{}",
                    loginName,des, traceLogId, Throwables.getStackTraceAsString(e));
        }
        return response;
    }

    @Override
    public Response<Boolean> unFreezeAcc(String loginName, String traceLogId) {
        MDC.put(Marker.ANY_MARKER, traceLogId);
        log.info("call unFreezeAcc, PARAMETER: {},{}, {}", loginName, traceLogId);
        Response<Boolean> response = new Response<Boolean>();
        try {
            //参数校验
            VerifyUtil.validateNotBlank(loginName,"登陆名不能为空");

            log.info("success to unFreezeAcc, RESULT: {} {}", response,traceLogId);
        } catch (FreeShowException e) {
            response.setErrorCode(e.getCode());
            response.setErrorMsg(e.getMessage());
            log.error("failed to unFreezeAcc, PARAMETER: {}  {}, RESULT: {}",
                    loginName, traceLogId, response);
        } catch (DataAccessException e) {
            response.setErrorCode(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to unFreezeAcc, PARAMETER:{} {}, CAUSE:{}",
                    loginName,  traceLogId, Throwables.getStackTraceAsString(e));
        }catch (Exception e) {
            response.setErrorCode(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to unFreezeAcc, PARAMETER:{} {}, CAUSE:{}",
                    loginName, traceLogId, Throwables.getStackTraceAsString(e));
        }
        return response;
    }
}
