package spring.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employeedemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("addressweb.xml");
		employee emp = (employee) context.getBean("employee");
		emp.display();
		}
}
