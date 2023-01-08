package com.Auth.Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.Auth.model.UpdateProfileModel;
import com.Database.Connection.DbConnection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateProfileDao {

	public void updateProfile(UpdateProfileModel updateProfile,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher("UpdateProfile.jsp");
		rd.forward(request, response);
	}
}	
