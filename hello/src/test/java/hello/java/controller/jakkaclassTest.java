package hello.java.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class jakkaclassTest {

	@Test
	void test() {
		jakka j = mock(jakka.class);
		List<String> combinedlist = Arrays.asList(" Use Core Java ", " Use Spring Core ", " Use w3eHibernate ", " Use Spring MVC ");  
        when(j.getTodos("dummy")).thenReturn(combinedlist); 
        jakkaclass jc = new jakkaclass(j);
        List<String> alltd = jc.getTodosforHibernate("dummy");   
        
        System.out.println(alltd);  
        assertEquals(1, alltd.size());  
	}

}
