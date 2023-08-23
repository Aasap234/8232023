package suggestioncount;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import WebsiteShopping.onlinetestAction;

public class suggestioncountAction extends onlinetestAction {
	
	public static List<WebElement> flpcount;
	
	public static List<WebElement> amcount;
	
	public void iphonesearch(String string) {
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(string);
		
	}
	
    public void autosuggestioncount() {
	
	if(driver.getCurrentUrl().contains("flipkart")) {
	
	//flpcount=driver.findElements(By.xpath("//*[@class='col-12-12 _2oO9oE']/following-sibling::ul/li"));
	
	flpcount=driver.findElements(By.xpath("//li[@class='Y5N33s']"));
	System.out.println(flpcount.size());
	}
	else if (driver.getCurrentUrl().contains("amazon")) {
	amcount=driver.findElements(By.xpath("//*[@class='left-pane-results-container']/div"));
	System.out.println(amcount.size());
	}
	
}
	public void quit() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	public void compareprice() {
		if(flpcount.size() > amcount.size()) {
			System.out.println("flipkart count is more");
		}
		else if(flpcount.size() < amcount.size()) {
			System.out.println("amazon count is more");
		}
		else {
			System.out.println("amazon count and flipkart count are equal");
		}
	}
}
