package com.smart.anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class Boss {
	
	private Car car;
	
	public Boss(){
		System.out.println("construct...");
	}

//	@Autowired
//	private void setCar(Car car){
//		System.out.println("execute in setCar");
//		this.car = car;
//	}

	@Resource
	private void setCar(Car car){
		System.out.println("execute in setCar");
		this.car = car;
	}

	@Order(value = 1)
	@PostConstruct
	private void init2(){
		System.out.println("execute in init2");
	}

	@Order(value = 2)
	@PostConstruct
	private void init1(){
		System.out.println("execute in init1");
	}

	@PreDestroy
	private void destory1(){
		System.out.println("execute in destory1");
	}
	
	@PreDestroy
	private void destory2(){
		System.out.println("execute in destory2");
	}

	@PostConstruct
	private void init3(){
		System.out.println("execute in init3");
	}

	@PreDestroy
	private void destroy3(){
		System.out.println("execute in destroy3");
	}
}
