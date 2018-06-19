package com.revature.servlets;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class ProfileServlet extends HttpServlet{
	private static final long serialVersionUID = 6813596748678105106L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if( session != null && session.getAttribute("username") != null) {
			request.getRequestDispatcher("profile.html").forward(request, response);
		} else {
			response.sendRedirect("login");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	}
}
