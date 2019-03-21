package com.spring.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestion  

{
       public static void main(String[] args) {
 
		ApplicationContext ac=new ClassPathXmlApplicationContext("two.xml");
		QuesAns a=(QuesAns) ac.getBean("hobby");
		System.out.println(a);
       }

}
