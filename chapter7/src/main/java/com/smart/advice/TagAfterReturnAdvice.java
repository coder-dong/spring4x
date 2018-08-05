package com.smart.advice;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by coding-dong on 2018/6/28.
 */
public class TagAfterReturnAdvice implements AfterReturningAdvice{

    private Logger logger = LoggerFactory.getLogger(TagAfterReturnAdvice.class);

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        logger.info("returnValue : {}, args : {}, target : {}",
                JSONObject.toJSONString(returnValue), JSONArray.toJSONString(args), JSONObject.toJSONString(target));

        if (((int)returnValue) == 1){
            returnValue = 2;
        }
    }
}
