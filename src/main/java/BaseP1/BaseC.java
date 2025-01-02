package BaseP1;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
public class BaseC {
		public static WebDriver driver;
		public static void browser_Select(String browser)
		{
			
			switch(browser.toLowerCase())
			{
			case "chrome" : WebDriverManager.chromedriver().setup();  
				            driver= new ChromeDriver();
		    break;                    
          	case "firefox" :  WebDriverManager.firefoxdriver().setup();   
          		              driver=new FirefoxDriver();   //rivers not work	
			break;
			case "edge" : WebDriverManager.edgedriver().setup();
				            driver = new EdgeDriver();           
			 break;
			case "safari" :  WebDriverManager.safaridriver().setup();
				             driver = new SafariDriver();//safari didnot take          
			 break;
			case "ie" :   WebDriverManager.iedriver().setup();
				          driver = new InternetExplorerDriver();//geting issue              
		     break;
			
			default:  System.out.println("Not in the browser");
			 break;
		     	
		}
		}
			public static void environment_Select(String env)
			{
				switch(env.toUpperCase() )
{
				case "QA" : driver.get("https:/www.facebook.com");
				break;
				case "DEV" :  driver.get("https:/DEV/www.fb.com");
				break;
				case "UAT" : driver.get("https:/www.fb.com");
				break;
				default: System.out.println("Env is not available");
				break;
				     
				}
				
			}
				
		public static void application_launch()
		{
			browser_Select("chrome");
			environment_Select("QA");	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		public static void application_close()
		{
			driver.close();
		}

		
	

}
