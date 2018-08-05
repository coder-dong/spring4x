package com.smart.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import static org.testng.Assert.*;
import org.testng.annotations.*;

public class BeforeAdviceTest {

    @Test
	public void before() {
        Waiter target = new NaiveWaiter();
        BeforeAdvice  advice = new GreetingBeforeAdvice();
        ProxyFactory pf = new ProxyFactory();
        pf.setInterfaces(target.getClass().getInterfaces());
        pf.setOptimize(true);
        pf.setTarget(target);
        pf.addAdvice(advice);

        Waiter proxy = (Waiter)pf.getProxy(); 
        proxy.greetTo("John");
        proxy.serveTo("Tom");
	}

	@Test
	public void testBeforeAdvice(){
        UserService userService = new UserService();
        BeforeAdvice advice = new TagBeforeAdvice();

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setInterfaces(userService.getClass().getInterfaces());
        proxyFactory.setOptimize(true);
        proxyFactory.setTarget(userService);
        proxyFactory.addAdvice(advice);

        UserService proxy = (UserService) proxyFactory.getProxy();

        proxy.delUser("abc");
    }
}
