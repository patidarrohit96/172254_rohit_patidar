package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.spring.aop.service.FactoryService;
import com.spring.aop.service.ShapeService;

public class AopMain {

	public static void main(String[] args)
	{
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");	
		ShapeService shapeService= ctx.getBean("shapeService", ShapeService.class);
		
//		FactoryService factoryService =new FactoryService();
//		ShapeService  shapeService =(ShapeService) factoryService.getBean("shapeService");
		
		shapeService.getCircle();
//		System.out.println(shapeService.getCircle().getName());
	}

}
