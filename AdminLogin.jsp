<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>



<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
<link rel="stylesheet" href="./resources/AdminCss.css">

<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<!--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">-->
</head>
<body>
	<div class="container">
		<div class="col-md-4 col-md-offset-4">
			<section>
				<div class="panel panel-default top caja">
					<div class="panel-body">
						<h3 class="text-center">Admin Login</h3>

						<form action="./submit" method="post">
							<div class="input-group input-group-lg">
								<span class="input-group-addon" id="sizing-addon1"><i
									class="fa fa-user" aria-hidden="true"></i></span> <input type="EmpId"
									name="emp_ID" id="emp_ID" class="form-control"
									placeholder="Emp_ID" aria-describedby="sizing-addon1" required>
							</div>
							<br>
							<div class="input-group input-group-lg">
								<span class="input-group-addon" id="sizing-addon1"><i
									class="fa fa-key" aria-hidden="true"></i></span> <input
									type="password" name="userPassword" id="password"
									class="form-control" placeholder="Password"
									aria-describedby="sizing-addon1" required>
							</div>
							<br>
							<button type="submit" class="btn btn-primary btn-block">Login</button>

						</form>
					</div>
				</div>
			</section>
		</div>

	</div>
</body>
</html>