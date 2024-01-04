package com.sathyauserreg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mobile= request.getParameter("mobile");
		UserDao dao=new UserDao();
		int result=dao.deleteuser(mobile);
		
		request.setAttribute("result", result);
		RequestDispatcher dispatcher=request.getRequestDispatcher("DeleteResult.jsp");
		dispatcher.forward(request, response);
	}

}
