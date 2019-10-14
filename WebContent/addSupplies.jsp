<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Some Supplies</title>
<style>
	body {
		background-color: lightgray;
	}
	
	h2 {
		text-align: center;
		color: green;
	}
</style>
</head>
<body>
<h2>Please enter a supply you would like to bring to camp and how much of that supply you are willing to bring.</h2>
	<form action = "addSuppliesServlet" method="post" ><br /><br />
	<table>
		<tr>  
			<td>Camping Item: <input type="text" name="supplyItem" ></td><br /><br />  
			<td>Quantity: <input type="text" name="supplyQTY" ></td><br /><br />
		</tr>
	</table>	 
		<input type = "submit" value= "AddSupplies" > 
	</form> <br /><br />

	<a href="index.jsp">Home</a>

</body>
</html>