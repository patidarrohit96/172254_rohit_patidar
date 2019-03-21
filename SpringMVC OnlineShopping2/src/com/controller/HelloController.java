package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.AbstractController;
//
//public class JavaController extends AbstractController{
//
//	@Override
//	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) 
//			throws Exception {		
//		
//		ModelAndView mv=new ModelAndView("HelloPage");
//		mv.addObject("welcomeMessage", "Hi user");
//		
//		return mv;
//	}
//
//}
@Controller
public class HelloController{
	@RequestMapping("/")
	public ModelAndView helloWorld()
	{
		
		
		ModelAndView mv=new ModelAndView("index");
	
	return mv;
	}
	
		@RequestMapping("/welcome")
		public ModelAndView home()
		{
			
			
			ModelAndView mv=new ModelAndView("index");
		
		return mv;
		}
	@RequestMapping("/login")
	public ModelAndView login()
	{
		
		
		ModelAndView login=new ModelAndView("login");
	
	return login;
	}
	
	@RequestMapping("/register")
	public ModelAndView register()
	{
		
		
		ModelAndView register=new ModelAndView("registration");
	
	return register;
	}
	
	@RequestMapping(value="/mobile" , method=RequestMethod.GET)
	public ModelAndView mobiles()
	{
		
		
		ModelAndView mv=new ModelAndView("Mobile");
	
	return mv;
	}
	
	@RequestMapping(value="/laptop" , method=RequestMethod.GET)
	public ModelAndView laptop()
	{
		
		
		ModelAndView mv=new ModelAndView("Laptop");
	
	return mv;
	}
	
	
	@RequestMapping(value="/dslr" , method=RequestMethod.GET)
	public ModelAndView dslr()
	{
		
		
		ModelAndView mv=new ModelAndView("Dslr");
	
	return mv;
	}
	
	@RequestMapping(value="/ProductList" , method=RequestMethod.GET)
	public ModelAndView productlist()
	{
		
		
		ModelAndView mv=new ModelAndView("ProductList");
	
	return mv;
	}
	
//	@RequestMapping("/hi")
//	public ModelAndView hihelloWorld()
//	{
//		ModelAndView mv=new ModelAndView("HelloPage");
//	mv.addObject("msg", "Hi  akshay R");
//	return mv;
//	}
}