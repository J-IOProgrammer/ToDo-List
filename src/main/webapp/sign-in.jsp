<%@ page import="io.jio.todolist.dto.PersonLoginDto" %>
<%--
  Created by IntelliJ IDEA.
  User: pc1
  Date: 8/29/2023
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign In</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.rtl.min.css"
          integrity="sha384-gXt9imSW0VcJVHezoNQsP+TNrjYXoGcrqBZJpry9zJt8PCQjobwmhMGaDHTASo9N" crossorigin="anonymous">
    <!-- Latest compiled JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
    <link rel="stylesheet" href="CSS/index-style.css">
</head>
<body class="d-flex justify-content-center align-items-center">

<div class="container row py-3 m-5 d-flex justify-content-center align-items-center">
    <%
        PersonLoginDto loginDto = (PersonLoginDto) request.getAttribute("loginDto");
        String username = "";
        String password = "";
        if (loginDto != null) {
            username = loginDto.getUsername();
            password = loginDto.getPassword();
        }
    %>
    <h1>Enter your information</h1>

    <form action="sign-in" method="post">
        <!-- Username input -->
        <div class="form-outline mb-4">
            <input type="text" id="form2Example1" class="form-control" name="username" value="<%=username%>"/>
            <label class="form-label my-2" for="form2Example1">Username</label>
        </div>

        <!-- Password input -->
        <div class="form-outline mb-4">
            <input type="password" id="form2Example2" class="form-control" name="password" value="<%=password%>"/>
            <label class="form-label my-2" for="form2Example2">Password</label>
        </div>

        <!-- Submit button -->
        <button type="button" class="btn btn-primary btn-block mb-4">Sign in</button>

        <!-- Register buttons -->
        <div class="text-center">

            <button type="button" class="btn btn-link btn-floating mx-1">
                <i class="fab fa-google"></i>
            </button>

            <button type="button" class="btn btn-link btn-floating mx-1">
                <i class="fab fa-twitter"></i>
            </button>

            <button type="button" class="btn btn-link btn-floating mx-1">
                <i class="fab fa-github"></i>
            </button>
        </div>
    </form>

</div>

</body>
</html>

