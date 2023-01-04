package com.Authentication;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Authentication.Dao.GetNameDao;
import com.Authentication.model.GetName;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
/**
 * Servlet implementation class getNameController
 */
public class getNameController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws jakarta.servlet.ServletException, IOException{
	
		int Id = Integer.parseInt(request.getParameter("name"));
		GetNameDao nameDao = new GetNameDao();
		GetName obj;
		try {
			obj = nameDao.getName(Id);
			request.setAttribute("name", obj);
			RequestDispatcher rd = request.getRequestDispatcher("showName.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	

}
