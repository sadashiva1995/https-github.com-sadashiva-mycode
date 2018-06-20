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
					<td>Emp_ID</td>
					<td><input type="text" name="Emp_ID" required="required"></td>
				</tr>
				<tr>
					<td>Emp_first_name</td>
					<td><input type="text" name="Emp_first_name" required="required"></td>
				</tr>
				<tr>
					<td>Emp_last_name</td>
					<td><input type="text" name="Emp_last_name" required="required"></td>
				</tr>
				<tr>
					<td>Emp_Date_of_Birth</td>
					<td><input type="text" name="Emp_Date_of_Birth" required="required"></td>
				</tr>
				<tr>
					<td>Emp_Date_of_Joining</td>
					<td><input type="text" name="Emp_Date_of_Joining" required="required"></td>
				</tr>
				<tr>
					<td>Emp_Dept_ID</td>
					<td><input type="text" name="Emp_Dept_ID" required="required"></td>
				</tr>
				<tr>
					<td>Emp_Grade</td>
					<td><input type="text" name="Emp_Grade" required="required"></td>
				</tr>
				<tr>
					<td>Emp_Designation</td>
					<td><input type="text" name="Emp_Designation" required="required"></td>
				</tr>
				<tr>
					<td>Emp_Basic</td>
					<td><input type="text" name="Emp_Basic" required="required"></td>
				</tr>
				
				<tr>
					<td>Emp_Gender</td>
					<td><select name="Emp_Gender" required="required">
							<option value="">---Select---</option>
							<option value="M">Male</option>
							<option value="F">Female</option>
					</select></td>
				</tr>
				<tr>
					<td>Emp_Marital_Status</td>
					<td><select name="Emp_Marital_Status" required="required">
							<option value="">---Select---</option>
							<option value="Single">Single</option>
							<option value="Married">Married</option>
					</select></td>
				</tr>
				
				<tr>
					<td>Emp_Home_Address</td>
					<td><input type="text" name="Emp_Home_Address" required="required"></td>
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