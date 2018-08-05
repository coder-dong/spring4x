package com.smart.advice;

import com.alibaba.fastjson.JSONObject;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by coding-dong on 2018/6/28.
 */
public class LogTimeInterceptor implements MethodInterceptor{
    private Logger logger = LoggerFactory.getLogger(LogTimeInterceptor.class);

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        logger.info("start time : {}", new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        Object obj = methodInvocation.proceed();
        logger.info("start end : {}, obj : {}", new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()),
                JSONObject.toJSONString(obj));
        return obj;
    }
}
