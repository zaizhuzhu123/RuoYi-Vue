package com.laien.demo.exception;


import com.laien.demo.controller.base.ResponseCode;

/**
 * 业务异常
 *
 * @author qmf
 */
public class AuthrizationException extends RuntimeException {

    /**
     * code
     */
    private int code;
    /**
     * message
     */
    private String message;

    public AuthrizationException(String message) {
        super(message);
        this.code = ResponseCode.FAILURE.getCode();
        this.message = message;
    }

    public AuthrizationException(int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public AuthrizationException() {

    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
