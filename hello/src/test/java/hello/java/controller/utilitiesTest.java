package hello.java.controller;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
@RunWith(PowerMockRunner.class)  
@PrepareForTest(utilities.class)  
public class utilitiesTest {
	@Mock
	utilities u;

	@Test
	void test() { 
		      
			    int call=4;  
			   int c = 9;  
			      
			      
			    PowerMockito.when(u.sub(call)).thenReturn(c);  
			      
			    int actualcall = utilities.sub(call);  
			    assertEquals(c, actualcall);  
	}

}
