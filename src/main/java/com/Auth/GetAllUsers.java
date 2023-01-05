package com.Auth;

import java.io.IOException;

import com.Auth.Dao.GetAllUsersDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
/**
 * Servlet implementation class GetAllUsers
 */
public class GetAllUsers extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Create a class for GetAllUsers
		GetAllUsers obj = new GetAllUsers();
		GetAllUsersDao gaDao = new GetAllUsersDao();
		try {
			gaDao.getAllUserData(request,response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
