package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class startuppage {
	
	
	 WebDriver driver;
	
	public startuppage(WebDriver driver) {
		this.driver=driver;
		
		
	}
	
	By javascript = By.linkText("JavaScript Alerts");
	
	public void JavascriptAlertslink() {
				try {
					
					driver.findElement(javascript).click();
					Thread.sleep(5000);
			
		} catch (Exception e) {
			System.out.println("link not found");
	}
	
	}

}
