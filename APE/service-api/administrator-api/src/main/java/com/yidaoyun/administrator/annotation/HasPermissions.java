package com.yidaoyun.administrator.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>File：HasPermissions.java</p>
 * <p>Title: 权限注解</p>
 * <p>Description:</p>
 * <p>Copyright: Copyright (c) 2019 2019年12月20日 上午10:14:54</p>
 * <p>Company: </p>
 *
 * @author zhoux
 * @version 1.0
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface HasPermissions {
    String value();
}