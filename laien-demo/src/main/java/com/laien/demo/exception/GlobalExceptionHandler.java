package com.laien.demo.exception;//package com.laien.demo.exception;
//
//import com.laien.demo.controller.base.ResponseResult;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.HttpRequestMethodNotSupportedException;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
///**
// * 全局异常处理
// *
// * @author qmf
// */
//@Slf4j
//@RestControllerAdvice
//public class GlobalExceptionHandler {
//
//    @ExceptionHandler(value = {HttpRequestMethodNotSupportedException.class})
//    public ResponseResult<Void> handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
//        log.error("不支持的请求方式!", e);
//
//        return ResponseResult.fail(e.getMethod() + " Request not supported");
//    }
//
//    @ExceptionHandler(value = {BizException.class})
//    public ResponseResult<Void> handleBizException(BizException e) {
//        log.error("业务异常：", e);
//
//        return ResponseResult.fail(e.getCode(), e.getMessage());
//    }
//
//    @ExceptionHandler(value = {Exception.class})
//    public ResponseResult<Void> handleException(Exception e) {
//        log.error("系统发生异常", e);
//
//        return ResponseResult.fail("System error");
//    }
//
//}
