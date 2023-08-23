package DemoShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

public class product2 extends BaseClass{
	

	
	By jewelrylink = By.xpath("//ul[@class='top-menu']//a[normalize-space()='Jewelry']");
	By pendedentlink=By.xpath("(//a[@title='Show details for Black & White Diamond Heart'])[2]");
	By AddToCartButton=By.xpath("//input[@id='add-to-cart-button-14']");
	By message=By.xpath("//p[@class=\"content\"]");
	
	@Parameters({"product2"})
	public void buyproduct2() throws InterruptedException {
		
		driver.findElement(jewelrylink).click();
		Thread.sleep(3000);
		driver.findElement(pendedentlink).click();
		Thread.sleep(3000);
		driver.findElement(AddToCartButton).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(message).getText());
		
		
		
	}
	
}
