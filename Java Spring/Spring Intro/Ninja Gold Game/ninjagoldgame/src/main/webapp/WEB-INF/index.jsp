<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!DOCTYPE html>
<html>
<head>
<title>Welcome, again</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
	<div class="container">
	<div>
		<h1>Your Gold: <c:out value="${gold}"></c:out></h1>
	</div>
		<div class="row row-cols-2 row-cols-lg-5 g-5 g-lg-3">
			<div class="col">
				<div class="p-3 border bg-light">
					<h5>Farm</h5>
					<p>(earns 10-20 gold)</p>
					<form action="/" method="post">
					<input type="submit" value="Find Gold!" name="farm"/>
					</form>
				</div>
			</div>
			<div class="col">
				<div class="p-3 border bg-light">
					<h5>Cave</h5>
					<p>(earns 5-10 gold)</p>
					<form action="/" method="post">
					<input type="submit" value="Find Gold!" name="cave"/>
					</form>
				</div>
			</div>
			<div class="col">
				<div class="p-3 border bg-light">
					<h5>House</h5>
					<p>(earns 2-5 gold)</p>
					<form action="/" method="post">
					<input type="submit" value="Find Gold!" name="house" />
					</form>
				</div>
			</div>
			<div class="col">
				<div class="p-3 border bg-light">
					<h5>Quest</h5>
					<p>(earns/takes 0-50 gold)</p>
					<form action="/" method="post">
						<input type="submit" value="Find Gold!" name="quest" />
					</form>
				</div>
			</div>
			<div class="col">
				<div class="p-3 border bg-light">
					<h5>Spa</h5>
					<p>(takes 5-20 gold)</p>
					<form action="/" method="post">
						<input type="submit" value="Get rest!" name="spa" />
					</form>
				</div>
			</div>
		</div>
		<h3>Activities:</h3>
		<div class="embed-responsive embed-responsive-1by1">
		<iframe class="embed-responsive-item" src="/activities"></iframe>
		<form action="/reset" method="post">
		<input type="submit" value="Reset"/>
		</form>
		</div>
	</div>
</body>
</html>