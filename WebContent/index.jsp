<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Camper Home Page</title>
</head>
<style>
	body {
		background-color: lightgray;
	}
	
	h1 {
		text-align: center;
		color: green;
	}
</style>
<body>
	<!-- Camp Chippewa is based on the movie Addams Family Values. I just watched it this weekend and have it stuck in my head.-->
	<h1><i>Welcome to the Camp Chippewa Summer Camp Program!</i></h1>
	<p>We are ready to introduce your children to as many new experiences as possible
	and help each child feel confident and secure in a fun and safe camp environment.
	We are dedicated to molding the lives of our campers as well as creating
	friendships and memories that will last a lifetime.</p>
	
	<p>It is our desire that staff and parents become partners to better serve your
	children. Camp Chippewa is a place for families and we want to do everything 
	possible to strengthen and support your family. Start below to get your camper started!</p>
	
	<table>
		<tr>
			<td><a href="addCamper.jsp">Register Now!</a></td>
		</tr>
		<tr>
			<td><a href="unregisterCamperServlet">Unregister a camper</a></td>
		</tr>
		<tr>
			<td><a href="deleteFoodServlet">Delete Food</a></td>
		</tr>
		<tr>
			<td><a href="deleteSuppliesServlet">Delete Supplies</a></td>
		</tr>
	</table>

	
</body>
</html>