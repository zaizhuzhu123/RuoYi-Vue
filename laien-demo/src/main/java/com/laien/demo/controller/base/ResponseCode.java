package com.laien.demo.controller.base;


/**
 * @author xushengdong
 */

public enum ResponseCode {
    /**
     * 成功处理
     */
    SUCCESS(200, "SUCCESS"),
    /**
     * 失败处理
     */
    FAILURE(500, "FAILURE"),

    /**
     * 处理超时
     */
    TIMEOUT(500, "TIMEOUT"),
    /**
     * authSecret校验失败
     */
    AUTH_FAIL(10001, "Auth FAILURE");


    /**
     * code码
     */
    private final int code;
    /**
     * 描述信息
     */
    private final String msg;

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
