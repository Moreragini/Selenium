package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;


public class ScreenShotWay4 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
		
	        WebDriver driver=new ChromeDriver();
	        
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	     //consider we are taking ss of selenium.dev wp
	       driver.get("https://www.flipkart.com/");
	       
	     EventFiringWebDriver efw = new EventFiringWebDriver(driver);
	     
	     // Implementation of method
	          File src = efw.getScreenshotAs(OutputType.FILE);
	     
	          File dest = new File("./Screenshots/ss4.jpg");
	          
	          Files.copy(src, dest);
	       
	       
	      
		
	}

}
