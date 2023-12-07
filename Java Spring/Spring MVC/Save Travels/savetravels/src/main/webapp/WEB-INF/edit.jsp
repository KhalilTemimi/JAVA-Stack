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
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div>
			<h1>Edit Expense</h1>
			<a href="/">Go Back</a>
		</div>
		<div class="row">
			<div class="col-12">
				<form:form action="/saveTravels/${saveTravel.id}" method="POST" modelAttribute="saveTravel">
					<input type="hidden" name="_method" value="put">
					<div class="mb-3">
						<form:label path="expense" class="form-label">Expense</form:label>
						<form:errors style="color:red" path="expense" />
						<form:input type="text" path="expense" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label path="vendor" class="form-label">Vendor</form:label>
						<form:errors style="color:red" path="vendor" />
						<form:input type="text" path="vendor" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label path="amount" class="form-label">Amount</form:label>
						<form:errors style="color:red" path="amount" />
						<form:input type="Double" path="amount" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label path="notes" class="form-label">Description</form:label>
						<form:errors style="color:red" path="notes" />
						<form:input type="text" path="notes" class="form-control" />
					</div>

					<button type="submit" class="btn btn-primary">Submit</button>
				</form:form>
			</div>
		</div>
	</div>
	</div>
</body>
</html>