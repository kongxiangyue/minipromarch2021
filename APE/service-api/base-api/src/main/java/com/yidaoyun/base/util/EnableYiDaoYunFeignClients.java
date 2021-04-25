package com.yidaoyun.base.util;

import org.springframework.cloud.openfeign.EnableFeignClients;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@EnableFeignClients
public @interface EnableYiDaoYunFeignClients
{
    String[] value() default {};

    String[] basePackages() default {"com.yidaoyun"};

    Class<?>[] basePackageClasses() default {};

    Class<?>[] defaultConfiguration() default {};

    Class<?>[] clients() default {};
}