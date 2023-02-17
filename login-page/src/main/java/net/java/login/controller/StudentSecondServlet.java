package net.java.login.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.java.login.dao.studentdao;
import net.java.login.model.student;

@SuppressWarnings("serial")
public class StudentSecondServlet extends HttpServlet{
	private studentdao stddao = new studentdao();
	 public StudentSecondServlet() {
	    	super();
	        // TODO Auto-generated constructor stub
	    }
	 
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			// TODO Auto-generated method stub
			/*String id = request.getParameter("id");
			String name = request.getParameter("name");
			String phno = request.getParameter("phno");*/
			student std = new student();
			std.setId(request.getParameter("id"));
			std.setName(request.getParameter("name"));
			std.setPhno(request.getParameter("phno"));
			try {
				stddao.sharada(std);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//response.sendRedirect("/WEB-INF/view/success.jsp");
			RequestDispatcher dis = request.getRequestDispatcher("/WEB-INF/view/success.jsp");
	  		dis.forward(request, response);
//	   	dopost(request, response);
//			dis.send(request, response);
			

		}

}
