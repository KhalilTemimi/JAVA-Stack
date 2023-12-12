<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- handling form and errors -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	 <div class="container d-flex justify-content-between ">
        <div class="container bg-light mx-auto col-5 mt-5 p-4 border border-dark">
            <form:form action="/register" method="post" modelAttribute="newUser">
                <h3 style="color: #0E6FDE; text-align: center;">Register</h3>
                <div class="form_group">
                    <form:label path="userName">User name : </form:label>
                    <form:errors style="color:red" path="userName" />
                    <form:input type="text" path="userName" class="form-control"/>
                </div>
                <div class="form_group">
                    <form:label path="email">Email : </form:label>
                    <form:errors style="color:red" path="email" />
                    <form:input type="text" path="email" class="form-control"/>
                </div>
                <div class="form_group">
                    <form:label path="password">Password : </form:label>
                    <form:errors style="color:red" path="password" />
                    <form:input type="password" path="password" class="form-control"/>
                </div>
                <div class="form_group">
                    <form:label path="confirmPassword">Confirm Password : </form:label>
                    <form:errors style="color:red" path="confirmPassword" />
                    <form:input type="password" path="confirmPassword" class="form-control"/>
                </div>
                <input type="submit" value="Register" class="btn btn-primary btn-lg mt-2"/>
            </form:form>
        </div>
        <div class="container bg-light mx-auto col-5 mt-5 p-4 border border-dark">
            <form:form action="/login" method="post" modelAttribute="newLogin">
                <h3 style="color: green; text-align: center;">Login</h3>
                <div style="color: red;">
                </div>
                <div class="form_group">
                    <form:label path="email">Email : </form:label>
                    <form:errors style="color:red" path="email" />
                    <form:input type="text" path="email" class="form-control"/>
                </div>
                <div class="form_group">
                    <form:label path="password">Password : </form:label>
                    <form:errors style="color:red" path="password" />
                    <form:input type="password" path="password" class="form-control"/>
                </div>
                <input type="submit" value="Login" class="btn btn-success btn-lg mt-2"/>
            </form:form>
        </div>
    </div>
</body>
</html>
