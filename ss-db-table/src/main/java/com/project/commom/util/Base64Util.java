package com.project.commom.util;

import java.io.UnsupportedEncodingException;

import org.apache.tomcat.util.codec.binary.Base64;

import com.project.commom.exception.CommonException;
import com.project.commom.response.CodeEnum;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Base64Util {

    /**
     * base64编码，不换行
     * 
     * @date 2020年4月22日
     * @author huangjg127075
     */
    public static String encryption(String str, String encoding) throws UnsupportedEncodingException {
        if (str == null || encoding == null) {
            log.error("base64编码失败,str: {},encoding: {}", str, encoding);
            throw new CommonException(CodeEnum.BASE64_ERROR);
        }
        byte[] strByte = str.getBytes(encoding);
        byte[] strBase64 = Base64.encodeBase64(strByte, false); // 避免字符串超过75个字符换行
        String strEncrypt = new String(strBase64);
        return strEncrypt;
    }

    /**
     * base64解码
     * 
     * @date 2020年4月22日
     * @author huangjg127075
     */
    public static String dencryption(String base64Param, String encoding) throws UnsupportedEncodingException {
        if (base64Param == null || encoding == null) {
            log.error("base64编码失败,base64Param: {},encoding: {}", base64Param, encoding);
            throw new CommonException(CodeEnum.BASE64_ERROR);
        }
        byte[] paramByte = Base64.decodeBase64(base64Param);
        String param = new String(paramByte, encoding);
        return param;
    }
}
