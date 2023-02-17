package database.connectivity.sample;

import org.springframework.jdbc.core.JdbcTemplate;

public class studentdao {
	private JdbcTemplate jdbctemplate;
	public void setJdbcTemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate=jdbctemplate;
	}
	public int records(student std) {
		@SuppressWarnings("unused")
		String query = "insert into student values('"+std.getStdid()+"','"+std.getName()+"','"+std.getPhno()+"','"+std.getEmail()+"')";
		return jdbctemplate.update(query);
	}
	public int update(student std) {
		String query = "update student set name='"+std.getName()+"',mail='"+std.getEmail()+"' where stdid='"+std.getStdid()+"'";
		return jdbctemplate.update(query);
	}
	public int delete(student std) {
		String query = "delete from student where stdid='"+std.getStdid()+"'";
		return jdbctemplate.update(query);
	}
	

}
