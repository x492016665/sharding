package com.project.commom.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 响应数据结构封装
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ResponseData<T> extends BaseResponse {

    private T data;

    private ResponseData() {
    }

    private ResponseData(CodeEnum code, T data) {
        super(code);
        this.data = data;
    }

    public static <T> ResponseData<T> out(CodeEnum code, T data) {
        return new ResponseData<T>(code, data);
    }
}
