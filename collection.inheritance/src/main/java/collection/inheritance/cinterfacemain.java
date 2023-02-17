package collection.inheritance;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class cinterfacemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ciweb.xml");
		Cinheritance cin = (Cinheritance) context.getBean("e2");
//		Cinheritance cin1 = (Cinheritance) context.getBean("c1");
		cin.show();
		context.close();

	}

}
