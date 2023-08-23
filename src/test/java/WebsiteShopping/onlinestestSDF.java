package WebsiteShopping;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class onlinestestSDF extends onlinetestAction{
	

	

@Given("open browser URL")
public void open_browser_URL() {
	Openbrowser();
	//closepopup();
}
	
	@When("user search for {string}")
	public void user_search_for(String a) throws InterruptedException {
		geturl(a);
		//closepopup();
	}


	@When("user search for mobile")
	public void user_search_for_mobile() {
		//mobilesearch();
		iphonemobilesearch();
	}

	@When("verify the price of the mobile")
	public void verify_the_price_of_the_mobile() {
		//Verifymobileprice();
	}
	
	@When("user search for mobile {string}")
	public void user_search_for_mobile(String string) {
		iphonemobilesearch();
		Verifymobileprice(string);
	}

	@Then("compared the price of both websites")
	public void compared_the_flipkartprice_of_both_websites() {
		compareprice();
	    
	}
	
	
	@Then("compared the {string} of both websites")
	public void compared_the_of_both_websites(String string) {
		compareprice();
	}



	@Then("compared the amazonproce of both websites")
	public void compared_the_amazonproce_of_both_websites() {
		compareprice();
	}

}
