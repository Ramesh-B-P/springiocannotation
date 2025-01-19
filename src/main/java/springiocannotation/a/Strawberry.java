package springiocannotation.a;

import org.springframework.stereotype.Component;

@Component
public class Strawberry implements IceCream {
	public void open() {
		System.out.println("baby eating strawberry icecream");
	}
}
