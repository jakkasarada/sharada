package hello.java.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class methodTest {

	@Test
	void test() {
		method m = new method();
		String s = "jagadeesh";
		int a = 38;
		int b = 89;
		m.print(a,b,s);
	}

}
