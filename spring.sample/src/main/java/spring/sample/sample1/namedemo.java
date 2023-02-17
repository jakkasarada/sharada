package spring.sample.sample1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class namedemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("nameweb.xml");
		name name = (name) context.getBean("name");
		name.print();
		context.close();
		
	}

}
