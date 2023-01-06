<%@page import="com.Auth.model.ViewProfileModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Links.jsp" %>
    <%
		ViewProfileModel profile =(ViewProfileModel) request.getAttribute("profile");
		
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Viewing : <%= profile.getName() %> Profile</title>
<style>

	.card{
		box-shadow : 3px 3px 15px rgba(10,20,100,0.2);
		width:30vw;
	}
	.row{
	
		width:100%;
		height:100vh;
		display:flex;
		flex-direction:column;
		justify-content:center;
		align-items:center;
	}
	.btn{
		width:8rem;
		background-color:black;
		color:white;
		margin-top:10px;
		border:2px solid green;
	}
	
</style>
</head>
<body>
	
	<%-- <%
		ViewProfileModel profile =(ViewProfileModel) request.getAttribute("profile");
		
	%> --%>
		<div class="container">
		
			<div class="row mt-5">
				<h3 class="text text-center text-success mb-3"> You are viewing <%= profile.getName() %> profile</h3>
				
				
					<div class="card">
						
							<div class="card-body">
								<p class="text-end text-info"> <i class="fa fa-share"></i> </p>
								<p class="text text-left"> Name <i class="fa fa-user"></i>  &nbsp;  : <%= profile.getName() %></p>
								<p class="text text-left"> Email <i class="fa fa-envelope"></i>  &nbsp; :  &nbsp; <%= profile.getEmail() %></p>
								<p class="text text-left"> Age : <%= profile.getAge() %></p>
								<p class="text text-left"> Mobile <i class="fa fa-mobile"></i>  &nbsp; : <%= profile.getMobile() %></p>
								<p class="text text-left"> Address <i class="fas fa-map-marker-alt"></i>  &nbsp; : <%= profile.getAddress() %></p>
							
							<div class="d-flex flex-row justify-content-between">
							
								<form class="form" method="get" action="DeleteProfile">
							<input type="hidden" value=<%= profile.getId()%> name="Id"/>
								<button class="btn btn-md" type="submit">delete &nbsp; <i class="fa fa-trash"></i></button>
							</form>
							
							<form class="form" method="get" action="UpdateProfile">
							<input type="hidden" value=<%= profile.getId()%> name="Id"/>
							<input type="hidden" value=<%= profile.getAge()%> name="age"/>
							<input type="hidden" value=<%= profile.getName()%> name="name"/>
							<input type="hidden" value=<%= profile.getEmail()%> name="email"/>
							<input type="hidden" value=<%= profile.getMobile()%> name="mobile"/>
							<input type="hidden" value=<%= profile.getAddress()%> name="address"/>
								<button class="btn btn-md" type="submit">Update &nbsp; <i class="fa fa-edit"></i></button>
							</form>
							
							</div>
							</div>
					
					</div>
					
				
				
			</div>
			
		</div>
	<%
	%>
</body>
</html>