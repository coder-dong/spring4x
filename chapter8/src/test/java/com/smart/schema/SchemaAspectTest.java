package com.smart.schema;

import com.smart.NaiveWaiter;
import com.smart.SmartSeller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smart.Seller;
import com.smart.Waiter;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.testng.annotations.Test;

import java.io.IOException;

public class SchemaAspectTest {


	@Test
	public void schema(){
		String configPath = "com/smart/schema/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
		Waiter naughtyWaiter = (Waiter) ctx.getBean("naughtyWaiter");	
//		Seller seller = (Seller) ctx.getBean("seller");
//		naiveWaiter.greetTo("John");
//		naughtyWaiter.greetTo("Tom");
		
//		后置增强
//		((SmartSeller)seller).sell("Beer","John");
		
		//环境增强
//		naiveWaiter.serveTo("John");
		
		//抛出异常增强
//		((SmartSeller)seller).checkBill(1);
		
		//final增强
//		naiveWaiter.greetTo("John");
		
		//引入增强
//		((Seller)naiveWaiter).sell("Beer","John");
//		((NaiveWaiter)naiveWaiter).smile("John", 2);
		
		//advisor
		naiveWaiter.greetTo("John");
		
	}

	@Test
	public void test1() throws IOException {
		String configLocation = "classpath:com/smart/schema/beans.xml";
		PathMatchingResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
		Resource resource = resourcePatternResolver.getResource(configLocation);

		System.out.println(resource.getURL().getPath());
		System.out.println(resource.getURI().getHost());
		System.out.println(resource.getURI().getFragment());
		System.out.println(resource.getURI().getQuery());
		System.out.println(resource.getURI().getPort());

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
		NaiveWaiter naiveWaiter = applicationContext.getBean("naiveWaiter", NaiveWaiter.class);

		naiveWaiter.greetTo("java client");
		System.out.println("<==================================>");
		naiveWaiter.serveTo("c++ client");
		System.out.println("<==================================>");
		naiveWaiter.smile("python client", 5);
	}
}
