package com.sathya.fome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    String  username= request.getParameter("username");
	    String  password= request.getParameter("password");
	     
	    UserDao  dao =new UserDao();
	    boolean status=dao.logincheck(username,password);
	    
	  //to send the result to jsp file store into REquest
		request.setAttribute("status",status);
		
		//send the result to asp file
		RequestDispatcher dispatcher=
				request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);
	  	    

	}

}
