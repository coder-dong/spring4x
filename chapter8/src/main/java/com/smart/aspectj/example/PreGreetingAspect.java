package com.smart.aspectj.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class PreGreetingAspect{
	@Before(value = "execution(* greetTo(..))")
	public void beforeGreeting(){
		System.out.println("How are you");
	}

	@After("execution(* com.smart..*.greetTo(..)) && args(clientName)")
	public void afterGreeting(String clientName){
		System.out.println("byebye : " + clientName);
	}

	@AfterThrowing(value= "execution(* com.smart..*.*(..))", throwing = "ep")
	public void printExcepion(Exception ep){
		System.out.println(ep.getStackTrace().toString());
	}

	@Around("sellAroundPointCut()")
	public Object printAroundInfo(ProceedingJoinPoint joinPoint){
		try {
			System.out.println("around start...");
			Object proceed = joinPoint.proceed();
			System.out.println("around end...");

			return proceed;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			return null;
		}
	}

	@AfterReturning(value = "sellAfterReturnPointCut()", returning = "count")
	public void printReturnValue(int count){
		System.out.println("return value : " + count);
	}

	@Pointcut("execution(* com.smart..*.sell(..))")
	public void sellAfterReturnPointCut(){

	}

	@Pointcut("execution(* com.smart..*.sell(..))")
	public void sellAroundPointCut(){

	}
}
