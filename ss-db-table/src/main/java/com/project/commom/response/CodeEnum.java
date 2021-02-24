package com.project.commom.response;

import lombok.Getter;

/**
 * 响应状态码和说明
 */
@Getter
public enum CodeEnum {
    SUCCESS(1000, "成功"), SERVER_ERROR(1001, "服务器异常"), TOKEN_IS_ERROR(1002, "token错误"), PARAM_ERROR(1003,
            "参数错误"), BASE64_ERROR(10004, "base64解码参数为空");

    /**
     * 响应状态码
     */
    private int code;

    /**
     * 响应提示
     */
    private String msg;

    private CodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
