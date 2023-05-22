package operationalMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-orins=*");
	   WebDriver driver=new ChromeDriver(co);

	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("file:///C:/Users/Ragini%20Korade/OneDrive/Desktop/wcsm8webelementhtml/MultiselectDropDown.html");
	   WebElement dropDown = driver.findElement(By.name("menu"));
	   // select the option
	  Select sel = new Select(dropDown);
	  
	  boolean option = sel.isMultiple();
	  System.out.println(option);
	  
	 
	  }
	  
       
      }


