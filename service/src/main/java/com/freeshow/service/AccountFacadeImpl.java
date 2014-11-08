package com.freeshow.service;

import com.freeshow.Response;
import com.freeshow.manager.AccountManager;
import com.freeshow.manager.exception.FreeShowException;
import com.freeshow.manager.util.VerifyUtil;
import com.freeshow.service.enums.BussErrorCode;
import com.freeshow.service.models.*;
import com.google.common.base.Throwables;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.slf4j.Marker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

/**
 * 客户账户 service
 * Created by Mac Zhang on 14-11-8 下午6:00
 */
@Service
@Slf4j
public class AccountFacadeImpl implements AccountFacade{

    /**
     * 客户账户manager
     */
    @Autowired
    private AccountManager accountManager;

    @Override
    public Response<AccResDTO> queryAcc(String accountNo, String traceLogId) {
        MDC.put(Marker.ANY_MARKER, traceLogId);
        log.info("call queryAcc, PARAMETER: {}, {}", accountNo, traceLogId);
        Response<AccResDTO> response = new Response<AccResDTO>();
        try {
            //参数校验
            VerifyUtil.validateNotBlank(accountNo, "客户账户号不能为空");

            response.setResult(accountManager.queryAcc(accountNo));
            log.info("success to queryAcc, RESULT: {} {}", response,traceLogId);
        } catch (FreeShowException e) {
            response.setErrorCode(e.getCode());
            response.setErrorMsg(e.getMessage());
            log.error("failed to queryAcc, PARAMETER: {} {}, RESULT: {}",
                    accountNo, traceLogId, response);
        } catch (DataAccessException e) {
            response.setErrorCode(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to queryAcc, PARAMETER:{} {}, CAUSE:{}",
                    accountNo, traceLogId, Throwables.getStackTraceAsString(e));
        }catch (Exception e) {
            response.setErrorCode(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to queryAcc, PARAMETER:{} {}, CAUSE:{}",
                    accountNo, traceLogId, Throwables.getStackTraceAsString(e));
        }
        return response;
    }

    @Override
    public Response<Boolean> pay(AccPayReqDTO reqDTO, String traceLogId) {
        MDC.put(Marker.ANY_MARKER, traceLogId);
        log.info("call pay, PARAMETER: {}, {}", reqDTO, traceLogId);
        Response<Boolean> response = new Response<Boolean>();
        try {
            //参数校验
            VerifyUtil.validateObject(reqDTO);

            log.info("success to pay, RESULT: {} {}", response,traceLogId);
        } catch (FreeShowException e) {
            response.setErrorCode(e.getCode());
            response.setErrorMsg(e.getMessage());
            log.error("failed to pay, PARAMETER: {} {}, RESULT: {}",
                    reqDTO, traceLogId, response);
        } catch (DataAccessException e) {
            response.setErrorCode(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to pay, PARAMETER:{} {}, CAUSE:{}",
                    reqDTO, traceLogId, Throwables.getStackTraceAsString(e));
        }catch (Exception e) {
            response.setErrorCode(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to pay, PARAMETER:{} {}, CAUSE:{}",
                    reqDTO, traceLogId, Throwables.getStackTraceAsString(e));
        }
        return response;
    }

    @Override
    public Response<Boolean> recharge(AccRechargeReqDTO reqDTO, String traceLogId) {
        MDC.put(Marker.ANY_MARKER, traceLogId);
        log.info("call recharge, PARAMETER: {}, {}", reqDTO, traceLogId);
        Response<Boolean> response = new Response<Boolean>();
        try {
            //参数校验
            VerifyUtil.validateObject(reqDTO);

            log.info("success to recharge, RESULT: {} {}", response,traceLogId);
        } catch (FreeShowException e) {
            response.setErrorCode(e.getCode());
            response.setErrorMsg(e.getMessage());
            log.error("failed to recharge, PARAMETER: {} {}, RESULT: {}",
                    reqDTO, traceLogId, response);
        } catch (DataAccessException e) {
            response.setErrorCode(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to recharge, PARAMETER:{} {}, CAUSE:{}",
                    reqDTO, traceLogId, Throwables.getStackTraceAsString(e));
        }catch (Exception e) {
            response.setErrorCode(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to recharge, PARAMETER:{} {}, CAUSE:{}",
                    reqDTO, traceLogId, Throwables.getStackTraceAsString(e));
        }
        return response;
    }

    @Override
    public Response<Boolean> checkAccPayPwd(String loginName, String accountNo, String payPwd, String traceLogId) {
        MDC.put(Marker.ANY_MARKER, traceLogId);
        log.info("call checkAccPayPwd, PARAMETER: {}, {} ,{} ,{}", loginName,accountNo,payPwd, traceLogId);
        Response<Boolean> response = new Response<Boolean>();
        try {
            //参数校验
            VerifyUtil.validateNotBlank(loginName,"登陆名不能为空");
            VerifyUtil.validateNotBlank(accountNo,"客户账户不能为空");
            VerifyUtil.validateNotBlank(payPwd, "支付密码不能为空");

            response.setResult(accountManager.checkAccPayPwd(accountNo,payPwd));
            log.info("success to checkAccPayPwd, RESULT: {} {}", response,traceLogId);
        } catch (FreeShowException e) {
            response.setErrorCode(e.getCode());
            response.setErrorMsg(e.getMessage());
            log.error("failed to checkAccPayPwd, PARAMETER: {} {} {} {}, RESULT: {}",
                    loginName,accountNo,payPwd, traceLogId, response);
        } catch (DataAccessException e) {
            response.setErrorCode(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to checkAccPayPwd, PARAMETER:{} {} {} {}, CAUSE:{}",
                    loginName,accountNo,payPwd, traceLogId, Throwables.getStackTraceAsString(e));
        }catch (Exception e) {
            response.setErrorCode(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to checkAccPayPwd, PARAMETER:{} {} {} {}, CAUSE:{}",
                    loginName,accountNo,payPwd, traceLogId, Throwables.getStackTraceAsString(e));
        }
        return response;
    }

    @Override
    public Response<Boolean> modifyAccPayPwd(AccPayPwdModifyReqDTO reqDTO, String traceLogId) {
        MDC.put(Marker.ANY_MARKER, traceLogId);
        log.info("call modifyAccPayPwd, PARAMETER: {},{} ",reqDTO, traceLogId);
        Response<Boolean> response = new Response<Boolean>();
        try {
            //参数校验
            VerifyUtil.validateObject(reqDTO);
            response.setResult(accountManager.modifyAccPayPwd(reqDTO));
            log.info("success to modifyAccPayPwd, RESULT: {} {}", response,traceLogId);
        } catch (FreeShowException e) {
            response.setErrorCode(e.getCode());
            response.setErrorMsg(e.getMessage());
            log.error("failed to modifyAccPayPwd, PARAMETER: {} {}, RESULT: {}",
                    reqDTO, traceLogId, response);
        } catch (DataAccessException e) {
            response.setErrorCode(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to modifyAccPayPwd, PARAMETER:{} {}, CAUSE:{}",
                    reqDTO, traceLogId, Throwables.getStackTraceAsString(e));
        }catch (Exception e) {
            response.setErrorCode(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to modifyAccPayPwd, PARAMETER:{} {}, CAUSE:{}",
                    reqDTO, traceLogId, Throwables.getStackTraceAsString(e));
        }
        return response;
    }

    @Override
    public Response<Boolean> freezeAcc(String loginName, String accountNo, String des, String traceLogId) {
        MDC.put(Marker.ANY_MARKER, traceLogId);
        log.info("call freezeAcc, PARAMETER: {}, {},{},{}", loginName,accountNo,des,traceLogId);
        Response<Boolean> response = new Response<Boolean>();
        try {
            //参数校验
            VerifyUtil.validateNotBlank(loginName,"登陆名不能为空");
            VerifyUtil.validateNotBlank(accountNo,"客户账户不能为空");
            VerifyUtil.validateNotBlank(des, "冻结描述不能为空");

            log.info("success to freezeAcc, RESULT: {} {}", response,traceLogId);
        } catch (FreeShowException e) {
            response.setErrorCode(e.getCode());
            response.setErrorMsg(e.getMessage());
            log.error("failed to freezeAcc, PARAMETER: {} {} {} {}, RESULT: {}",
                    loginName,accountNo,des,traceLogId, response);
        } catch (DataAccessException e) {
            response.setErrorCode(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to freezeAcc, PARAMETER:{} {} {} {}, CAUSE:{}",
                    loginName,accountNo,des,traceLogId, Throwables.getStackTraceAsString(e));
        }catch (Exception e) {
            response.setErrorCode(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to freezeAcc, PARAMETER:{} {} {} {}, CAUSE:{}",
                    loginName,accountNo,des, traceLogId, Throwables.getStackTraceAsString(e));
        }
        return response;
    }

    @Override
    public Response<Boolean> unFreezeAcc(String loginName, String accountNo, String traceLogId) {
        MDC.put(Marker.ANY_MARKER, traceLogId);
        log.info("call unFreezeAcc, PARAMETER: {}, {},{},{}", loginName,accountNo,traceLogId);
        Response<Boolean> response = new Response<Boolean>();
        try {
            //参数校验
            VerifyUtil.validateNotBlank(loginName,"登陆名不能为空");
            VerifyUtil.validateNotBlank(accountNo,"客户账户不能为空");

            log.info("success to unFreezeAcc, RESULT: {} {}", response,traceLogId);
        } catch (FreeShowException e) {
            response.setErrorCode(e.getCode());
            response.setErrorMsg(e.getMessage());
            log.error("failed to unFreezeAcc, PARAMETER: {} {} {}, RESULT: {}",
                    loginName,accountNo,traceLogId, response);
        } catch (DataAccessException e) {
            response.setErrorCode(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to unFreezeAcc, PARAMETER:{} {} {}, CAUSE:{}",
                    loginName,accountNo,traceLogId, Throwables.getStackTraceAsString(e));
        }catch (Exception e) {
            response.setErrorCode(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to unFreezeAcc, PARAMETER:{} {} {}, CAUSE:{}",
                    loginName,accountNo, traceLogId, Throwables.getStackTraceAsString(e));
        }
        return response;
    }
}
