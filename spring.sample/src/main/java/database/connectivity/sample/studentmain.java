package database.connectivity.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class studentmain {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("studentweb.xml");
	studentdao std = (studentdao) context.getBean("sdao");
	int status = std.records(new student(1010,"sharada",987678987,"sarada@gmail.com"));
	System.out.println("insert records;;"+status);
//	int status1 = std.update(new student(1001,"prameela",234355,"prameela@gamil.conm"));
//	System.out.println("update"+status1);
	int status2=std.delete(new student(1009,"prameela",234355,"prameela@gamil.conm"));
	System.out.println("delete"+status2);
	}
}
