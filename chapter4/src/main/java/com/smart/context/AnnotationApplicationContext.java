package com.smart.context;

import com.smart.Car;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApplicationContext {

	 public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
		Car car =ctx.getBean("car",Car.class);

//		ConfigurableListableBeanFactory beanFactory = (ConfigurableListableBeanFactory) ctx;
//
//		beanFactory.destroySingletons();
	}
}
