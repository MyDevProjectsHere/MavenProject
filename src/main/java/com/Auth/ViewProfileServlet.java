package com.Auth;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Auth.Dao.ViewProfileDao;
import com.Auth.model.ViewProfileModel;

import jakarta.servlet.http.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
/**
 * Servlet implementation class ViewProfileServlet
 */
public class ViewProfileServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Grab the Id
		
		int Id = Integer.parseInt(request.getParameter("Id"));
		ViewProfileDao profileDao = new ViewProfileDao();
		//Create a ViewProfileModel obj to hold data returned by dao class
		ViewProfileModel profile = profileDao.viewProfile(Id,request,response); 
		
		request.setAttribute("profile", profile);
		//Dispatch to viewProfile
		RequestDispatcher rd = request.getRequestDispatcher("ViewProfile.jsp");
		rd.forward(request, response);
	}

	
}
