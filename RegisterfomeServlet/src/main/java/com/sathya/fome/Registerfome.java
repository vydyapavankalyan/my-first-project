package com.sathya.fome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Registerfome")
public class Registerfome extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		String[] qualifications = request.getParameterValues("qualification");
		String finalQual = String.join(",", qualifications);

		String gender = request.getParameter("gender");

		String[] technologies = request.getParameterValues("technologies");
		String finalTech = String.join(",", technologies);

		String type = request.getParameter("type");

		String[] address = request.getParameterValues("address");
		String finalAddr = String.join("-", address);

		String comments = request.getParameter("comments");

		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setQualifications(finalQual);
		user.setGender(gender);
		user.setTechnologies(finalTech);
		user.setType(type);
		user.setAddress(finalAddr);
		user.setComments(comments);

		UserDao dao = new UserDao();
		dao.saveUser(user);

		PrintWriter writer = response.getWriter();
		writer.println("Data inserted successfully...");
	}


}


