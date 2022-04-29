<%--
  Created by IntelliJ IDEA.
  User: hieu
  Date: 2/18/2022
  Time: 2:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title>Convert Currency Form</title>
  </head>
  <body>
  <h2>Convert Currency Form</h2>
  <form method="POST" action="/convert-currency">
    <label for="usd">USD</label>
    <input type="text" id="usd" name="usd">
    <label for="exchangeRate">Exchange Rate</label>
    <input type="text" id="exchangeRate" name="exchangeRate">
    <input type="submit" value="Convert">
    <p>VND: ${vnd}</p>
  </form>
  </body>
</html>
