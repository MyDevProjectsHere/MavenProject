package com.Auth;

import java.io.IOException;
import java.io.PrintWriter;

import com.Auth.Dao.CreateNewUserDao;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.*;

/**
 * Servlet implementation class CreateUserServlet
 */
public class CreateUserServlet extends HttpServlet {
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("userName");
		String userEmail = request.getParameter("userEmail");
		String userAddress = request.getParameter("userAddress");
		String userMobile = request.getParameter("userMobile");
		int userAge = Integer.parseInt(request.getParameter("userAge"));
		
		//CreatenewUser class to store the userData
		CreateNewUser userData = new CreateNewUser();
		userData.setName(userName);
		userData.setAge(userAge);
		userData.setEmail(userEmail);
		userData.setAddress(userAddress);
		userData.setMobile(userMobile);
		
		
		CreateNewUserDao cnDao = new CreateNewUserDao();
		
		//Model class
		
		int rows = 0;
		try {
			rows = cnDao.CreateNewUser(userData);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("ShowDetails.jsp");
		request.setAttribute("userDetails", rows);
		rd.forward(request, response);
		
		
	}

	

}
