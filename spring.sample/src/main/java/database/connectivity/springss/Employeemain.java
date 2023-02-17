package database.connectivity.springss;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employeemain {
	public static void main(String[] args) {
			@SuppressWarnings("resource")
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");//must and should give  xml file name inside string
			Employeedao emp = (Employeedao) context.getBean("edao");
			int status = emp.saveEmployee(new Employee(103,"Jagadeesh",65000));
			System.out.println("Record inserted :"+status);
			int status1 = emp.deleteEmployee(new Employee(121,"rahim",3425));
			System.out.println("deleteing status:::"+status1);
			int status2 = emp.updateEmployee(new Employee(103,"jayamma",3499));
			System.out.println("update status::"+status2);
	}

}
