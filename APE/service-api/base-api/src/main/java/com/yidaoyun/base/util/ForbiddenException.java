package com.yidaoyun.base.util;

/**
 * <p>File：ForbiddenException.java</p>
 * <p>Title: 权限不足</p>
 */
public class ForbiddenException extends RuntimeException {

    private static final String DEFAULT_MSG = "forbidden";

    public ForbiddenException(String msg) {
        super(msg);
    }

    public ForbiddenException() {
        super(DEFAULT_MSG);
    }

}
