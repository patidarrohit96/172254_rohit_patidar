package com.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Customer;

public  class TestMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("sample1.xml");
		Customer customer=(Customer)context.getBean("customer");
		System.out.println(customer.toString());
	
	}

}
