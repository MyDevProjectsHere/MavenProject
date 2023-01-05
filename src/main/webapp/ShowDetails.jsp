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
			
			for(GetAllUsers curUser: allUsers){
				%>
				<div class="card">
					<div class="card-body">
					
						<p class="text text-center text-success">
					<%= curUser.getId()+1 %>
				</p>
				
				<p class="text text-center text-success">
					<%= curUser.getName() %>
				</p>
				
				<p class="text text-center text-success">
					<%= curUser.getEmail() %>
				</p>
					</div>
				</div>
				<%
			}
		
		
	%>
	
</body>
</html>