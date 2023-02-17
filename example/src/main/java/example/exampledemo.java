package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class exampledemo {
	public static void main(String[] args) {
		String a="spring.xml";
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(a);
		spring sp = (spring)context.getBean("hi");
//		sp.show();
		context.close();
	}

}
