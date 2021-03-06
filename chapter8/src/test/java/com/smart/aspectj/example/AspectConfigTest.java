package com.smart.aspectj.example;

import com.smart.Seller;
import com.smart.SmartSeller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.smart.Waiter;
import org.testng.annotations.*;


public class AspectConfigTest {

	@Test
	public void config(){
		String configPath = "com/smart/aspectj/example/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		Waiter waiter = (Waiter)ctx.getBean("waiter");
		waiter.greetTo("John");
		waiter.serveTo("John");
		waiter.toString();

		SmartSeller seller = ctx.getBean("seller", SmartSeller.class);
		seller.sell("iphone", "macos");
		seller.checkBill(1);
	}
}
