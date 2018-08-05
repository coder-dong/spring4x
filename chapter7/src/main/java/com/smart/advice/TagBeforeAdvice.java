package com.smart.advice;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by coding-dong on 2018/6/28.
 */
public class TagBeforeAdvice implements MethodBeforeAdvice{

    private Logger logger = LoggerFactory.getLogger(TagBeforeAdvice.class);

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        logger.info("params : {}, target : {}", JSONArray.toJSONString(args),
                JSONObject.toJSONString(target.getClass().getName()));
        String userName = (String) args[0];
        if ("test1".equals(userName)){
            args[1] = 18;
        }
    }
}
