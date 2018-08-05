package com.smart.aspectj.advanced;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by coding-dong on 2018/7/11.
 */
@Aspect
public class HelloAspect {

    @Pointcut("@target(com.smart.anno.InjectId) && execution(* com.smart.anno.bean.*.toString())")
    public void sayHello(){

    }

    @Before("sayHello()")
    public void beforeProcess(){
        System.out.println("hello toString...");
    }
}
