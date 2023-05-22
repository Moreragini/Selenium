package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollRight {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	        WebDriver driver=new ChromeDriver(co);
	        
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
	       
	       //To perform Scrolling Operation
	       JavascriptExecutor jse = (JavascriptExecutor)driver;
		     Thread.sleep(2000);
		     jse.executeScript("window.scrollBy(5000,0)");

	}

}
