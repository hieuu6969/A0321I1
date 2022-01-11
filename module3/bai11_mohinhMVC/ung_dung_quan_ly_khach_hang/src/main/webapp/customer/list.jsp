<%--
  Created by IntelliJ IDEA.
  User: hieu
  Date: 1/9/2022
  Time: 6:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Customer List</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--    <h1>Customers</h1>--%>
<%--    <p>--%>
<%--    <a href="/customers?action=create">Create a new customer</a>--%>
<%--    </p>--%>
<%--    <table border ="1">--%>
<%--        <tr>--%>
<%--            <th>Name</th>--%>
<%--            <th>Email</th>--%>
<%--            <th>Address</th>--%>
<%--            <th>Edit</th>--%>
<%--            <th>Delete</th>--%>
<%--        </tr>--%>
<%--        <c:forEach items='${requestScope["customers"]}' var="customer">--%>
<%--            <tr>--%>
<%--                <td><a href="/customers?action=view&id=${customer.getId()}"></a></td>--%>
<%--                <td>${customer.getEmail()}</td>--%>
<%--                <td>${customer.getAddress()}</td>--%>
<%--                <td><a href="customers?action=edit&id=${customer.getId()}">Edit</a></td>--%>
<%--                <td><a href="customers?action=delete&id=${customer.getId()}">Delete</a></td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--    </table>--%>
<%--</body>--%>
<%--</html>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
<h1>Customers</h1>
<p>
    <a href="/customers?action=create">Create new customer</a>
</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["customers"]}' var="customer">
        <tr>
            <td><a href="/customers?action=view&id=${customer.getId()}">${customer.getName()}</a></td>
            <td>${customer.getEmail()}</td>
            <td>${customer.getAddress()}</td>
            <td><a href="/customers?action=edit&id=${customer.getId()}">edit</a></td>
            <td><a href="/customers?action=delete&id=${customer.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>