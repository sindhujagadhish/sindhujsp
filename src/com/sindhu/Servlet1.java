package com.sindhu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(username.equals("sindhu") && password.equals("sindhu@123"))
		{
			response.sendRedirect("success.jsp");
		}
		else
		{
			response.sendRedirect("unsucess.jsp");
		}
	}

}
