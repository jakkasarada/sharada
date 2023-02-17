package example2;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Logindemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("login.xml");
		Login l = (Login) context.getBean("log");
//		System.out.println(l);
//		Login l1 = (Login) context.getBean("log1");
		System.out.println(l.add(8, 9));
		context.close();
	}

}
