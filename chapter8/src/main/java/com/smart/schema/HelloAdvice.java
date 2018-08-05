package com.smart.schema;

/**
 * Created by coding-dong on 2018/7/16.
 */
public class HelloAdvice {

    public void printHelloBefore(String name){
        System.out.println("before hello : " + name);
    }

    public void printHelloAfter(int retVal){
        System.out.println("after hello");
    }


}
