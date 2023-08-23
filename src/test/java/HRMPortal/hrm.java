package HRMPortal;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hrm extends hrmaction{
	

@Given("open the browser {string}")
public void open_the_browser(String string) {
	openbrowserhrm(string);
   
}

@When("user provides username and password")
public void user_provides_username_and_password(DataTable credentials ) {
	updatecredentials(credentials);
   
}

@When("user click on PIM tab")
public void user_click_on_pim_tab() {
	clickonPIN();
}

@When("user click on ADD Employee button")
public void user_click_on_add_employee_button() {
	addemployeebutton();
}

@When("user enter {string}, {string} and {string}")
public void user_enter_and(String string, String string2, String string3) {
	updatedetails(string,string2,string3);
   
}

@When("user click on SAVE button")
public void user_click_on_save_button() {
	savebutton();
}

@When("user move to Employeelist tab")
public void user_move_to_employeelist_tab() {
	employeelisttab();
    
}

@When("user search using {string}")
public void user_search_using(String string) {
	searchname(string);
   
}



@Then("user validates th record found")
public void user_validates_th_record_found() {
	validatedata();
    
}


}
