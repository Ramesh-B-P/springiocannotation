package springiocannotation.a2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBaby1 {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ioc1.xml");
		 Baby1 baby=applicationContext.getBean(Baby1.class);
		 baby.eat();
	}
}
