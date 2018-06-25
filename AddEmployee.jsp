<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html lang="en">

<head>

<meta charset="UTF-8">

<title>Add Employee Details</title>

<link rel="stylesheet" href="./resources/AddEmp.css">

<link rel="stylesheet" href="css/bootstrap.min.css">

<!--  <link rel="stylesheet" href="css/bootstrap.css">-->

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">



</head>

<body>

	<div class="container cl">

		<h1 class="well">Add Employee Details</h1>

	</div>

	<div class="container cl">

		<div class="col-sm-12 well">

			<div class="row">

				<form  method="post"  action="./submit" >

					<div class="col-sm-12">

						<div class="row">

							<div class=" col-sm-6 form-group">

								<label>Emp Id</label> <input type="text"
									placeholder="Enter Emp Id Here.." name="Emp_ID"
									class="form-control">

							</div>

							<div class=" col-sm-6 form-group">

								<label>Dept Id</label> <input type="text"
									placeholder="Enter Emp Dept Id Here.." name="Emp_Dept_ID"
									class="form-control">

							</div>

						</div>

						<div class="row">

							<div class="col-sm-6 form-group">

								<label>First Name</label> <input type="text"
									placeholder="Enter First Name Here.." name="Emp_First_Name"
									class="form-control">

							</div>

							<div class="col-sm-6 form-group">

								<label>Last Name</label> <input type="text"
									placeholder="Enter Last Name Here.." name="Emp_Last_Name"
									class="form-control">

							</div>

						</div>

						<div class="row">

							<div class="col-sm-6 form-group">
								<!-- Date input -->

								<label>Date of Joining</label> <input type="date"
									class="form-control" name="Emp_Date_of_Joining" />

							</div>

							<div class="col-sm-6 form-group">
								<!-- Date input -->

								<label>Date of Birth</label> <input type="date"
									class="form-control" name="Emp_Date_of_Birth" />

							</div>

						</div>

						<div class="form-group">

							<label>Address</label>

							<textarea placeholder="Enter Address Here.." rows="3"
								class="form-control" name="Emp_Home_Address"></textarea>

						</div>





						<div class="row">

							<div class="col-sm-4 form-group">

								<label>Phone Number</label> <input type="text"
									placeholder=" Enter Phone No Here.." name="Emp_Contact_Num"
									class="form-control">

							</div>

							<div class="col-sm-4 form-group">

								<label>Designation</label> <input type="text"
									placeholder="Enter Emp Designation Here.."
									name="Emp_Designation" class="form-control">

							</div>

							<div class="col-sm-4 form-group">

								<label>Gender</label>

								<!-- <input type="text" placeholder="Enter Zip Code Here.." class="form-control">-->

								<select class="form-control" name="Emp_Gender">

									<option>M</option>

									<option>F</option>

								</select>

							</div>

						</div>

						<div class="row">

							<div class="col-sm-4 form-group">

								<label>Grade</label> <select class="form-control"
									name="Emp_Grade">

									<option>M1</option>

									<option>M2</option>

									<option>M3</option>

									<option>M4</option>

									<option>M5</option>

									<option>M6</option>

									<option>M7</option>



								</select>

							</div>

							<div class="col-sm-4 form-group">

								<label>Marital Status</label> <select class="form-control"
									name="Emp_Marital_Status">

									<option>Single</option>

									<option>Married</option>

									<option>Divorced</option>

									<option>Separated</option>

									<option>Widowed</option>



								</select>

							</div>

							<div class="col-sm-4 form-group">

								<label>Basic Pay</label> <select class="form-control"
									name="Emp_Basic">

									<option>0-l.5 lc</option>

									<option>1.5-3 lc</option>

									<option>3-5 lc</option>

									<option>5-7 lc</option>

									<option>7-10 lc</option>



								</select>

							</div>

							<div class="col-sm-4 form-group">

								<label>user Type</label> <input type="text"
									placeholder="Enter userType Here.." name="userType"
									class="form-control">

							</div>

							<div class="col-sm-4 form-group">

								<label>User Password</label> <input type="text"
									placeholder="Enter userPassword Here.." name="userPassword"
									class="form-control">

							</div> 


						</div>


						<input type="submit" class="btn btn-lg btn-info ">submit</input> 
						<input type="reset" class="btn btn-lg btn-info "> reset</input>


					</div>

				</form>


			</div>

		</div>

	</div>

	 <h1>${msg}</h1>

</body>

</html>