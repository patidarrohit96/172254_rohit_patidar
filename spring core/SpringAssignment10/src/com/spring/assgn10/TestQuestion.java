package com.spring.assgn10;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestion  

{
       public static void main(String[] args) {
 
		ApplicationContext ac=new ClassPathXmlApplicationContext("ten.xml");
		QuesAns a=(QuesAns) ac.getBean("whore");
		System.out.println(a);
       }

}
