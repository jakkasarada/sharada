package student.marks.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.Test;

class studentsecondTest {

	
	HttpServletResponse resp;
	@Test
	public void student() throws ServletException, IOException {
		studentsecond ss = new studentsecond();
		ss.doGet(null, );
	}

}
