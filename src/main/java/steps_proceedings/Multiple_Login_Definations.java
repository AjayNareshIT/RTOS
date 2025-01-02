package steps_proceedings;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.awt.geom.GeneralPath;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import AllPages.Login_Page;
import All_Generic_Methods.*;
import java.io.IOException;

public class Multiple_Login_Definations extends Login_Page
{
	Generic_Methods gm = new Generic_Methods();
	
	@Given("User is Login page")
	public  void ABC()  throws IOException {
		application_launch();
		ExtentCucumberAdapter.addTestStepLog("Lanuched successfully");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(gm.TakeScreencapture());
	}

	@When("^User enters email id\"([^\"]*)\"$")
	public void user_enters_email_id_testing_gmail_com(String mail) throws IOException {
	    
		EnterEmailID(mail);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(gm.TakeScreencapture());
		ExtentCucumberAdapter.addTestStepLog("Entered username successfully "+mail);
	} 

	@When("^User enters password\"([^\"]*)\"$")
	public void user_enters_password_p23433(String pass) throws IOException {
		EnterPassword(pass);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(gm.TakeScreencapture());
		ExtentCucumberAdapter.addTestStepLog("Entered password successfully "+pass);
	}

	@When("User clicks on sign in")
	public void user_clicks_on_sign_in() throws IOException {
		Sigin_login() ;
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(gm.TakeScreencapture());
		ExtentCucumberAdapter.addTestStepLog("CLick is done successfully");
		//application_close();
	}
}
