package com.Auth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Auth.Dao.UpdateParticularProfileDao;
import com.Auth.model.UpdateParticularProfileModel;

import jakarta.servlet.http.*
;/**
 * Servlet implementation class UpadteParticularProfile
 */
import jakarta.servlet.ServletException;
public class UpadteParticularProfile extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String mobile = request.getParameter("mobile");
			String address = request.getParameter("address");
			int age = Integer.parseInt(request.getParameter("age"));
			int Id = Integer.parseInt(request.getParameter("Id"));
			
			
			//Create a Class UpdateParticularProfileModel
			
			UpdateParticularProfileModel obj = new UpdateParticularProfileModel();
			
			//Set the values 
			
			obj.setName(name);
			obj.setEmail(email);
			obj.setMobile(mobile);
			obj.setAddress(address);
			obj.setAge(age);
			obj.setId(Id);
			
			//Call the Dao Object to carry forward the process
			
			UpdateParticularProfileDao profileDao = new UpdateParticularProfileDao();
			profileDao.updateParticularProfile(obj,request,response);
	}

}
