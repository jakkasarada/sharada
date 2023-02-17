package mailling.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mailling.model.mailmodel;

public class maildao {
	public void mail(mailmodel mm) throws ClassNotFoundException, SQLException{
		try {
			System.out.println("method started:insert");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/c","root","root");
		String str = "INSERT INTO mail VALUES(?, ?, ?, ?, ?);";
		PreparedStatement ps = con.prepareStatement(str);
		ps.setString(1,mm.getName());
		ps.setString(2,mm.getFather_name());
		ps.setInt(3,Integer.parseInt(mm.getDob()));
		ps.setInt(4,Integer.parseInt(mm.getPhno()));
		ps.setString(5,mm.getMail());
		ps.executeUpdate();
		con.close();
		System.out.println("endedinsert");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("error"+e.getMessage());
		}
	}
}
