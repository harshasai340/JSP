<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<form action="ProductServlet" method="post">
ID:<input type="text" name="pid"> <br>
Name: <input type="text" name="name"> <br>
Price: <input type="number" name="price"> <br>
<button type="submit" value="add">ADD</button>
</form>
<a href="AllProductsServlet">Show All Products</a>
</body>
</html>