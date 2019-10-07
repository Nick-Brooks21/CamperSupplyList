<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Some Supplies</title>
</head>
<body>
	<form action = "addFoodServlet" method="post" ><br /><br />  
		Camping Item: <input type="text" name="supplyItem" ><br /><br />  
		Quantity: <input type="text" name="supplyQTY" ><br /><br /> 
		<input type = "submit" value= "AddSupplies" > 
	</form> <br /><br />

	<a href="index.jsp">Home</a>

</body>
</html>