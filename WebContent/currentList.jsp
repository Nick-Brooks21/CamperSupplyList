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
	<h1 class="page-title">Camping Supplies List</h1>
	<table>
		<c:forEach camper="${requestScope.allCampers}" var="currentCamper">
			<tr>
				<th class="camperName">Camper Name Here</th>
				<td class="foodList">Food here</td>
				<td class="suppliesList">Supplies Here</td>
			</tr>

		</c:forEach>
	</table>
	<a class="home" href="index.jsp">Home</a>
</body>
</html>