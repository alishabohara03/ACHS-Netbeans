<%-- 
    Document   : list
    Created on : Aug 28, 2025, 6:34:35 PM
    Author     : asyla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--<%@ page import="java.util.*, com.alisha.shop.Product" %>--%>
<html>
<head><title>Product List</title></head>
<body>
<h2>Product List</h2>
<table border="1" cellpadding="5">
<tr><th>ID</th><th>Name</th><th>Price</th><th>Quantity</th><th>Action</th></tr>
<%
    List<Product> products = (List<Product>) request.getAttribute("products");
    for(Product p : products){
%>
<tr>
<td><%= p.getId() %></td>
<td><%= p.getName() %></td>
<td><%= p.getPrice() %></td>
<td><%= p.getQuantity() %></td>
<td>
    <a href="edit?id=<%=p.getId()%>">Edit</a> | 
    <a href="delete?id=<%=p.getId()%>" onclick="return confirm('Are you sure?')">Delete</a>
</td>
</tr>
<% } %>
</table>
<br>
<a href="add.jsp">Add Product</a> | <a href="index.jsp">Home</a>
</body>
</html>

