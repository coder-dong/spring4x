package com.smart.spel;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * Created by coding-dong on 2018/7/17.
 */
public class SpELTest {

    @Test
    public void test1(){
        String location = "beans.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(location);

        SystemPropertyBean systemPropertyBean = applicationContext.getBean(SystemPropertyBean.class);

        System.out.println(systemPropertyBean.toString());
    }
}
