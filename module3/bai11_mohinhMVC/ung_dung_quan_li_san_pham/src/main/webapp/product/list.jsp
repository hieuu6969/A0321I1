<%--
  Created by IntelliJ IDEA.
  User: hieu
  Date: 1/11/2022
  Time: 9:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Product List</h1>
<p>
    <a href="/products?action=create">Create a new product</a>
</p>

<table border="1">
    <tr>
        <th>Product Name</th>
        <th>Price ($)</th>
        <th>Description</th>
        <th>Manufacturer</th>
    </tr>
    <c:forEach items='${requestScope["products"]}' var = "product">
        <tr>
            <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getManufacturer()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
