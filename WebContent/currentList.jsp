<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Camping Supplies List</title>
</head>
<body>
	<h1 class="page-title"><i>Camping Supplies List</i></h1>
	<table>
		<c:forEach items="${requestScope.campers}" var="currentCamper">
			<th class="camperName">${currentCamper.firstName}
				${currentCamper.lastName}</th>
			<tr>
				<th class="foodItems">Food:</th>
				<c:forEach items="${currentCamper.foodList}" var="foodItem">
					<td class="foodList">${foodItem.foodType}${foodItem.quantity}</td>
				</c:forEach>
			</tr>
			<tr>
				<th class="supplyItems">Supplies:</th>
				<c:forEach items="${currentCamper.suppliesList}" var="supplyItem">
					<td class="supplyList">${supplyItem.supplyItem}${supplyItem.quantity}</td>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>
	<a class="home" href="index.jsp">Home</a>
</body>
</html>