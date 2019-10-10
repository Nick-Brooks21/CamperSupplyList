<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Add Some Supplies</title>
</head>
<body>
	<form action = "addSuppliesServlet" method="post" ><br /><br />  
		Camping Item: <input type="text" name="supplyItem" ><br /><br />  
		Quantity: <input type="text" name="supplyQTY" ><br /><br /> 
		<input type = "submit" value= "AddSupplies" > 
	</form> <br /><br />

	<a href="index.jsp">Home</a>

</body>
</html>