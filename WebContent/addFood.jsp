<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Add Some Food</title>
</head>
<body>
	<form action = "addFoodServlet" method="post" ><br /><br />  
		Food Type: <input type="text" name="foodType" ><br /><br />  
		Quantity: <input type="text" name="foodQTY" ><br /><br /> 
		<input type = "submit" value= "AddFood" > 
	</form> <br /><br />

	<a href="index.jsp">Home</a>
</body>
</html>