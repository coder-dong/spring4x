package com.smart.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class StaticMethodAdvisorTest {

	@Test
	public void staticMethod(){
		String configPath = "com/smart/advisor/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		Waiter waiter = (Waiter)ctx.getBean("waiter");
		Seller seller = (Seller)ctx.getBean("seller");
		waiter.greetTo("John");
		waiter.serveTo("John");
		seller.greetTo("John");	
	}

	@Test
	public void staticMethod1(){
		String configPath = "com/smart/advisor/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		UserService userService = ctx.getBean("userService", UserService.class);

		userService.addUser("111", 222, true);
		userService.findUser("111");
	}
}
