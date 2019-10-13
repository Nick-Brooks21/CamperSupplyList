<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	background-color: lightgray;
}

h3, td {
	text-align: center;
}

table, td {
	border: 1px solid royalblue;
	padding: 10px;
}
</style>
</head>
<body>
<form method="post" action="deleteFoodServlet">
		<table align="center">
			<tr>
				<td></td>
				<td>Food ID</td>
				<td>Food Type</td>
				<td>Quantity</td>
			</tr>
			<c:forEach items="${requestScope.allFood}" var="food">
			<tr>
				<td><input type="radio" id="radioSelect" name="radio" /></td>
				<td>${food.id}</td>
				<td>${food.foodType}</td>
				<td>${food.quantity}</td>
			</tr>
			</c:forEach>
		</table>
		<input type="submit" value="Delete" name="deleteFood"><br />
	</form>
	<a href="index.jsp">Home</a>

</body>
</html>