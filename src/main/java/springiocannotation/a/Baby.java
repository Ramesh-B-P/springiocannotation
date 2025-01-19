package springiocannotation.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Baby {
//	 public static void main(String[] args) {
//		IceCream iceCream=new Strawberry();
//		iceCream.open();
		
//		 Venilla venilla=new Venilla();
//	}
	@Autowired
	IceCream i;                         //venilla v;
										//Strawberry s;
	
	 void eat() {
		 i.open();						//v.open();
		 								//s.open();
	 }
}



//field injection