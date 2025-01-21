package springiocannotation.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Baby {

	 private IceCream i;                         
	
	 void eat() {
		 i.open();						
		 								
	 }
}



//field injection