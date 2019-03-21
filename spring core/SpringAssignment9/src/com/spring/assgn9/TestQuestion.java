package com.spring.assgn9;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Testspring {

	public static void main(String[] args) {

		ApplicationContext ac=new ClassPathXmlApplicationContext("nine.xml");
		((AbstractApplicationContext) ac).registerShutdownHook();
		QuesAns a=(QuesAns) ac.getBean("question");
		System.out.println(a);
	}
}