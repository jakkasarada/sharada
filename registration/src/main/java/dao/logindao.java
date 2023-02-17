package dao;
import java.sql.*;

import model.Login;
public class logindao {
	public void login(Login log) throws ClassNotFoundException, SQLException {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/c","root","root");
		 String str =  "INSERT INTO login VALUES "
	    			+ " (?, ?, ?);";
		PreparedStatement ps = conn.prepareStatement(str);
		ps.setInt(1, Integer.parseInt(log.getId()));
	       ps.setString(2, log.getUser_name());
	       ps.setString(3,log.getPass_word());
	       ps.executeUpdate();
			conn.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
