package com.Auth.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Auth.model.DeleteProfileModel;
import com.Database.Connection.DbConnection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteProfileDao {
	
	public void deleteProfile(int Id,HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException
	{
		DbConnection obj = new DbConnection();
		Connection conn = obj.createConnection();
		try {
			String query = "DELETE FROM EmployeeDetails WHERE Id="+Id;
			PreparedStatement st = conn.prepareStatement(query);
			int rs = st.executeUpdate(query);
			if(rs>0)
			{
				response.sendRedirect("index.jsp");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error is : "+e.getMessage());
		}
		
	}
	
	
	
}
