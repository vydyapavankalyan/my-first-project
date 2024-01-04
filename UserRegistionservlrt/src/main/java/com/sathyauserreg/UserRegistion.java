package com.sathyauserreg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/usereg")
public class UserRegistion extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UserRegistion() {
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String username=request.getParameter("username");
		 String Password=request.getParameter("password");
		 String email =request.getParameter("email");
		 String mobile=request.getParameter("mobile");
		 
		 
			UserDao dao = new UserDao();
			int result=dao.saveUser(username, Password, email, mobile);
			
			//to send the result to jsp file store into REquest
			request.setAttribute("result",result);
			
			//send the result to asp file
			RequestDispatcher dispatcher=
					request.getRequestDispatcher("registerstatus.jsp");
			dispatcher.forward(request, response);
			
		 
			//PrintWriter writer = response.getWriter();
			//writer.println("Data inserted successfully....");
		
		
	}

}
