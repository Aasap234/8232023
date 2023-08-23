package WebsiteShopping;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class onlinetestAction {
	
	public static   WebDriver driver;
	
	public static  Double fp;
	
	public static Double ap;
	
	By searchtxt = By.xpath("//textarea[@type=\"search\"]");
	String flipkarttext="flipkart";
	By flipkartlink= By.xpath("//a[@href='https://www.flipkart.com/']//h3[@class='LC20lb MBeuO DKV0Md'][normalize-space()='Flipkart']");
	By flipkartsearchtext= By.xpath("//input[@placeholder='Search for Products, Brands and More']");
	
	By suggestivelinksAmazon = By.xpath("//div[@class=\"s-suggestion-container\"]");
	
	By flipkartprice=By.xpath("//div[contains(text(),'₹53,999')]");
	
	By amazonprice= By.xpath("//span[normalize-space()='53,999']");
	
	
	
	public void Openbrowser() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	
		driver.get("https://www.google.com/search?");
		
	}
	
	
	
	public void geturl(String string) throws InterruptedException {
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(string);
		//driver.findElement(By.xpath("//textarea[@id='APjFqb']")).click();
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//*[@jsname=\"qOiK6e\"])[1]")).click();
		//Thread.sleep(2000);
		
		
	}
	
	

	public void closepopup() throws InterruptedException {
		if(driver.getCurrentUrl().contains("flipkart")) {
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).isDisplayed()) {
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		}
		else {
			System.out.println("no popup displayed");
		}
		}
		
	}
	
	public void mobilesearch() {
		
		String title= driver.getTitle();
		if (title=="Amazon")
		{
		driver.findElement(By.xpath("//form[@id=\"nav-search-bar-form\"]")).sendKeys("APPLE iPhone 12 (White, 64 GB)");
		List<WebElement> options= driver.findElements(By.xpath("//div[@class=\"two-pane-results-container\"]/div/div"));
		
		for (WebElement option: options) {
			
			if(option.getText().equalsIgnoreCase("apple iphone 12 white, 64 gb")) {
				option.click();
				break;
			}
		}
		}
		else if(title=="Flipkart"){
			driver.findElement(flipkartsearchtext).sendKeys("APPLE iPhone 12 (White, 64 GB)");
			driver.findElement(flipkartsearchtext).click();
			
		}
		
		
	}
	
	
	
	public void iphonemobilesearch() {
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iphone 12 64 gb white");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(Keys.ENTER);
		
		
	}
	public  void Verifymobileprice(String string) 
	{
		driver.findElement(By.xpath("//*[contains(text(),'"+ string+"')]")).click();
			
if(driver.getCurrentUrl().contains("flipkart")) {
	String flipkartprice=driver.findElement(By.xpath("//div[contains(text(),'₹53,999')]")).getText();
	System.out.println(flipkartprice);
	 fp= Double.parseDouble(flipkartprice.replace("₹", "").replace(",", ""));
	 System.out.println(fp);
}
else if(driver.getCurrentUrl().contains("amazon")) {
	String amazonprice=driver.findElement(By.xpath("//span[normalize-space()='53,999']")).getText();
	System.out.println(amazonprice);
	 ap= Double.parseDouble(amazonprice.replace("₹", "").replace(",", ""));
	 System.out.println(ap);
}	
			
		}
		
				
	
	
	public void compareprice() {
	if(ap!=0 && fp!=0)	{
		if(ap<fp) {
			
			System.out.println(" prices of flipkart is greater than amazon ");
}
		
		else if(ap>fp) {
			
			System.out.println(" prices of flipkart is lessthan amazon ");
		}
		else {

			System.out.println(" prices are  same flipkart and amazon ");
		}
		
	}
	
	driver.quit();
	}
		
	
	
	
	

}
