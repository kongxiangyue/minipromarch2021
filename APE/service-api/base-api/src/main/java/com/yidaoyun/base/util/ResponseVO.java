package com.yidaoyun.base.util;

/**
 * @ClassName ResponseVO
 */
public class ResponseVO<T> extends BaseResponse
{
    private T data;

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseVO{" +
                "data=" + data +
                '}';
    }
}
