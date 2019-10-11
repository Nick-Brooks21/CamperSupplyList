<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Some Food</title>
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

<h2>Please enter food you wish to bring to camp and how much you are willing to bring.</h2>
	<form action = "addFoodServlet" method="post" ><br /><br />
	<table>
		<tr> 
			<td>Food Type: <input type="text" name="foodType" ></td><br /><br />  
			<td>Quantity: <input type="text" name="foodQTY" ></td><br /><br />
		</tr>
	</table> 	 
		<input type = "submit" value= "AddFood" > 
	</form> <br /><br />

	<a href="index.jsp">Home</a>
</body>
</html>