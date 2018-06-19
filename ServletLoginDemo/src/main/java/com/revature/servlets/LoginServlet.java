package com.revature.servlets;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 5901784448217028279L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.getRequestDispatcher("login.html").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();
		
		if(username.equals("admin") && password.equals("appleman")) {
			//System.out.println("Loging success");
			session.setAttribute("username", username);
			response.sendRedirect("profile");
		} else {
			//System.out.println("Login fail");
			response.sendRedirect("login");
		}
	}
}
