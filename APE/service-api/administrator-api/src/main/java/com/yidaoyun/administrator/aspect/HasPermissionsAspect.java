package com.yidaoyun.administrator.aspect;

import com.yidaoyun.administrator.annotation.HasPermissions;
import com.yidaoyun.administrator.feign.RemoteAdministratorService;
import com.yidaoyun.base.util.*;
import com.yidaoyun.redis.util.RedisUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

@Aspect
@Component
@Slf4j
public class HasPermissionsAspect {

    @Autowired
    private RemoteAdministratorService remoteAdministratorService;

    @Autowired
    private RedisUtils redis;

    @Around("@annotation(com.yidaoyun.administrator.annotation.HasPermissions)")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        //TODO：开启权限
        if(true){
            return point.proceed();
        }
        String accessTokenInfo = getAccessTokenInfo();
        if (accessTokenInfo.contains("access_AdministratorUserId_")) {
            Signature signature = point.getSignature();
            MethodSignature methodSignature = (MethodSignature) signature;
            Method method = methodSignature.getMethod();
            HasPermissions annotation = method.getAnnotation(HasPermissions.class);
            if (annotation == null) {
                return point.proceed();
            }
            String authority = annotation.value();
            if (has(authority)) {
                return point.proceed();
            } else {
                throw new ForbiddenException("权限不足");
            }
        }
        return point.proceed();
    }

    private boolean has(String authority) {
        String accessTokenInfo = getAccessTokenInfo();
        String id = accessTokenInfo.substring("access_AdministratorUserId_".length());
        //用超管帐号方便测试，拥有所有权限
        if ("999".equals(id)) {
            return true;
        }
        return remoteAdministratorService.permissionVerify(authority, id);
    }

    private String getAccessTokenInfo() {
        HttpServletRequest request = ServletUtils.getRequest();
        String token = request.getHeader("token");
        return redis.get("access_token_" + token);
    }

}