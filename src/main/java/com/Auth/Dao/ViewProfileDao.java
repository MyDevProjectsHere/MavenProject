package com.Auth.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.Auth.model.ViewProfileModel;
import com.Database.Connection.DbConnection;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ViewProfileDao {
	
	public ViewProfileModel viewProfile(int Id,HttpServletRequest request, HttpServletResponse response) {
		
		ViewProfileModel profile = new ViewProfileModel();
		
		try {
			DbConnection obj = new DbConnection();
			Connection conn = obj.createConnection();
			
			//write your query here
//			Id++; // because the value of index is starting from 0 but it should be 1
			
			String query  = "SELECT * FROM EmployeeDetails WHERE Id = "+Id;
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			if(rs.next())
			{
				profile.setName(rs.getString("name"));
				profile.setEmail(rs.getString("email"));
				profile.setAge(rs.getInt("age"));
				profile.setId(rs.getInt("Id"));
				profile.setMobile(rs.getString("mobile"));
				profile.setAddress(rs.getString("Address"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return profile;
	}
}
