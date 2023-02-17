package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.employee;

public class employeedao {
	public void sharada(employee emp) throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/c","root","root");
	        String str =  "INSERT INTO employee VALUES(?, ?, ?, ?, ?);";
			/*
			 * String str = "INSERT INTO login VALUES " + " (?, ?, ?);";
			 */
	       PreparedStatement ps = conn.prepareStatement(str);
	       ps.setInt(1, Integer.parseInt(emp.getEmpid()));
	       ps.setString(2, emp.getEmpname());
	       ps.setString(3,emp.getEmpdesc());
	       ps.setInt(4, Integer.parseInt(emp.getEmpphno()));
	       ps.setInt(5, Integer.parseInt(emp.getEmpadhar()));
	       ps.executeUpdate();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
