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
public class LogoutController 
{
@RequestMapping(value="/logout",method=RequestMethod.GET)

public ModelAndView logout(HttpServletRequest request,HttpServletResponse response)
{
HttpSession session=request.getSession();
session.setAttribute("uname", null);
response.setHeader("Cache-Control", "no-cache");
ModelAndView m=null;
m=new ModelAndView("index");
return m;
}
}