package com.ruoyi.common.core.domain;

import java.util.HashMap;

import com.ruoyi.common.constant.HttpStatus;
import com.ruoyi.common.utils.StringUtils;

/**
 * 操作消息提醒
 *
 * @author ruoyi
 */
public class ResponseResult<T> extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    /**
     * 状态码
     */
    public static final String CODE_TAG = "code";

    /**
     * 返回内容
     */
    public static final String MSG_TAG = "message";

    /**
     * 数据对象
     */
    public static final String DATA_TAG = "data";

    /**
     * 初始化一个新创建的 ResponseResult 对象，使其表示一个空消息。
     */
    public ResponseResult() {
    }

    /**
     * 初始化一个新创建的 ResponseResult 对象
     *
     * @param code 状态码
     * @param msg  返回内容
     */
    public ResponseResult(int code, String msg) {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
    }

    /**
     * 初始化一个新创建的 ResponseResult 对象
     *
     * @param code 状态码
     * @param msg  返回内容
     * @param data 数据对象
     */
    public ResponseResult(int code, String msg, T data) {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
        if (StringUtils.isNotNull(data)) {
            super.put(DATA_TAG, data);
        }
    }

    /**
     * 返回成功消息
     *
     * @return 成功消息
     */
    public static ResponseResult success() {
        return ResponseResult.success("SUCCESS");
    }

    /**
     * 返回成功数据
     *
     * @return 成功消息
     */
    public static <T> ResponseResult success(T data) {
        return ResponseResult.success("SUCCESS", data);
    }

    /**
     * 返回成功消息
     *
     * @param msg 返回内容
     * @return 成功消息
     */
    public static ResponseResult success(String msg) {
        return ResponseResult.success(msg, null);
    }

    /**
     * 返回成功消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 成功消息
     */
    public static <T> ResponseResult success(String msg, T data) {
        return new ResponseResult(HttpStatus.SUCCESS, msg, data);
    }

    /**
     * 返回警告消息
     *
     * @param msg 返回内容
     * @return 警告消息
     */
    public static ResponseResult warn(String msg) {
        return ResponseResult.warn(msg, null);
    }

    /**
     * 返回警告消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 警告消息
     */
    public static <T> ResponseResult warn(String msg, T data) {
        return new ResponseResult(HttpStatus.WARN, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @return 错误消息
     */
    public static ResponseResult fail() {
        return ResponseResult.fail("FAILURE");
    }

    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @return 错误消息
     */
    public static ResponseResult fail(String msg) {
        return ResponseResult.fail(msg, null);
    }

    /**
     * 返回错误消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 错误消息
     */
    public static ResponseResult fail(String msg, Object data) {
        return new ResponseResult(HttpStatus.ERROR, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @param code 状态码
     * @param msg  返回内容
     * @return 错误消息
     */
    public static ResponseResult fail(int code, String msg) {
        return new ResponseResult(code, msg, null);
    }

    /**
     * 方便链式调用
     *
     * @param key   键
     * @param value 值
     * @return 数据对象
     */
    @Override
    public ResponseResult put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
