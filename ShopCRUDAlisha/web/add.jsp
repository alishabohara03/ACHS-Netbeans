<%-- 
    Document   : add
    Created on : Aug 28, 2025, 6:35:22 PM
    Author     : asyla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
    <title>Add Product</title>
</head>
<body>
    <h2>Add Product</h2>
    <form action="<%=request.getContextPath()%>/addProduct" method="post">
        Name: <input type="text" name="name" required><br><br>
        Price: <input type="number" step="0.01" name="price" required><br><br>
        Quantity: <input type="number" name="quantity" required><br><br>
        <input type="submit" value="Add Product">
    </form>
    <br>
    <a href="<%=request.getContextPath()%>/list">View Products</a>
</body>
</html>


