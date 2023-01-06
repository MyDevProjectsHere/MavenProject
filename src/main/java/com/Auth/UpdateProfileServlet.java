package com.Auth;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Auth.Dao.UpdateProfileDao;
import com.Auth.model.UpdateProfileModel;

import jakarta.servlet.http.*;
import jakarta.servlet.ServletException;
/**
 * Servlet implementation class UpdateProfileServlet
 */
public class UpdateProfileServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("Id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String address = request.getParameter("address");
		int age = Integer.parseInt(request.getParameter("age"));
		
		//Create a object to hold the above prop
		UpdateProfileModel updateProfile = new UpdateProfileModel();
		updateProfile.setId(id);
		updateProfile.setName(name);
		updateProfile.setAge(age);
		updateProfile.setAddress(address);
		updateProfile.setEmail(email);
		updateProfile.setMobile(mobile);
		
		
		UpdateProfileDao profile = new UpdateProfileDao();
		profile.updateProfile(updateProfile,request,response);
	}

	

}
