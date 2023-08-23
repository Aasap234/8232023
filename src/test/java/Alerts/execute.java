package Alerts;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class execute extends AlertsStartuppage {

	
@Test

	public void check() {
		
		startuppage Startuppage = new startuppage(driver);
		Startuppage.JavascriptAlertslink();
		
		Alertspage alertspage = new Alertspage(driver);
		alertspage.JSAlertlink();
		alertspage.JSconfirmlink();
		alertspage.JSPromptlink();
		
		
	}
	
}
