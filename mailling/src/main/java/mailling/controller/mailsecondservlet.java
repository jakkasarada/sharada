package mailling.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mailling.dao.maildao;
import mailling.model.mailmodel;

/**
 * Servlet implementation class mailsecondservlet
 */
public class mailsecondservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	maildao mdo = new maildao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mailsecondservlet(){
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		mailmodel mm = new mailmodel();
		mm.setName(request.getParameter("name"));
		mm.setFather_name(request.getParameter("fname"));
		mm.setDob(request.getParameter("dob"));
		mm.setPhno(request.getParameter("phno"));
		mm.setMail(request.getParameter("mail"));
		try {
			mdo.mail(mm);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rs = request.getRequestDispatcher("/WEB-INF/view/mailview123.jsp");
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
