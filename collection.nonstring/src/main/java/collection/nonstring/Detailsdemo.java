package collection.nonstring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Detailsdemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cnonweb.xml");
		Details d = (Details) context.getBean("detail");
		d.print();
		context.close();
	}

}
