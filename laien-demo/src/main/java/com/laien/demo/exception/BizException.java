package com.laien.demo.exception;


import com.laien.demo.controller.base.ResponseCode;

/**
 * 业务异常
 *
 * @author qmf
 */
public class BizException extends RuntimeException {

    /**
     * code
     */
    private int code;
    /**
     * message
     */
    private String message;

    public BizException(String message) {
        super(message);
        this.code = ResponseCode.FAILURE.getCode();
        this.message = message;
    }

    public BizException(int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
