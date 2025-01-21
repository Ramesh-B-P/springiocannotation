package springiocannotation.a2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Baby1 {

	 private IceCream1 i; 

	public void setI(IceCream1 i) {
		this.i = i;
	}

	void eat() {
		 i.open();						
	 }
}

