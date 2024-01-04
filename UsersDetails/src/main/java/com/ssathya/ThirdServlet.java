package com.ssathya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		
   		PrintWriter writer =response.getWriter();
   		
   		HttpSession session = request.getSession(false);
   		writer.println("user name...."+ session.getAttribute("username"));
   		writer.println("user age...."+ session.getAttribute("age"));
   		writer.println("user Qualification ...."+ session.getAttribute("qualification"));
   		writer.println("user Designation...."+ session.getAttribute("designation"));

   		writer.println("user email...."+ request.getParameter("email"));
   		writer.println("user mobile...."+ request.getParameter("mobile"));


	}

}
