package com.sathyauserreg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/search")
public class SearchServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email=request.getParameter("email");
		
		//Calling the DAO Layer method by passing email
		UserDao dao=new UserDao();
		Userinfo userinfo=dao.findByEmail(email);
		
		//set the data to request Object
		request.setAttribute("userinfo", userinfo);
		
		//forward the request to JSP
		RequestDispatcher dispatcher=request.getRequestDispatcher("SearchResult.jsp");
		dispatcher.forward(request, response);
	}


	}


