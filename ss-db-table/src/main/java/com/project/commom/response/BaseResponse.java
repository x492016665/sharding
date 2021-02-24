package com.project.commom.response;

import lombok.Data;

/**
 * 基本响应封装
 */
@Data
public class BaseResponse {

    /**
     * 响应码
     */
    private int code;

    /**
     * 响应消息
     */
    private String msg;

    protected BaseResponse() {
    }

    protected BaseResponse(CodeEnum code) {
        this.code = code.getCode();
        this.msg = code.getMsg();
    }

    public static BaseResponse out(CodeEnum code) {
        return new BaseResponse(code);
    }
}
