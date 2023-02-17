package hello.java.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestTest {
	@Test
	public void testMain()
	{
		String[] arr = {"60"};
		hello.java.controller.Test.main(arr);
		
	}
	@Test
	public void testMainFalse() {
		String[] arr = {};
		hello.java.controller.Test.main(arr);
	}
@Test
public void testgetAgeMultiple() {
	int age= hello.java.controller.Test.getAgeMultiple(60);
	Assert.assertEquals(120, age);
	
}
}
