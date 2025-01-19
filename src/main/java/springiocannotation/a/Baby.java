package springiocannotation.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Baby {
	
	@Autowired
	IceCream i;
	
	 void eat() {
		 i.open();
	 }
}
