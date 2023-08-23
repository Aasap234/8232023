package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertspage  {
	
	 WebDriver driver;
	
	public Alertspage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	By JSAlert=  By.xpath("//button[text()='Click for JS Alert']");
	By JSConfirm = By.xpath("//button[text()='Click for JS Confirm']");
	By JSPrompt =By.xpath("//button[text()='Click for JS Prompt']");
	By result =By.xpath("//p[@id='result']");
	
	
	public void JSconfirmlink() {
		driver.findElement(JSConfirm).click();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
		try {
			
			Alert a=driver.switchTo().alert();
			a.accept();
			Thread.sleep(4000);
			
			
		} catch (Exception e) {
			
			System.out.println("link not found");	
		}
		System.out.println(driver.findElement(result).getText());
}

	public void JSAlertlink() {
		driver.findElement(JSAlert).click();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
		try {
			
			Alert a=driver.switchTo().alert();
			a.dismiss();
			Thread.sleep(4000);
			
		} catch (Exception e) {
			
			System.out.println("link not found");	
		}
		System.out.println(driver.findElement(result).getText());

	}
	public void JSPromptlink() {
		driver.findElement(JSPrompt).click();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
		try {
			
			Alert a=driver.switchTo().alert();
			a.sendKeys("Done with alerts");
			a.accept();
			Thread.sleep(4000);
			
		} catch (Exception e) {
			
			System.out.println("link not found");	
		}
		System.out.println(driver.findElement(result).getText());
			

	}

	
	
	
}
