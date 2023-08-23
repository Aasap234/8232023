package DemoShop;

import org.testng.annotations.Test;

public class Execution extends BaseClass{
	
@Test	
	public void test() throws InterruptedException {
		
	
	
	product1 Product1 = new product1();
	product2 Product2 = new product2();
	login();
	Product1.buyproduct1();
	Product2.buyproduct2();
	shoppingcart();
	
	
	}

}
