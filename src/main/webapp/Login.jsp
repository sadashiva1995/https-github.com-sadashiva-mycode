<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login here</title>
</head>
<body>
	<fieldset>
		<legend>Login Page</legend>
		<form action="./Login" method="post">
			<table>
				<tr>
					<td>User_ID:</td>
					<td><input type="text" name="User_ID" ></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name=Password></td>
				</tr>
				
				<tr>
					<td><input type="submit"></td>
					<td><input type="reset"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	
</body>
</html>


