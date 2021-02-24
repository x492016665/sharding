package com.project.commom.util;

import java.math.BigInteger;
import java.security.MessageDigest;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @Description: MD5加密
 * @author huangjg
 * @date 2019年4月25日
 */
@Slf4j
public class MD5Util {

    public static String getMD5String(String str, String key) {
        String md5Value = null;
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update((key + str).getBytes());
            md5Value = new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return md5Value;
    }
}
