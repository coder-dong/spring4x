package com.smart.injectfun;


import com.alibaba.fastjson.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.*;
import  static  org.testng.Assert.*;

public class InjectFunTest {
	public ApplicationContext factory = null;

	private static String[] CONFIG_FILES = { "com/smart/injectfun/beans.xml" };

	@BeforeMethod
	public void setUp() throws Exception {
		factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
		
	}

	@Test
	public void testLookup(){
		MagicBoss mboss = (MagicBoss) factory.getBean("magicBoss");
		assertNotSame(mboss.getCar(),mboss.getCar());
	}

	@Test
	public void testReplace(){
		MagicBoss mboss = (MagicBoss) factory.getBean("boss1");
		assertEquals(mboss.getCar().getBrand(),"美人豹");
	}

	@Test
	public void testScope(){
		Boss3 boss3 = (Boss3) factory.getBean("boss3");
		System.out.println(boss3.getClass());
		Class<?>[] interfaces = boss3.getClass().getInterfaces();
		System.out.println(JSONObject.toJSON(interfaces));

		Car car1 = (Car) factory.getBean("car");
		Car car2 = (Car) factory.getBean("car");
		Car car3 = (Car) factory.getBean("car");

		System.out.println(boss3.getCar());
		System.out.println(boss3.getCar());
		System.out.println(boss3.getCar());

		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}
	
}
