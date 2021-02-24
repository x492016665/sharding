package com.project.commom.exception;

import com.project.commom.response.CodeEnum;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 自定义异常类
 * 
 * @author oKong
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CommonException extends RuntimeException {

    private static final long serialVersionUID = -3030344392591938285L;

    private int code;

    private String msg;

    public CommonException(CodeEnum codeEnum) {
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getMsg();
    }
}
