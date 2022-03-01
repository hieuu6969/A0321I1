<%--
  Created by IntelliJ IDEA.
  User: hieu
  Date: 2/20/2022
  Time: 9:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Setting</title>
</head>
<body>
<h1>Setting</h1>
<form:form action="settings/update" method="POST" modelAttribute="mailSetting">
    <table>
        <tr>
            <td><form:label path="lang">Languages: </form:label></td>
            <td><form:select path="lang">
            <form:option value="English">English</form:option>
            <form:option value="Vietnamese">Vietnamese</form:option>
            <form:option value="Japanese">Japanese</form:option>
            <form:option value="Chinese">Chinese</form:option>
            </form:select></td>
        </tr>
        <tr>
            <td><form:label path="pageSize">Page Size: </form:label></td>
            <td>Show <form:select path="pageSize">
                <form:option value="5">5</form:option>
                <form:option value="10">10</form:option>
                <form:option value="15">15</form:option>
                <form:option value="25">25</form:option>
                <form:option value="50">50</form:option>
                <form:option value="100">100</form:option>
            </form:select> emails per page
            </td>
        </tr>
        <tr>
            <td><form:label path="spamsFilter">Spams Filter: </form:label></td>
            <td><form:checkbox path="spamsFilter" value="true"></form:checkbox>Enable spams filter</td>
        </tr>
        <tr>
            <td><form:label path="signature">Signature: </form:label></td>
            <td><form:textarea path="signature"></form:textarea></td>
        </tr>
        <tr>
            <td></td>
            <td><form:button type="submit">Update</form:button>
            <form:button type="reset">Cancel</form:button>
            </td>
        </tr>
    </table>
</form:form>
<h3>${message}</h3>
</body>
</html>
