package deselectionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-orins=*");
	   WebDriver driver=new ChromeDriver(co);

	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("file:///C:/Users/Ragini%20Korade/OneDrive/Desktop/wcsm8webelementhtml/SingleSelectDropdown.html");
	   WebElement dropDown = driver.findElement(By.name("menu"));
	   
	  Select sel = new Select(dropDown);
	  for(int i=0;i<8;i++)
	  {
		  if(i%2==0)
		  {
			  Thread.sleep(2000);
			  sel.selectByIndex(i);
		  }
		  else {
			  System.out.println("it's odd place");
		  }
		  Thread.sleep(2000);
		 
		  // deselect the option
		  for(int i1=0;i1<8;i1++)
		  {
			  if(i1%2==0)
			  {
				  Thread.sleep(2000);
				  sel.deselectByIndex(i1);
			  }
			  else {
				  System.out.println("It's odd place");
			  }
			  
			  
		  }
	  }
	  
	 

	}

}
