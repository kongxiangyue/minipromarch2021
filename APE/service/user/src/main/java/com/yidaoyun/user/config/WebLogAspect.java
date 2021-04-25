package com.yidaoyun.user.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * @author: ${xzr}
 * @date: 2020/6/29 20:07
 * @description:
 * @version:1.0
 **/

//@Aspect
//@Component
public class WebLogAspect {
    Logger logger = LoggerFactory.getLogger(WebLogAspect.class);

    long startTime;
    long endTime;

    /**
     * 定义请求日志切入点，其切入点表达式有多种匹配方式,这里是#匹配 com.gongsi.controller 包下所有类的所有方法
     */
    @Pointcut("execution(public * com.yidaoyun.user.controller.*.*(..))")
    public void webLogPointcut() {

    }


    @Around("webLogPointcut()")
    public void doAround(ProceedingJoinPoint point){
        //在方法中获取请求上下文,接收到请求，记录请求内容
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        //获取请求request
        HttpServletRequest request = servletRequestAttributes.getRequest();
        //获取请求头中的User-Agent  //此jar包需maven反向生成
  //      UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));

        //打印请求的内容
        startTime = System.currentTimeMillis();
        logger.info("请求开始时间：{}", LocalDateTime.now());
        logger.info("请求Url : {}", request.getRequestURL().toString());
        logger.info("请求方式 : {}", request.getMethod());
        //logger.info("请求ip : {}", request.getRemoteAddr());
        logger.info("请求方法 : ", point.getSignature().getDeclaringTypeName() + "." + point.getSignature().getName());
        logger.info("请求参数 : {}", Arrays.toString(point.getArgs()));
        // 系统信息
//        logger.info("浏览器：{}", userAgent.getBrowser().toString());
//        logger.info("浏览器版本：{}", userAgent.getBrowserVersion());
//        logger.info("操作系统: {}", userAgent.getOperatingSystem().toString());
        // pjp.proceed()：当我们执行完切面代码之后，还有继续处理业务相关的代码。proceed()方法会继续执行业务代码，并且其返回值，就是业务处理完成之后的返回值。
//        try {
//            Object result = point.proceed();
//            logger.info("请求返回 : {}", result);
//        }catch (Exception e){
//            logger.error("error : " + e);
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }

    }

    /**
     * 返回通知：
     * 1. 在目标方法正常结束之后执行
     * 1. 在返回通知中补充请求日志信息，如返回时间，方法耗时，返回值，并且保存日志信息
     *
     * @param ret
     * @throws Throwable
     */
//    @AfterReturning(returning = "ret", pointcut = "webLogPointcut()")
//    public void doAfterReturning(Object ret) throws Throwable {
//        endTime = System.currentTimeMillis();
//        logger.info("请求结束时间：{}", LocalDateTime.now());
//       // logger.info("请求耗时：{}", (endTime - startTime));
//        // 处理完请求，返回内容
//        logger.info("请求返回 : {}", ret);
//    }

}
