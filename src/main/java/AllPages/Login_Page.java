package AllPages;

import org.openqa.selenium.By;

import BaseP1.BaseC;

public class Login_Page extends BaseC {
	

	public static By Emailid=By.id("email");
	public static By Passwordid=By.xpath("//input[@id='pass']");
	public static By Sigin=By.name("login");

	public static void EnterEmailID(String email)
	{
		driver.findElement(Emailid).sendKeys(email);
	}

	public static void EnterPassword(String password)
	{
		driver.findElement(Passwordid).sendKeys(password);
	}

	public static void Sigin_login() 
	{
		driver.findElement(Sigin).click();
	}
	

}
