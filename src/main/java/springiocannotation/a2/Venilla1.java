package springiocannotation.a2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Venilla1 implements IceCream1 {
	public void open() {
		System.out.println("baby eating venilla icecream");
	}
}
