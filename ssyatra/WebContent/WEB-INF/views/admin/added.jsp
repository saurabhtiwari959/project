<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>


<sf:form method="POST" modelAttribute="travelOwner">
<table>
<tr>
				<td>Enter Travel Agency Name</td>
				<td><sf:input  path="tname" /></td>
</tr>

<tr>
				<td>Enter Travel Agency Mail Id</td>
				<td><sf:input  path="uname" /></td>
</tr>


<tr>
				<td>Enter Password</td>
				<td><sf:input  path="password" /></td>
</tr>

<tr>
				<td>Enter Date</td>
				<td><sf:input type="date" path="dob" /></td>
</tr>

<tr>
				<td>Enter Contact Number</td>
				<td><sf:input  path="conact" /></td>
</tr>


<tr>
				<td>Enter GST Number</td>
				<td><sf:input  path="gstNumber" /></td>
</tr>
<tr>
				<td><input type="submit" value="Register Me"></td>
				</tr>
				</table>
				</sf:form>
				</body>
				</html>