package com.smart.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by coding-dong on 2018/6/14.
 */
public class WordSender implements ApplicationContextAware{
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void sendWord(String word){
        HelloEvent helloEvent = new HelloEvent(applicationContext);
        helloEvent.setWord(word);

        System.out.println("send word : " + helloEvent.getWord());

        applicationContext.publishEvent(helloEvent);
    }
}
