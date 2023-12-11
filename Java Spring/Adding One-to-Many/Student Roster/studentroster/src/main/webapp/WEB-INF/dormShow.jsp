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
<title>Dorm</title>
</head>
<body>
	<div class="container" >
		<h1 class="text-center"><c:out value="${dorm.name}"/> Students</h1>
		<a href="/dashboard">Dashboard</a>
		<div class="row">
			<div class="col-12">
				<form action="/student/update/${dorm.id}" method="POST">
					<div class="dropdown">
						<label class="form-label">Student</label>
						<select name="studentId">
							<c:forEach var="student" items="${allStudents}">
								<option value="${student.id}">${student.name} (${student.dorm.name})</option>
							</c:forEach>
						</select>
					</div>
					<button type="submit" class="btn btn-primary">Add</button>
				</form>
			</div>
		</div>
		
		<table class="table table-stripped">
			<tr class="text-center">
				<th>Name</th>
				<th>Action</th>
			</tr>
			<c:forEach var="student" items="${dorm.students}">
				<tr class="text-center">
					<td><c:out value="${student.name}"/></td>
					<td><a href="/student/${student.id}/remove">Remove</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>