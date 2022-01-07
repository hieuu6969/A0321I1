<%--
  Created by IntelliJ IDEA.
  User: hieu
  Date: 1/5/2022
  Time: 8:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Customer List</title>
    <link href="customer_list_css.css" rel="stylesheet">
  </head>
  <body>
  <h2>Danh sách khách hàng</h2>
  <table>
    <tr>
      <th>HỌ tên</th>
      <th>Ngày sinh</th>
      <th>Địa chỉ</th>
      <th>Ảnh</th>
    </tr>
    <tr>
      <c:forEach var="customer" items="${customerList}">
        <td><c:out value="${customer.name}"></c:out></td>
        <td><c:out value="${customer.dOB}"></c:out></td>
        <td><c:out value="${customer.address}"></c:out></td>
        <td>
          <img src="<c:url value="${customer.urlImage}"/>" alt="image">
        </td>
      </c:forEach>
    </tr>
  </table>
  </body>
</html>
