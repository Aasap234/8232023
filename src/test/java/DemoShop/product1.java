package DemoShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;

public class product1 extends BaseClass{
	

	
	By Electronicslink=By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/ul[1]/li[3]/a[1]");
	By mobileslink = By.xpath("//img[@title=\"Show products in category Cell phones\"]");
	By smartphonelink= By.xpath("(//a[text()= 'Smartphone'])[2]");
	By AddToCartButton=By.xpath("//input[@id='add-to-cart-button-43']");
	By message=By.xpath("//p[@class=\"content\"]");
	
	
	@Parameters({"product1"})
	public void buyproduct1() throws InterruptedException {
		
		driver.findElement(Electronicslink).click();
		driver.findElement(mobileslink).click();
		driver.findElement(smartphonelink).click();
		Thread.sleep(3000);
		driver.findElement(AddToCartButton).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(message).getText());
	}

}
