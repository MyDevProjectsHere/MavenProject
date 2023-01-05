package com.Auth.Dao;

import com.Auth.CreateNewUser;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;
public class CreateNewUserDao extends HttpServlet {
	
	public int CreateNewUser(CreateNewUser newUserObj)  throws ClassNotFoundException {
		
		CreateNewUser newUser = new CreateNewUser();
		int count=0;
		/*
		 * newUser.setName("Goutham"); newUser.setAge(21);
		 * newUser.setEmail("abc@gmail.com"); newUser.setAddress("Hyderabad");
		 * newUser.setId(1); newUser.setMobile("+91 98xxxx"); return newUser;
		 */
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//db credentials
		String url = "jdbc:mysql://localhost:3306/demo";
		String dbname = "root";
		String dbpass = "#Goutham@422";
		String query = "INSERT INTO EmployeeDetails VALUES(?,?,?,?,?,?)";
		String selectQuery = "SELECT * FROM EmployeeDetails";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,dbname,dbpass);
			Statement st = conn.createStatement();
			ResultSet res = st.executeQuery(selectQuery);
			int rowCount = 0;
			
			//To Keep Track of Id for inserting
			while(res.next()) {rowCount++;}
			PreparedStatement prepSt = conn.prepareStatement(query);
			
			//set the values
			prepSt.setInt(1, rowCount); //Id
			prepSt.setString(2,newUserObj.getName()); //Name
			prepSt.setInt(3,newUserObj.getAge()); //Age
			prepSt.setString(4,newUserObj.getEmail()); //email
			prepSt.setString(5, newUserObj.getMobile()); //mobile
			prepSt.setString(6,newUserObj.getAddress()); //address
			
			
			//execute the query
			
			int rowsEffected = prepSt.executeUpdate();
			System.out.println(rowsEffected+ " row "+ "effected");
			count = rowsEffected;
			HttpServletRequest request = null;
			HttpServletResponse response = null;
			RequestDispatcher rd = request.getRequestDispatcher("ShowDetails.jsp");
			request.setAttribute("userDetails", count);
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("this is the error : "+e.getMessage());
		}
		return count;
		
	}
}
