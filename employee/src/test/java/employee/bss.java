package employee;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.jupiter.api.Test;

class bss {

	@Test
	public void book() throws ServletException, IOException {
		controller.booksecondservlet.doGet(null, null);
		
	}

}
