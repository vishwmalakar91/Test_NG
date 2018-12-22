package MS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("in function");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("in Before test");
  }
  

}
