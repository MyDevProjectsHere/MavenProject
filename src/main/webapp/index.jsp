<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ include file="Links.jsp" %>
  <%@ include file="Navigation.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>java crud app</title>
<style>
	.container-fluid{
		width:100vw;
		height:100vh;
		display:flex;
		flex-direction:"column";
		justify-content:center;
		align-items:center;
		background-color:black;
	}
	input{
	width:40vw !important;
	}
</style>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-10">
				<h1 class="text text-success text-center">Create New USER Form</h1>
				<form action="CreateNewUser" class="form" method="post">
					<div class="form-group my-3">
						
							<input type="text" name="userName" placeholder="Enter your name" class="form-control"/>
					
					</div>
					
					<div class="form-group my-3">
						
							<input type="text" name="userAge" placeholder="Enter your age" class="form-control"/>
					
					</div>
					
					
					<div class="form-group my-3">
						
							<input type="email" name="userEmail" placeholder="Enter your email" class="form-control"/>
					
					</div>
					
					
					<div class="form-group my-3">
						
							<input type="text" name="userMobile" placeholder="Enter your mobile" class="form-control"/>
					
					</div>
					
					<div class="form-group my-3">
						
							<input type="text" name="userAddress" placeholder="Enter your address" class="form-control"/>
					
					</div>
					
					<button class="btn btn-md btn-success px-5">Signup</button>
				</form>
				
			</div>
		</div>
	</div>
	
		<div class="container-fluid">
				
				<div class="row">
					<h1 class="text text-center text-success">Get All Users</h1>
						<div class="col-lg-12">
							<form class="form" action="GetAllUsers">

								<button type="submit" class="btn btn-md btn-dark px-5">show all users</button>
							</form>
						
						</div>
				
				</div>
		
		</div>
	
	
</body>
</html>