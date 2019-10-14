<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Unregister Camper</title>
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
	<form method="post" action="deleteCamperServlet">
	<h3>We are sorry to hear that you no longer want to attend our summer program here at Camp Chippewa. Select your name from the list of 
	campers below to unregister. Unregistering a camper will also remove the food and supplies they pledged to bring.</h3>
		<table align="center">
			<tr>
				<td></td>
				<td>Camper ID</td>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Age</td>
			</tr>
			<c:forEach items="${requestScope.allCampers}" var="allCampers">
			<tr>
				<td><input type="radio" name="id" value="${allCampers.id}"></td>
				<td>${allCampers.id}</td>
				<td>${allCampers.firstName}</td>
				<td>${allCampers.lastName}</td>
				<td>${allCampers.age}</td>
			</tr>
			</c:forEach>
		</table>
		<input type="submit" value="Delete" name="deleteCamper"><br />
	</form>
	<a href="index.jsp">Home</a>
	
</body>
</html>