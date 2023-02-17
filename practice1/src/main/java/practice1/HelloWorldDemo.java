package practice1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldDemo {
    public static void main(String[] args) {
        String config = "spring.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);

        HelloImpl hello = (HelloImpl) context.getBean("hello");
        hello.sayHello();
        context.close();
    }
}
