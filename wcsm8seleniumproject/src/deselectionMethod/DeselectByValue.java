package deselectionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-orins=*");
	   WebDriver driver=new ChromeDriver(co);

	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("file:///C:/Users/Ragini%20Korade/OneDrive/Desktop/wcsm8webelementhtml/MultiselectDropDown.html");
	   WebElement dropDown = driver.findElement(By.name("menu"));
	   
	  Select sel = new Select(dropDown);
	  Thread.sleep(3000);
	  sel.selectByValue("v6");
	  Thread.sleep(2000);
	  sel.selectByValue("v3");
	  
	  // deselect the option
	  Thread.sleep(2000);
	  sel.deselectByValue("v6");
	  Thread.sleep(2000);
	  sel.deselectByValue("v3");

	}

}
