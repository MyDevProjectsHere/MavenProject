<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ include file="Links.jsp" %>
  <%@ include file="Navigation.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>java crud app</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-10">
				
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
	
		<div class="contaier">
				
				<div class="row">
					
						<form class="form" action="GetAllUsers">
							<button type="submit" class="btn btn-md btn-dark px-5">Submit</button>
						</form>
				
				</div>
		
		</div>
	
	
	
</body>
</html>