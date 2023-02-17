package controller;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.Test;

class bookservletTest {
	@Test
	public void test() throws ServletException, IOException  {
		
		
		new bookservlet() {
			
			{
				doGet(null, null);
			}
		};
	}

}
