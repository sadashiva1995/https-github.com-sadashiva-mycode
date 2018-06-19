<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CreateEmpProfile</title>
</head>
<body>
	<form action="./createprofile" method="post">
		<fieldset>
			<legend>Create Profile</legend>
			<table>
				<tr>
					<td>Regno</td>
					<td><input type="text" name="regno" required="required"></td>
				</tr>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="fname" required="required"></td>
				</tr>
				<tr>
					<td>Middle Name</td>
					<td><input type="text" name="mname" required="required"></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lname" required="required"></td>
				</tr>
				<tr>
					<td>Guardian First Name</td>
					<td><input type="text" name="gfname" required="required"></td>
				</tr>
				<tr>
					<td>Guardian Middle Name</td>
					<td><input type="text" name="gmname" required="required"></td>
				</tr>
				<tr>
					<td>Guardian Last Name</td>
					<td><input type="text" name="glname" required="required"></td>
				</tr>
				<tr>
					<td>IsAdmin</td>
					<td><select name="isadmin" required="required">
							<option value="">---Select---</option>
							<option value="Y">Yes</option>
							<option value="N">No</option>
					</select></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" required="required"></td>
				</tr>
				<tr>
					<td><input type="submit"></td>
					<td><input type="reset"></td>
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>