
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
public class RegistrationController {
	
	  UserAccountDao u =new UserAccountDao();
		
			
			
			@RequestMapping(value="/RegistrationProcess",method=RequestMethod.POST)

				public ModelAndView submitAdmissionForm(HttpServletRequest request,HttpServletResponse response, @RequestParam(value="email") String email,@RequestParam(value="password") String password ) 
				{
				HttpSession session=request.getSession();
				int res=0;
				ModelAndView model = null;
				try {
					res=u.insert(email,password);
					if(res==1)
					{
						session.setAttribute("message", "succesfully registerd, Login now");
						model=new ModelAndView("login");
				} 
				}
					catch (SQLException e) {if(res!=1)
					{
						 session.setAttribute("emessage", "email already exist");  
						 model=new ModelAndView("registration");
					}
					
				}
				return model;
				
			}
		}






