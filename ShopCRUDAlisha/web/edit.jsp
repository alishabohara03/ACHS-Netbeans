<%-- 
    Document   : edit
    Created on : Aug 28, 2025, 6:35:50 PM
    Author     : asyla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--<%@ page import="com.alisha.shop.Product" %>--%>
<html>
<head><title>Edit Product</title></head>
<body>
<h2>Edit Product</h2>
<%
    Product p = (Product) request.getAttribute("product");
%>
<form action="edit" method="post">
<input type="hidden" name="id" value="<%=p.getId()%>">
Name: <input type="text" name="name" value="<%=p.getName()%>" required><br><br>
Price: <input type="number" step="0.01" name="price" value="<%=p.getPrice()%>" required><br><br>
Quantity: <input type="number" name="quantity" value="<%=p.getQuantity()%>" required><br><br>
<input type="submit" value="Update Product">
</form>
<br>
<a href="list">Back to List</a>
</body>
</html>
