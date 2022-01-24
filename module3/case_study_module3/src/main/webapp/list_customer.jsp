<%--
  Created by IntelliJ IDEA.
  User: hieu
  Date: 1/19/2022
  Time: 7:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
</head>
<body>
<nav class="navbar navbar-expand-lg bg-dark navbar-dark">
    <div class="container">
        <a href="" class="navbar-brand">Nguyen Van A</a>
    </div>
</nav>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark ">
    <div class="container-fluid">

        <button class="navbar-toggler"
                type="button"
                data-bs-toggle="collapse"
                data-bs-target="#navmenu">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navmenu">
            <ul class="navbar-nav ms-left">
                <li class="nav-item">
                    <a href="#home" class="nav-link">Home</a>
                </li>
                <li class="nav-item">
                    <a href="#employee" class="nav-link">Employee</a>
                </li>
                <li class="nav-item">
                    <a href="#customer" class="nav-link">Customer</a>
                </li>
                <li class="nav-item">
                    <a href="#service" class="nav-link">Service</a>
                </li>
                <li class="nav-item">
                    <a href="#contract" class="nav-link">Contract</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div>
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-3 col-md-3 col-sm-3">
                <div class="list-group list-group-flush">
                    <a href="#" class="list-group-item list-group-item-action">
                        Item One
                    </a>
                    <a href="#" class="list-group-item list-group-item-action">Item Two</a>
                    <a href="#" class="list-group-item list-group-item-action">Item Three</a>
                </div>
            </div>

            <div align="center" class="col-lg-9 col-md-9 col-sm-9">
                <table>
                    <h2>List of Customers</h2>
                    <h3>
                        <a href="/customer?action=create">Add A New Customer</a>
                    </h3>
                    <br>
                    <tr>
                        <th>ID</th>
                        <th>Customer Name</th>
                        <th>Birthday</th>
                        <th>Gender</th>
                        <th>ID Card</th>
                        <th>Phone</th>
                        <th>Type ID</th>
                        <th>Address</th>
                    </tr>
                    <c:forEach var="customer" items="${customerList}">
                        <tr>
                            <td><c:out value="${customer.customerId}"/></td>
                            <td><c:out value="${customer.customerName}"/></td>
                            <td><c:out value="${customer.customerBirthday}"/></td>
                            <td><c:out value="${customer.customerGender}"/></td>
                            <td><c:out value="${customer.customerIdCard}"/></td>
                            <td><c:out value="${customer.customerPhone}"/></td>
                            <td><c:out value="${customer.customerTypeId}"/></td>
                            <td><c:out value="${customer.customerAddress}"/></td>
                            <td>
                                <a href="/customer?action=update&id=${customer.customerId}"></a>
                                <a href="/customer?action=delete&id=${customer.customerId}"></a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</div>
<footer class="p5 bg-dark text-white text-center
                 position-relative">
    <div class="container">
        <p class="lead">Footer...</p>
    </div>
</footer>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous">
</script>
</html>
