package example1.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employeespring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("employeeweb.xml");
		Employee emp = (Employee) context.getBean("emp");
//		emp.a();
		Employee emp1 = (Employee) context.getBean("emp1");
//		emp1.a();
		System.out.println(emp);
		System.out.println(emp1);
		context.close();
	}
}
