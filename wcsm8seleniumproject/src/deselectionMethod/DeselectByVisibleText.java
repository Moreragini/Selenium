package deselectionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DeselectByVisibleText {

	public static void main(String[] args) throws InterruptedException {
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
	  Thread.sleep(4000);
	  sel.selectByVisibleText("shankarpalya");
	  Thread.sleep(2000);
	  sel.selectByVisibleText("poha");
	  
	  //deselect the option
	  Thread.sleep(2000);
	  sel.deselectByVisibleText("shankarpalya");
	  Thread.sleep(2000);
	  sel.deselectByVisibleText("poha");

	}

}
