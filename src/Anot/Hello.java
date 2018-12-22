package Anot;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Hello {
	
	@Test
	void Hi() {
		System.out.println("Hi");
		
	}
	@AfterMethod
	void Hello1() {
		System.out.println("Hello");
	}
	
	

}

