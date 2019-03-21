package com.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.UserAccountDao;

@Controller
public class LoginController {
	UserAccountDao u =new UserAccountDao();
	
		
		
		@RequestMapping(value="/loginProcess",method=RequestMethod.POST)

			public ModelAndView loginForm(HttpServletRequest request,HttpServletResponse response, @RequestParam(value="email") String email,@RequestParam(value="pwd") String password ) 
			{
			HttpSession session=request.getSession();
			System.out.println("inside login process");
			int res=0;
			ModelAndView model = null;
			try {
				res=u.validate(email,password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(res==1) {
				session.setAttribute("uname", email);
				model=new ModelAndView("index");
			}
			else {
				 session.setAttribute("errormessage", "Invalid username or password");
				model=new ModelAndView("login");
			}
			return model;
			
		}
	}



