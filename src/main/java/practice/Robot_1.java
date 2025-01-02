package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robot_1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	    driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		 Thread.sleep(3000);
		 // Specify the file location with extension
		 StringSelection sel = new StringSelection("D:\\New folder\\AjayKandapu.docx");

		   // Copy to clipboard
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		 
		Robot robot= new Robot();
		
		 // Press CTRL+V
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);

		// Release CTRL+V
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 
		  //  Press Enter 
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
		    
		    Thread.sleep(3000);
		    
			driver.quit();

	}

}
