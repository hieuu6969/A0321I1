<%--
  Created by IntelliJ IDEA.
  User: hieu
  Date: 1/2/2022
  Time: 9:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display Discount</title>
</head>
<body>
<h2>Product Discount Calculator</h2>
<p>Product Description: <%=request.getAttribute("productDescription")%></p>
<p>Price:<%=request.getAttribute("price")%></p>
<p>Discount Percent: <%=request.getAttribute("discountPercent")%></p>
<p>Discount Amount: <%=request.getAttribute("discountAmount")%></p>
<p>Discount Price:<%=request.getAttribute("discountPrice")%></p>
</body>
</html>
