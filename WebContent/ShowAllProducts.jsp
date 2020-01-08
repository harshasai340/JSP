<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.deloitte.estore.model.Product,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Products</title>
</head>
<body>
<table>
<%
	List<Product> li = (List<Product>)session.getAttribute("allProds");
	for(Product p : li) {
		out.println("<tr>");
		out.println("<td>"+p.getName()+"</td>"+"<td>"+p.getProductId()+"</td>"+"<td>"+p.getPrice()+"</td>");
		out.println("</tr>");
	}
	
%>
</table>
</body>
</html>