package com.deloitte.estore.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServiceImpl;

@WebServlet("/ShowProduct")
public class ShowProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid = Integer.parseInt(request.getParameter("pid"));
		ProductService ps = new ProductServiceImpl();
		Product p = null;
		try {
			p = ps.getProductById(pid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		HttpSession session = request.getSession();
		session.setAttribute("prod", p);
		response.sendRedirect("ProductInfo.jsp");
	}

}
