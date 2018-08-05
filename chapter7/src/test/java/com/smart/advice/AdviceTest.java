package com.smart.advice;

import com.smart.concept.User;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.testng.Assert.*;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.testng.annotations.*;
import org.testng.annotations.Test;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:com/smart/advice/beans.xml")
public class AdviceTest {

	@Autowired
	private UserService userService;

	@Test
	public void advice() {
		String configPath = "com/smart/advice/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		Waiter waiter = (Waiter)ctx.getBean("waiter");
		waiter.greetTo("John");
	}

	@org.junit.Test
	public void testUserServiceAround(){
		System.out.println(userService.addUser("test1", 30, true));
	}
}
