package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.UserAccountDao;

import pojo.UserAccount;

 
@WebServlet(description = "it will take userinfo and validate with database", urlPatterns = { "/ValidateServlet" })
public class ValidateServlet extends HttpServlet {
	UserAccountDao user=new UserAccountDao();
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out= response.getWriter();
		HttpSession session=request.getSession();
		String email=request.getParameter("email");
		String pass=request.getParameter("pwd");
		
		
		try {
			if(user.validate(email, pass)==1)
			{  
			   	session.setAttribute("uname", email);
			    response.sendRedirect("index.jsp");
			}  
			else{  
			    session.setAttribute("errormessage", "Invalid username or password");  
			   request.getRequestDispatcher("login.jsp").forward(request, response); 
			      
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

}
