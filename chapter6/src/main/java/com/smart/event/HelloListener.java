package com.smart.event;

import org.springframework.context.ApplicationListener;

/**
 * Created by coding-dong on 2018/6/13.
 */
public class HelloListener implements ApplicationListener<HelloEvent>{

    @Override
    public void onApplicationEvent(HelloEvent event) {
        System.out.println("say hello " + event.getWord());
    }
}
