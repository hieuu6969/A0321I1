<%--
  Created by IntelliJ IDEA.
  User: hieu
  Date: 1/2/2022
  Time: 12:36 PM
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
  </head>
  <body class="text-center">
  <form class="form-signin" method="post" action="/login" >
    <div>
      <h2>Login</h2>
      <input type="text" name="username" size="30" placeholder="Username"/>
      <input type="password" name="password" size="30" placeholder="Password"/>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </div>
  </form>
  </body>
</html>
