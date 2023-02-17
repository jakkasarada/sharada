package mailling.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mailling.model.psmodel;

public class psdao {
	public void pass(psmodel pm) throws SQLException, ClassNotFoundException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/c","root","root");
		String str ="INSERT INTO ps VALUES(?, ?);";
		PreparedStatement ps = con.prepareStatement(str);
		ps.setString(1, pm.getUser_name());
		ps.setString(2, pm.getPassword());
		ps.executeUpdate();
		con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
;		}
	}

}
