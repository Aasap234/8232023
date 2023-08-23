package LoginDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionLogin {
	
public WebDriver driver;

By prcaticelink = By.xpath("//a[text()='Practice']");
By loginpagelink= By.xpath("//a[text()='Test Login Page']");
By username= By.xpath("//input[@type='text']");
By password= By.xpath("//input[@type='password']");
By submitbtn = By.xpath("//button[text()='Submit']");
By validatemsg=By.xpath("//h1[@class=\"post-title\"]");

public void openbrowser() {
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	
	driver.get("https://practicetestautomation.com");
}

public void practicelink() {
	driver.findElement(prcaticelink).click();
}

public void loginpagelink() {
	driver.findElement(loginpagelink).click();
}

public void logindetails() {
	driver.findElement(username).sendKeys("student");
	driver.findElement(password).sendKeys("Password123");
}

public void submitbtn() {
	driver.findElement(submitbtn).click();
}

public void validatemessage() {
	//driver.findElement(validatemsg).getText();
	System.out.println(driver.findElement(validatemsg).getText());
	driver.quit();
	
}


}
