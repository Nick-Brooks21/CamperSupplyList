<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Camping Supplies List</title>
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
.name {
text-align: center;
}

</style>
</head>
<body>
	<h1 class="page-title">
		<i>Camping Supplies List</i>
	</h1>
	<c:forEach items="${requestScope.campers}" var="currentCamper">
		<table align="center">
			<tr class: "name"><h3>${currentCamper.firstName}  ${currentCamper.lastName}</h3></tr>
			<th class="foodItems">Food:</th>
			<c:forEach items="${requestScope.food}" var="foodItem">
				<tr>
					<c:if test="${foodItem.camperId == currentCamper.id}">
						<td>${foodItem.foodType}:${foodItem.quantity}</td>
					</c:if>
				</tr>
			</c:forEach>
			<th class="supplyItems">Supplies:</th>
			<c:forEach items="${requestScope.supplies}" var="supplyItem">
				<tr>
					<c:if test="${supplyItem.camperId == currentCamper.id}">
						<td>${supplyItem.supplyItem}:${supplyItem.quantity}</td>
					</c:if>
				</tr>
			</c:forEach>
		</table>
	</c:forEach>

	<a class="home" href="index.jsp">Home</a>
</body>
</html>