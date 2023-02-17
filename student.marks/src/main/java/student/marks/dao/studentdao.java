package student.marks.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import student.marks.model.student;

public class studentdao {
	public void student(student std) throws ClassNotFoundException, SQLException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/c","root","root");
        String str = "INSERT INTO student_marks VALUES(?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(str);
        ps.setInt(1,Integer.parseInt(std.getId()));
        ps.setString(2,std.getStd_name());
        ps.setInt(3,Integer.parseInt(std.getSub1()));
        ps.setInt(4,Integer.parseInt(std.getSub2()));
        ps.setInt(5,Integer.parseInt(std.getSub3()));
        ps.executeUpdate();
        con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
        

	}
}
