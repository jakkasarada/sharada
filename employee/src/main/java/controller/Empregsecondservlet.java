package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.employeedao;
import model.employee;

/**
 * Servlet implementation class Empregsecondservlet
 */
@SuppressWarnings("seriel")
public class Empregsecondservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	employeedao empdao= new employeedao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Empregsecondservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		employee emp = new employee();
		emp.setEmpid(request.getParameter("empid"));
		emp.setEmpname(request.getParameter("empname"));
		emp.setEmpdesc(request.getParameter("empdesc"));
		emp.setEmpphno(request.getParameter("empphno"));
		emp.setEmpadhar(request.getParameter("empadhar"));
		try {
			empdao.sharada(emp);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher dis = request.getRequestDispatcher("/WEB-INF/view/empsuccess.jsp");
  		dis.forward(request, response);
  		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);*/

}
