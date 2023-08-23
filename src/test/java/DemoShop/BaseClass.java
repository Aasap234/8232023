package DemoShop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeTest
	@Parameters({"browser"})
	public void startup() {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();	
		}
	
	
	public void login() {
		
		driver.findElement(By.id("Email")).sendKeys("aasa@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();		
		System.out.println(driver.getTitle());
		
	}
	
	public void shoppingcart() {
		driver.findElement(By.xpath("//span[text()=\"Shopping cart\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"termsofservice\"]")).click();
		boolean Expected=true;
		boolean Actual= driver.findElement(By.xpath("//button[@class=\"button-1 checkout-button\"]")).isDisplayed();
		Assert.assertEquals(Actual, Expected);
		driver.findElement(By.xpath("//button[@class=\"button-1 checkout-button\"]")).click();
		
	    
		
	}
	
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
		System.out.println("Browser Closed ");
	}

}
