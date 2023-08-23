package HRMPortal;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hrmaction {
	public WebDriver driver;
	
	public void openbrowserhrm(String string) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	
		driver.get(string);	
	}
	
	public void updatecredentials(DataTable credentials) {
		
		List<Map<String, String>> Data=credentials.asMaps(String.class, String.class);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(Data.get(0).get("username"));
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(Data.get(0).get("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public void clickonPIN() {
		driver.findElement(By.xpath("//*[@href='/web/index.php/pim/viewPimModule']")).click();
	}
	
	public void addemployeebutton() {
		driver.findElement(By.xpath("//*[text()='Add Employee']")).click();
		}
	
	public void updatedetails(String string, String string2, String string3) {
		
		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys(string);
		driver.findElement(By.xpath("//*[@name='middleName']")).sendKeys(string2);
		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys(string3);
		
	}
	
	public void savebutton() {
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	
	public void employeelisttab() {
		
		driver.findElement(By.xpath("//*[text()='Employee List']")).click();
		
	}
	
	public void searchname(String string) {
		
		driver.findElement(By.xpath("(//*[@placeholder='Type for hints...'])[1]")).sendKeys(string);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
			
	}
	
	public void validatedata() {
		String data=driver.findElement(By.xpath("//*[text()='(1) Record Found']")).getText();
		System.out.println(data);
	}

}
