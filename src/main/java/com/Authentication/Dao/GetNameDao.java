package com.Authentication.Dao;

import com.Authentication.model.GetName;
import java.sql.*;
public class GetNameDao {
	
	public GetName getName(int Id) throws SQLException {
		
		
		GetName obj = new GetName();

		
		try {
			
			String url = "jdbc:mysql://localhost:3306/demo";
			String dbname = "root";
			String dbpass = "#Goutham@422";
			
			//String query = "SELECT * from EmployeeDetails where Id="+Id;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,dbname,dbpass);
			Statement st = conn.createStatement();
			ResultSet res = st.executeQuery("SELECT * from EmployeeDetails where Id="+Id);
			if(res.next())
			{
				obj.setName(res.getString("name"));
				obj.setId(res.getInt("Id"));
				obj.setAge(res.getInt("age"));
				obj.setEmail(res.getString("email"));
				obj.setSalry(res.getString("salry"));
				obj.setEmpAddress(res.getString("empAddress"));
				
			}
			else {
				obj.setErroMessage("No Data Found");
			}
			
			st.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		return obj;
	}
}
