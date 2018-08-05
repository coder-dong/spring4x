package com.smart.beanfactory;

import com.smart.bean.Car;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

/**
 * Created by coding-dong on 2018/6/8.
 */
public class MyInstantiationAwareBeanPostProcessor1 extends InstantiationAwareBeanPostProcessorAdapter{

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        super.postProcessAfterInstantiation(bean, beanName);

        if (bean.getClass() == Car.class && beanName.equals("myCar")){
            System.out.println("调用MyInstantiationAwareBeanPostProcessor1的postProcessAfterInstantiation()方法，进行bean的实例化");
        }

        return true;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        super.postProcessBeforeInitialization(bean, beanName);

        if (bean.getClass() == Car.class && beanName.equals("myCar")){
            System.out.println("调用MyInstantiationAwareBeanPostProcessor1的postProcessBeforeInitialization()方法，进行bean的实例化");
        }

        return bean;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        super.postProcessPropertyValues(pvs, pds, bean, beanName);

        if (beanName.equals("myCar")){
            System.out.println("调用调用MyInstantiationAwareBeanPostProcessor1的postProcessPropertyValues()方法，进行bean属性设置");
            System.out.println("propertyValues : " + pds.toString());
        }

        return pvs;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Car && beanName.equals("myCar")){
            System.out.println("调用调用MyInstantiationAwareBeanPostProcessor1的postProcessAfterInitialization()方法，进行bean初始化");

            Car car = (Car) bean;
            car.setColor("red");
        }

        return bean;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (beanClass == Car.class && beanName.equals("myCar")){
            System.out.println("调用调用MyInstantiationAwareBeanPostProcessor1的postProcessBeforeInstantiation()方法，进行bean实例化");
        }

        return null;
    }

}
