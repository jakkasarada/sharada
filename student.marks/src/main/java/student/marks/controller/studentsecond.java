package student.marks.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.marks.dao.studentdao;
import student.marks.model.student;

/**
 * Servlet implementation class studentsecond
 */
public class studentsecond extends HttpServlet {
	private static final long serialVersionUID = 1L;
	studentdao stddao =new studentdao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public studentsecond() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		student std = new student();
		std.setId(request.getParameter("id"));
		std.setStd_name(request.getParameter("name"));
		std.setSub1(request.getParameter("sub1"));
		std.setSub2(request.getParameter("sub2"));
		std.setSub3(request.getParameter("sub3"));
		try {
			stddao.student(std);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rs = request.getRequestDispatcher("/WEB-INF/view/studentprint.jsp");
		rs.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
