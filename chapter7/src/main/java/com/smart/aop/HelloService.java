package com.smart.aop;

import org.springframework.stereotype.Component;

/**
 * Created by coding-dong on 2018/7/9.
 */
@Component
public class HelloService {

    public void sayHello(String name){
        System.out.println("hello " + name);
    }

    public boolean greetTo(String name){
        System.out.println("greeting " + name);
        return true;
    }
}
