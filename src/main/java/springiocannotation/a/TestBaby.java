package springiocannotation.a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBaby {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		 Baby baby=applicationContext.getBean(Baby.class);
		 baby.eat();
	}
}
