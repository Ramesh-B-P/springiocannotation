package springiocannotation.a;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Venilla implements IceCream {
	public void open() {
		System.out.println("baby eating venilla icecream");
	}
}
