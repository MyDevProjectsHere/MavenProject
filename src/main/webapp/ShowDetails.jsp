<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.Auth.model.GetAllUsers"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Links.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		ArrayList<GetAllUsers>allUsers = (ArrayList<GetAllUsers>) request.getAttribute("allUsersArr");
		
			Iterator it = 	allUsers.iterator();
			
			%>
			<%-- for(GetAllUsers curUser: allUsers){
				%>
				
				<%
			} --%>
			
			<div class="container">
			
				<div class="row">
					<%
						
					for(GetAllUsers curUser : allUsers){
						
						%>
						<div class="col-lg-4 mt-5">
							
							<div class="card">
					<div class="card-body">
					<% int rowId = curUser.getId(); %>
						<p class="text text-center text-success">
					<%= rowId+1 %>
				</p>
				
				<p class="text text-center text-success">
					<%= curUser.getName() %>
				</p>
				
				<p class="text text-center text-success">
					<%= curUser.getEmail() %>
				</p>
					</div>
					
					<div class="card-footer d-flex flex-row justify-content-between">
						
						<form action="ViewProfile">
						<input type="hidden" value=<%= curUser.getId() %> name="Id" id="userId"/>
							<button class="btn btn btn-primary">view profile &nbsp; &nbsp; <i class="fa fa-user"></i></button>
						</form>
						<%-- <form action="UpdateProfile">
						<input type="hidden" value=<%= curUser.getId() %> name="Id" id="userId"/>
							<button class="btn btn-md btn-warning">edit profile &nbsp; &nbsp; <i class="fa fa-trash"></i></button>
						</form> --%>
					</div>
				</div>
						
						</div>
						
						<% 
					}
					
					%>
				
				</div>
			</div>
			<%
		
		
	%>
	
</body>
</html>