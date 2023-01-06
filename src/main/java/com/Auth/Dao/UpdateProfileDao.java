package com.Auth.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.Auth.model.UpdateProfileModel;
import com.Database.Connection.DbConnection;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateProfileDao {

	public void updateProfile(UpdateProfileModel updateProfile,HttpServletRequest request, HttpServletResponse response)
	{
		DbConnection obj = new DbConnection();
		try {
			String query = "UPDATE EmployeeDetails SET name = "+ updateProfile.getName().toString()+ ","+"email = "+ updateProfile.getEmail().toString()+","+"age = "+updateProfile.getAge()+","+"mobile = "+updateProfile.getMobile().toString()+","+"address = "+updateProfile.getAddress()+","+"age = "+updateProfile.getAge()+" WHERE Id="+ updateProfile.getId();
			Connection conn = obj.createConnection();
			Statement st = conn.createStatement();
			//set the values to the prepSt
			/*
			 * prepSt.setInt(1, updateProfile.getId());
			 * prepSt.setString(2,updateProfile.getName());
			 * prepSt.setInt(3,updateProfile.getAge()); prepSt.setString(4,
			 * updateProfile.getEmail()); prepSt.setString(5, updateProfile.getMobile());
			 * prepSt.setString(6, updateProfile.getAddress());
			 */
			
			int rowsEffected = st.executeUpdate(query);
			if(rowsEffected>=1) {
				response.sendRedirect("index.jsp");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("Error is : "+e.getMessage());
		}
	}
}	
