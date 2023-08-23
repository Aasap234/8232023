package LoginDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginSDF  extends ActionLogin{
	
	
	
	@Given("open the browser")
	public void open_the_browser() {
		openbrowser();
		
	}

	@When("click on practice link")
	public void click_on_practice_link() throws InterruptedException {
		practicelink();
		Thread.sleep(3000);
	}

	@When("click on login page link")
	public void click_on_login_page_link() {
		loginpagelink();
	}

	@When("enter student and Password123")
	public void enter_student_and_password123() {
		logindetails();
	}

	@When("click on submit button")
	public void click_on_submit_button() {
		submitbtn();
	}

	@Then("Validate by Capturing the text for login successfully")
	public void validate_by_capturing_the_text_for_login_successfully() {
		validatemessage();
	}


}
