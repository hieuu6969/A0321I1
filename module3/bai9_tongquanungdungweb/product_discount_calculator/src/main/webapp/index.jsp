<%--
  Created by IntelliJ IDEA.
  User: hieu
  Date: 1/2/2022
  Time: 4:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <title>Login</title>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" href="login.css">
  </head>
  <body class="text-center">
  <form class="form-signin" method="post" action="/display-discount">

    <h1 class="h3 mb-3 font-weight-normal">Product Discount Calculation</h1>
    <input type="text" name="productDescription"  class="form-control" placeholder="Product Description" autofocus>
    <input type="text" name="listPrice"  class="form-control" placeholder="List Price" required>
    <input type="text" name="discountPercent" class="form-control" placeholder="Discount Percent (%)" required>
    <button class="btn btn-lg btn-primary btn-block" type="submit">Calculate Discount</button>
  </form>
  </body>
</html>
