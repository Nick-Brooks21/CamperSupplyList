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
	background-color: black;
}

h3, td {
	color: lightgray;
	text-align: center;
}

table, td {
	border: 1px solid royalblue;
	padding: 10px;
}
</style>
</head>
<body>
	<form>
	<h3>We are sorry to hear that you no longer want to attend our summer program here at Camp Chippewa. Select your name from the list of 
	campers below to unregister.</h3>
		<table>
			<tr>
				<td></td>
				<td>Camper ID</td>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Age</td>
			</tr>
			<c:forEach items="${requestScope.allCampers}" var="camper">
			<tr>
				<td><input type="radio" id="radioSelect" name="radio" /></td>
				<td>${camper.id}</td>
				<td>${camper.firstName}</td>
				<td>${camper.lastName}</td>
				<td>${camper.age}</td>
			</tr>
			</c:forEach>
		</table>
	</form>

</body>
</html>