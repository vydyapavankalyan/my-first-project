package com.sathya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		
   		String pid = request.getParameter("pid");
		String pname = request.getParameter("pname");
		String price = request.getParameter("price");
		String brand = request.getParameter("brand");
		String madein = request.getParameter("madein");
		String manufacturingDate = request.getParameter("manufacturingDate");
		String expiryDate = request.getParameter("expiryDate");
		String productImage = request.getParameter("productImage");
		
		UserDao dao = new UserDao();
		int result = dao.createProduct(pid,pname,price,brand,madein,manufacturingDate,expiryDate,productImage);
		
		PrintWriter writer = response.getWriter();
		writer.println("data inserted successfully");
	}


  }


