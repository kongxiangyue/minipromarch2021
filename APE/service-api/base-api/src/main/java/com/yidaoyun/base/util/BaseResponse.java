package com.yidaoyun.base.util;

/**
 * @ClassName BaseResponse
 */
public class BaseResponse
{

    private int code = 0;

    private String msg = "success";

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
