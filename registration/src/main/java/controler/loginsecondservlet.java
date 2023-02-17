package controler;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.logindao;
import model.Login ;

@SuppressWarnings("serial")
public class loginsecondservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	logindao logdao = new logindao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginsecondservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Login log= new Login();
		log.setId(request.getParameter("id"));
		log.setUser_name(request.getParameter("user-name"));
		log.setPass_word(request.getParameter("pass-word"));
		try {
		logdao.login(log);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dis = request.getRequestDispatcher("/WEB-INF/view/loginsuccess.jsp");
		dis.forward(request, response);
	
	}

}
