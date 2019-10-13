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
<form method="post" action="deleteSuppliesServlet">
		<table align="center">
			<tr>
				<td></td>
				<td>Supply Id</td>
				<td>Supply Type</td>
				<td>Quantity</td>
			</tr>
			<c:forEach items="${requestScope.allSupplies}" var="supply">
			<tr>
				<td><input type="radio" id="radioSelect" name="radio" /></td>
				<td>${supply.id}</td>
				<td>${supply.supplyItem}</td>
				<td>${supply.quantity}</td>
			</tr>
			</c:forEach>
		</table>
		<input type="submit" value="Delete" name="deleteFood"><br />
	</form>
	<a href="index.jsp">Home</a>

</body>
</html>