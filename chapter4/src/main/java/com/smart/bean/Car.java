package com.smart.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * Created by coding-dong on 2018/6/7.
 */
public class Car implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware{
    private String brand;

    private String color;

    private String engineType;

    private String gvw;

    private String vehicleModel;

    private BeanFactory beanFactory;

    private String beanName;

    public Car() {
        System.out.println("调用Car的构造方法，进行实例化");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getGvw() {
        return gvw;
    }

    public void setGvw(String gvw) {
        this.gvw = gvw;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用BeanFactoryAware的setBeanFactory()方法，注入beanFactory");
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("调用BeanNameAware的setBeanName()方法，注入beanName");
        this.beanName = name;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("调用DisposableBean的destroy()方法，销毁bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用InitializingBean的afterPropertiesSet()方法，初始化bean");
    }

    public void initMethod(){
        System.out.println("调用Car的initMethod()方法，进行初始化bean");
    }

    public void destroyMethod(){
        System.out.println("调用Car的destroyMethod()方法，释放bean");
    }
}
