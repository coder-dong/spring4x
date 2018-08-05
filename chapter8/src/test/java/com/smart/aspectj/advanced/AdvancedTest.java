package com.smart.aspectj.advanced;

import com.smart.anno.bean.TestBean1;
import com.smart.anno.bean.TestBean2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.smart.Waiter;
import org.testng.annotations.*;

public class AdvancedTest {

    @Test
	public void advance() {
		String configPath = "com/smart/aspectj/advanced/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
		Waiter naughtyWaiter = (Waiter) ctx.getBean("naughtyWaiter");
//		naiveWaiter.greetTo("John");
//		naiveWaiter.serveTo("John");
//		naughtyWaiter.greetTo("Tom");
//		naughtyWaiter.serveTo("Tom");
		
        //--通过joinPoint接口访问连接点上下文信息
//		naiveWaiter.greetTo("John");
		
		//--绑定连接点参数
//		((NaiveWaiter)naiveWaiter).smile("John",2);
		
		//--绑定代理对象
		naiveWaiter.greetTo("John");
		
		//--绑定类注解
//		((NaiveWaiter)naiveWaiter).greetTo("John");

		//绑定返回值
//		SmartSeller seller = (SmartSeller) ctx.getBean("seller");
//		seller.sell("Beer","John");	
		
		//绑定异常
//		SmartSeller seller = (SmartSeller) ctx.getBean("seller");
//		seller.checkBill(2);
//		seller.checkBill(1);
	}

	@Test
	public void test1(){
		String configPath = "com/smart/aspectj/advanced/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);

		TestBean1 testBean1 = ctx.getBean(TestBean1.class);
		System.out.println(ctx.getBeansOfType(TestBean1.class).keySet().toString());

		testBean1.toString();

		TestBean2 testBean2 = ctx.getBean(TestBean2.class);

		testBean2.toString();

		Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");

		naiveWaiter.greetTo("java client");
	}
}
