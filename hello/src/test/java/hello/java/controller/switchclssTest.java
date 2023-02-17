package hello.java.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class switchclssTest {

	@Test
	void test() {
		switchclss ss = new switchclss();
		ss.tree();
	}
	@Test
	void itr()
	{
		switchclss ss = new switchclss();
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("a", "b"));
		/* list.addall("sharada","jagadeesh"); */
		ss.list(null);
	}

}
