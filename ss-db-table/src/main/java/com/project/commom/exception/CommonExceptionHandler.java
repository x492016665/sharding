package com.project.commom.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.commom.response.CodeEnum;
import com.project.commom.response.ResponseData;

import lombok.extern.slf4j.Slf4j;

/**
 * 统一异常处理类
 * 
 * @author oKong
 *
 */
@ControllerAdvice
@Slf4j
public class CommonExceptionHandler {

    /**
     * 拦截 CommonException 的异常 正常开发中，可创建一个统一响应实体，如CommonResp,尝试使用枚举
     * 
     * @param ex
     * @return
     */
    @ExceptionHandler(CommonException.class)
    @ResponseBody
    public Map<String, Object> exceptionHandler(CommonException ex) {
        log.error("CommonException：{}({})", ex.getMsg(), ex.getCode());
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", ex.getCode());
        result.put("msg", ex.getMsg());
        return result;
    }

    /**
     * 拦截Exception类的异常
     * 
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, Object> exceptionHandler(Exception e) {
        log.info("Exception：{}({})", e);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", CodeEnum.SERVER_ERROR.getCode());
        result.put("msg", e.getMessage());
        return result;
    }

    /**
     * 
     * @Description: 拦截RuntimeException类的异常
     * @param e
     * @return
     * @date 2019年5月29日
     * @author huangjg
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public ResponseData<?> runtimeExceptionHandler(RuntimeException e) {
        log.error("RuntimeException: {}", e);
        // 综合考虑,建议使用自定义异常,修改响应的实体即可，这样虽然代码冗余，但是便于排查问题
        return ResponseData.out(CodeEnum.SERVER_ERROR, null);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public Map<String, Object> handleBindException(MethodArgumentNotValidException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        log.error("参数校验异常:{}({})", fieldError.getDefaultMessage(), fieldError.getField());
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", CodeEnum.PARAM_ERROR.getCode());
        result.put("msg", fieldError.getDefaultMessage());
        return result;
    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public Map<String, Object> handleBindException(BindException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        log.error("必填校验异常:{}({})", fieldError.getDefaultMessage(), fieldError.getField());
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", CodeEnum.PARAM_ERROR.getCode());
        result.put("msg", fieldError.getDefaultMessage());
        return result;
    }
}
