package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.UserAccountDao;

import pojo.UserAccount;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(description = "this will take data from registration page & stored in the database", urlPatterns = { "/UserRegistrationServlet" })
public class UserRegistrationServlet extends HttpServlet {
	UserAccountDao user=new UserAccountDao();
	private static final long serialVersionUID = 1L;
       

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter write= response.getWriter();
		HttpSession session=request.getSession();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
	    int i=0;
		try {
			i=user.insert(email,password);
			if(i==1)
			{
				session.setAttribute("message", "succesfully registerd");
				 response.sendRedirect("login.jsp");
			}
			} 
		
		catch (SQLException e1) {
			
			if(i!=1)
			{
				 session.setAttribute("emessage", "email already exist");  
				 response.sendRedirect("registration.jsp");
			}
			e1.printStackTrace();
		}
		
	}

}
