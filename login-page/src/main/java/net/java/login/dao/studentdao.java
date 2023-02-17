package net.java.login.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

import net.java.login.model.student;

public class studentdao {
	public void sharada(student std) throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/b","root","root");
	        String str =  "INSERT INTO table1" + "  (id, name, phno) VALUES "
	    			+ " (?, ?, ?);";
	       PreparedStatement ps = conn.prepareStatement(str);
	       ps.setInt(1, Integer.parseInt(std.getId()));
	       ps.setString(2, std.getName());
	       ps.setInt(3, Integer.parseInt(std.getPhno()));
	       ps.executeUpdate();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
