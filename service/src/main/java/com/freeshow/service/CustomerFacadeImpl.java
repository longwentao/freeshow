package com.freeshow.service;

import com.freeshow.Response;
import com.freeshow.manager.exception.FreeShowException;
import com.freeshow.manager.util.VerifyUtil;
import com.freeshow.service.enums.BussErrorCode;
import com.freeshow.service.models.CustomerAuthReqDTO;
import com.freeshow.service.models.CustomerCreateReqDTO;
import com.freeshow.service.models.CustomerQueryReqDTO;
import com.freeshow.service.models.CustomerResDTO;
import com.google.common.base.Throwables;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.slf4j.Marker;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

/**
 * 客户信息 service
 * Created by Mac Zhang on 14-11-8 下午6:00
 */
@Service
@Slf4j
public class CustomerFacadeImpl implements CustomerFacade{

    @Override
    public Response<String> createCustomer(CustomerCreateReqDTO reqDTO, String traceLogId) {
        MDC.put(Marker.ANY_MARKER, traceLogId);
        log.info("call createCustomer, PARAMETER: {}, {}", reqDTO, traceLogId);
        Response<String> response = new Response<String>();
        try {
            //参数校验
            VerifyUtil.validateObject(reqDTO);

            log.info("success to createCustomer, RESULT: {} {}", response,traceLogId);
        } catch (FreeShowException e) {
            response.setErrorCode(e.getCode());
            response.setErrorMsg(e.getMessage());
            log.error("failed to createCustomer, PARAMETER: {} {}, RESULT: {}",
                    reqDTO, traceLogId, response);
        } catch (DataAccessException e) {
            response.setErrorCode(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to createCustomer, PARAMETER:{} {}, CAUSE:{}",
                    reqDTO, traceLogId, Throwables.getStackTraceAsString(e));
        }catch (Exception e) {
            response.setErrorCode(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to createCustomer, PARAMETER:{} {}, CAUSE:{}",
                    reqDTO, traceLogId, Throwables.getStackTraceAsString(e));
        }
        return response;
    }

    @Override
    public Response<CustomerResDTO> queryCustomer(CustomerQueryReqDTO reqDTO, String traceLogId) {
        MDC.put(Marker.ANY_MARKER, traceLogId);
        log.info("call queryCustomer, PARAMETER: {}, {}", reqDTO, traceLogId);
        Response<CustomerResDTO> response = new Response<CustomerResDTO>();
        try {
            //参数校验
            VerifyUtil.validateObject(reqDTO);

            log.info("success to queryCustomer, RESULT: {} {}", response,traceLogId);
        } catch (FreeShowException e) {
            response.setErrorCode(e.getCode());
            response.setErrorMsg(e.getMessage());
            log.error("failed to queryCustomer, PARAMETER: {} {}, RESULT: {}",
                    reqDTO, traceLogId, response);
        } catch (DataAccessException e) {
            response.setErrorCode(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to queryCustomer, PARAMETER:{} {}, CAUSE:{}",
                    reqDTO, traceLogId, Throwables.getStackTraceAsString(e));
        }catch (Exception e) {
            response.setErrorCode(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to queryCustomer, PARAMETER:{} {}, CAUSE:{}",
                    reqDTO, traceLogId, Throwables.getStackTraceAsString(e));
        }
        return response;
    }

    @Override
    public Response<Boolean> authCustomer(CustomerAuthReqDTO reqDTO, String traceLogId) {
        MDC.put(Marker.ANY_MARKER, traceLogId);
        log.info("call authCustomer, PARAMETER: {}, {}", reqDTO, traceLogId);
        Response<Boolean> response = new Response<Boolean>();
        try {
            //参数校验
            VerifyUtil.validateObject(reqDTO);

            log.info("success to authCustomer, RESULT: {} {}", response,traceLogId);
        } catch (FreeShowException e) {
            response.setErrorCode(e.getCode());
            response.setErrorMsg(e.getMessage());
            log.error("failed to authCustomer, PARAMETER: {} {}, RESULT: {}",
                    reqDTO, traceLogId, response);
        } catch (DataAccessException e) {
            response.setErrorCode(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.DATABASE_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to authCustomer, PARAMETER:{} {}, CAUSE:{}",
                    reqDTO, traceLogId, Throwables.getStackTraceAsString(e));
        }catch (Exception e) {
            response.setErrorCode(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorCode());
            response.setErrorMsg(BussErrorCode.INTERNAL_PROCESS_EXCEPTION.getErrorMsg());
            log.error("failed to authCustomer, PARAMETER:{} {}, CAUSE:{}",
                    reqDTO, traceLogId, Throwables.getStackTraceAsString(e));
        }
        return response;
    }
}
