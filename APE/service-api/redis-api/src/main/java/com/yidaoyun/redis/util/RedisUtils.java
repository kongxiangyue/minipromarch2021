package com.yidaoyun.redis.util;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Redis工具类
 */
@Component
public class RedisUtils {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Resource(name = "stringRedisTemplate")
    private ValueOperations<String, String> valueOperations;

    /**
     * 默认过期时长，单位：秒
     */
    public final static long DEFAULT_EXPIRE = 60 * 60 * 24;

    /**
     * 不设置过期时长
     */
    public final static long NOT_EXPIRE = -1;

    /**
     * 插入缓存默认时间
     *
     * @param key   键
     * @param value 值
     * @author zhoux
     */
    public void set(String key, Object value) {
        set(key, value, DEFAULT_EXPIRE);
    }

    /**
     * 插入缓存
     *
     * @param key    键
     * @param value  值
     * @param expire 过期时间(s)
     * @author zhoux
     */
    public void set(String key, Object value, long expire) {
        valueOperations.set(key, toJson(value));
        redisTemplate.expire(key, expire, TimeUnit.SECONDS);
    }

    /**
     * 返回字符串结果
     *
     * @param key 键
     * @return
     * @author zhoux
     */
    public String get(String key) {
        return valueOperations.get(key);
    }

    /**
     * 返回指定类型结果
     *
     * @param key   键
     * @param clazz 类型class
     * @return
     * @author zhoux
     */
    public <T> T get(String key, Class<T> clazz) {
        String value = valueOperations.get(key);
        return value == null ? null : fromJson(value, clazz);
    }

    /**
     * 删除缓存
     *
     * @param key 键
     * @author zhoux
     */
    public void delete(String key) {
        redisTemplate.delete(key);
    }

    /**
     * Object转成JSON数据
     */
    private String toJson(Object object) {
        if (object instanceof Integer || object instanceof Long || object instanceof Float || object instanceof Double
                || object instanceof Boolean || object instanceof String) {
            return String.valueOf(object);
        }
        return JSON.toJSONString(object);
    }

    /**
     * JSON数据，转成Object
     */
    private <T> T fromJson(String json, Class<T> clazz) {
        return JSON.parseObject(json, clazz);
    }


    /**
     * 生成key
     *
     * @param args strings
     * @return key
     */
    public String generateRedisKey(String... args) {
        if (args.length > 0) {
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < args.length; i++) {
                buffer.append(args[i]);
                if (i < args.length - 1) {
                    buffer.append(":");
                }
            }
            return buffer.toString();
        }
        return "";
    }

    /**
     * 递增
     *
     * @param key   键
     * @param delta 要增加几(大于0)
     * @return
     */
    public long incr(String key, long delta) {
        if (delta < 0) {
            throw new RuntimeException("递增因子必须大于0");
        }
        return redisTemplate.execute((RedisCallback<Long>) connection -> {

            return connection.incrBy(key.getBytes(), delta);
        });
    }

    /**
     * 前缀查询
     *
     * @param prefix
     * @return
     */
    public Set<String> keys(String prefix) {
        return redisTemplate.keys(prefix + "*");
    }

}