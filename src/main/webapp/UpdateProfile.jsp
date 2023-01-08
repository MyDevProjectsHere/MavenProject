<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Links.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Profile</title>
</head>
<body>
	<h3 class="text text-center">Update Profile</h3>
	<%
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String address = request.getParameter("address");
		int age = Integer.parseInt(request.getParameter("age"));
		int Id = Integer.parseInt(request.getParameter("Id"));
		
		
	%>
	<!-- Update Profile Form -->
		
		<div class="container">
			<div class="row">
				
				<div class="col-lg-8">
					
					<form action="UpdateParticularProfile" method="POST">
						
						<div class="form-group my-3">
							<label class="text text-success">Name &nbsp; </label>
							<input type="text" name="name" value=<%=name %> class="form-control mt-2"/>
							
						</div>
						
						<div class="form-group my-3">
							<label class="text text-success">Email  </label>
							<input type="email" name="email" value=<%=email %> class="form-control mt-2"/>
							
						</div>
						
						<div class="form-group my-3">
							<label class="text text-success">Mobile  </label>
							<input type="text" name="mobile" value=<%=mobile %> class="form-control mt-2"/>
							
						</div>
						
						<div class="form-group my-3">
							<label class="text text-success">Address </label>
							<input type="text" name="name" value=<%=address%> class="form-control mt-2"/>
							
						</div>
						
						<div class="form-group my-3">
							<label class="text text-success">Age  </label>
							<input type="number" name="age" value=<%=age %> class="form-control mt-2"/>
							
						</div>
						
						<div class="form-group my-3">
							
							<input type="hidden" name="Id" value=<%=Id %> class="form-control"/>
							
						</div>
				
						<button class="btn btn-md btn-warning px-5" type="submit">update profile &nbsp; <i class="fa fa-edit"></i></button>
					
					</form>
						
				</div>
				
			</div>
		
		</div>
	
</body>
</html>