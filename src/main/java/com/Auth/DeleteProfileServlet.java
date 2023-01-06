package com.Auth;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Auth.Dao.DeleteProfileDao;

import jakarta.servlet.http.*;
import jakarta.servlet.ServletException;
/**
 * Servlet implementation class DeleteProfileServlet
 */
public class DeleteProfileServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("Id"));
		
		//call DeleteProfileDao class
		DeleteProfileDao profile = new DeleteProfileDao();
		
		try {
			profile.deleteProfile(id, request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
