package operationalMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-orins=*");
	   WebDriver driver=new ChromeDriver(co);

	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("file:///C:/Users/Ragini%20Korade/OneDrive/Desktop/wcsm8webelementhtml/SingleSelectDropdown.html");
	   WebElement dropDown = driver.findElement(By.name("menu"));
	   // select the option
	  Select sel = new Select(dropDown);
	  List<WebElement> alloptions = sel.getOptions();
	  
	  //to read the list of webelement use looping statement
	  
	  // for loop
	  //for(int i=0;i<alloptions.size();i++)
	 // {
		//String option = alloptions.get(i).getText();
		//System.out.println(option);
		
		//advance for loop
		for(WebElement op:alloptions) {
			String options = op.getText();
			System.out.println(options);
		}
	  }

	}


