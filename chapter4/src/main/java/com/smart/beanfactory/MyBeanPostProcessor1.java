package com.smart.beanfactory;

import com.smart.bean.Car;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by coding-dong on 2018/6/8.
 */
public class MyBeanPostProcessor1 implements BeanPostProcessor{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Car && beanName.equals("myCar")){
            System.out.println("调用MyBeanPostProcessor1的postProcessBeforeInitialization方法，进行bean初始化");

            com.smart.bean.Car car = (com.smart.bean.Car) bean;

            car.setColor("black");
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Car && beanName.equals("myCar")){
            System.out.println("调用MyBeanPostProcessor1的postProcessAfterInitialization方法，进行bean初始化");

            com.smart.bean.Car car = (com.smart.bean.Car) bean;

            car.setGvw("1.4T");
        }

        return bean;
    }
}
