package com.deloitte.estore.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServiceImpl;
@WebServlet("/AllProductsServlet")
public class AllProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService ps = new ProductServiceImpl();
		List<Product> c = null;;
		try {
			c = ps.getAllProducts();
		} catch (Exception e) {
			e.printStackTrace();
		}
		HttpSession s = request.getSession();
		s.setAttribute("allProds", c);
		response.sendRedirect("ShowAllProducts.jsp");
	}

}
