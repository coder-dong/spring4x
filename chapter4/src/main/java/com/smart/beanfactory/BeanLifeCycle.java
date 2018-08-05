package com.smart.beanfactory;

import com.smart.Car;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

public class BeanLifeCycle {
    private static void LifeCycleInBeanFactory(){


       //①下面两句装载配置文件并启动容器
 	   Resource res = new ClassPathResource("com/smart/beanfactory/beans.xml");

       BeanFactory bf= new DefaultListableBeanFactory();
       XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((DefaultListableBeanFactory)bf);
       reader.loadBeanDefinitions(res);

       //②向容器中注册MyBeanPostProcessor后处理器
       ((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyBeanPostProcessor());

       //③向容器中注册MyInstantiationAwareBeanPostProcessor后处理器
       ((ConfigurableBeanFactory)bf).addBeanPostProcessor(
               new MyInstantiationAwareBeanPostProcessor());
       //④第一次从容器中获取car，将触发容器实例化该Bean，这将引发Bean生命周期方法的调用。
       Car car1 = (Car)bf.getBean("car");
       car1.introduce();
       car1.setColor("红色");

       //⑤第二次从容器中获取car，直接从缓存池中获取
       Car car2 = (Car)bf.getBean("car");

       //⑥查看car1和car2是否指向同一引用
       System.out.println("car1==car2:"+(car1==car2));
       //⑦关闭容器
       ((DefaultListableBeanFactory)bf).destroySingletons();

    }

    private static void MyLifeCycleInBeanFactory(){
//        Resource resource = new PathMatchingResourcePatternResolver().getResource("com/smart/beanfactory/beans.xml");

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("com/smart/beanfactory/beans.xml");
//        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) beanFactory);
//        xmlBeanDefinitionReader.loadBeanDefinitions(resource);

        com.smart.bean.Car car1 = beanFactory.getBean("myCar", com.smart.bean.Car.class);
        car1.setColor("blue");

        com.smart.bean.Car car2 = beanFactory.getBean("myCar", com.smart.bean.Car.class);

        System.out.println("car1 equal car2 : " + (car1 == car2));
    }
	public static void main(String[] args) {
//		LifeCycleInBeanFactory();

        MyLifeCycleInBeanFactory();
	}
}
