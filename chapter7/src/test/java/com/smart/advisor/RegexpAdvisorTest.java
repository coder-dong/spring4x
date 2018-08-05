package com.smart.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.testng.Assert.*;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.testng.annotations.*;
public class RegexpAdvisorTest {

	@Test
	public void regexp(){
		String configPath = "com/smart/advisor/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		Waiter waiter = (Waiter)ctx.getBean("waiter1");
		waiter.greetTo("John");
		waiter.serveTo("John");
	}

	@Test
	public void regexp_us(){
		String cofigFile = "com/smart/advisor/beans.xml";
		PathMatchingResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
		Resource resource = resourcePatternResolver.getResource("classpath:com.smart.advisor.beans.xml");

		ApplicationContext context = new ClassPathXmlApplicationContext(cofigFile);

		UserService userService = context.getBean("userService_regexp", UserService.class);
		userService.findUser("1111");

		userService.delUser("222");
	}
}
