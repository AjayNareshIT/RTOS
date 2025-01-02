package steps_proceedings;

import AllPages.Login_Page;
import BaseP1.BaseC;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login_Definations extends Login_Page {
	@Given("User should be on login page")
	public void user_should_be_on_login_page() {
		application_launch();
	}
	@When("enters valid username {string}")
	public void enters_valid_username(String mail) {
		EnterEmailID(mail);
	}
	@When("enters valid password {string}")
	public void enters_valid_password(String pass) {
		EnterPassword(pass);
	}
	@When("clicks on submit")
	public void clicks_on_submit() {
		Sigin_login();
	}	
}
