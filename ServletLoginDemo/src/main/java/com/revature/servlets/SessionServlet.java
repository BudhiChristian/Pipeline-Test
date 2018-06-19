package com.revature.servlets;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class SessionServlet extends HttpServlet{
	private static final long serialVersionUID = -5095172352805670544L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		PrintWriter pw = response.getWriter();
		response.setContentType("application/json");
		if(session != null) {
			pw.write("{\"username\" : \"" + session.getAttribute("username") + "\"}");
		} else {
			pw.write("{\"username\" : null}");
		}
		pw.close();
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	}
}
