<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.deloitte.estore.model.Product,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Information</title>
</head>
<body>
<%
Product p = (Product)session.getAttribute("prod");
out.println("ID: "+p.getProductId()+"<br>Name: "+p.getName()+"<br>Price: "+p.getPrice());
%>
</body>
</html>