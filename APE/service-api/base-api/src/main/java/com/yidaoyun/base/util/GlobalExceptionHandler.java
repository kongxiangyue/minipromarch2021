package com.yidaoyun.base.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理器
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(ForbiddenException.class)
    public R handleForbiddenException(ForbiddenException e) {
        return R.error(403 , "forbidden:" + e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public R handleRuntimeException(RuntimeException e) {
        log.error("运行时异常:", e);
        return R.error("运行时异常:" + e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public R handleException(Exception e) {
        return R.error("服务器错误，请联系管理员" + e.getMessage());
    }

}