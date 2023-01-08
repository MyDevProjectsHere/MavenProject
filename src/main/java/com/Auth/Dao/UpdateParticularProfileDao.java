package com.Auth.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.Auth.model.UpdateParticularProfileModel;
import com.Database.Connection.DbConnection;

public class UpdateParticularProfileDao {

		public void updateParticularProfile(UpdateParticularProfileModel profile,HttpServletRequest request, HttpServletResponse response) {
			
			DbConnection conn = new DbConnection();
			String query = "UPDATE EmployeeDetails SET name=? , email=?, mobile=? WHERE Id="+profile.getId(); 
			try {
				
				Connection con = conn.createConnection();
				PreparedStatement st = con.prepareStatement(query);
				st.setString(1, profile.getName());
				st.setString(2, profile.getEmail());
				st.setString(3, profile.getMobile());
				int res = st.executeUpdate();
				System.out.print("rows effected : "+res);
				response.sendRedirect("index.jsp");
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error ouccred in UpdateParticularProfileDao : "+e.getMessage());
			}
		}
}
