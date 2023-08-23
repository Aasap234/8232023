package suggestioncount;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class suggestioncountSDF extends suggestioncountAction {
	
	
	
	@When("user search for mobile iphone {string}")
	public void user_search_for_mobile_iphone(String string) throws InterruptedException {
		closepopup();
		iphonesearch(string);
	}

	@When("verify the autosuggestioncount")
	public void verify_the_autosuggestioncount() throws InterruptedException {
		autosuggestioncount();
		quit(); 
	}

	@Then("compare the count of both websites")
	public void compare_the_count_of_both_websites()  {
		compareprice();
		
	}

}
