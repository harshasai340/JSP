package com.deloitte.estore.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServiceImpl;
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = -7362606051590526151L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid = Integer.parseInt(request.getParameter("pid"));
		String name = request.getParameter("name");
		double price = Double.parseDouble(request.getParameter("price"));
		Product product = new Product(pid, name, price);
		ProductService ps = new ProductServiceImpl();
		try {
			if(ps.addProduct(product) ) {
				response.sendRedirect("success.jsp");
			} else {
				response.sendRedirect("failure.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("failure.jsp");
		}
	}
}