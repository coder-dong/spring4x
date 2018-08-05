package com.smart.beanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by coding-dong on 2018/6/8.
 */
public class MyBeanFactoryPostProcessor1 implements BeanFactoryPostProcessor{
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("调用MyBeanFactoryPostProcessor1的postProcessBeanFactory()方法，进行beanDefinition处理");
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("myCar");
        beanDefinition.getPropertyValues().addPropertyValue("vehicleModel", "suv");
    }
}
