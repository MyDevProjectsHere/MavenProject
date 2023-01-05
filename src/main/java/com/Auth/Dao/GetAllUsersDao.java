package com.Auth.Dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.Auth.model.GetAllUsers;
import com.Database.Connection.DbConnection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GetAllUsersDao extends HttpServlet{

	public void getAllUserData(HttpServletRequest request,HttpServletResponse response) throws ClassNotFoundException, ServletException, IOException {
		DbConnection dbObj = new DbConnection();
		
		//call the dbObj function
		
		Connection conn;
		String query = "SELECT * FROM EmployeeDetails";
		PrintWriter out = response.getWriter();
		try {
			
			conn = dbObj.createConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			
			
			int count = 0;
//			GetAllUsers allUsersArr[] = new GetAllUsers[maxArrSize];
			ArrayList<GetAllUsers> allUsersArr = new ArrayList<GetAllUsers>();
			
			while(rs.next())
			{
				GetAllUsers users = new GetAllUsers();
				users.setName(rs.getString("name"));
				users.setEmail(rs.getString("email"));
				users.setMobile(rs.getString("mobile"));
				users.setAge(rs.getInt("age"));
				users.setAddress(rs.getString("address"));
				users.setId(rs.getInt("Id"));
				
				allUsersArr.add(users);
				count++;
			}
			
//			out.println("");out.println("");
			
			request.setAttribute("allUsersArr", allUsersArr);
			RequestDispatcher rd = request.getRequestDispatcher("ShowDetails.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			out.print(e.getMessage());
		}
	}
}
