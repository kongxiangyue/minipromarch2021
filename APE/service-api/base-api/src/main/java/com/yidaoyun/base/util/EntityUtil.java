package com.yidaoyun.base.util;

import com.alibaba.fastjson.JSON;

public class EntityUtil {

    public static  <T> T getEntityFromR(R r, Class<T> clazz) {
        return JSON.parseObject(JSON.toJSONString(r.get("data")), clazz);
    }

}
