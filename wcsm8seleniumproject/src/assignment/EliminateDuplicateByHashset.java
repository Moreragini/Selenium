package assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicateByHashset {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-orins=*");
	   WebDriver driver=new ChromeDriver(co);

	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("file:///C:/Users/Ragini%20Korade/OneDrive/Desktop/wcsm8webelementhtml/SingleSelectDropdown.html");
	   WebElement dropDown = driver.findElement(By.name("menu"));
	   // to handle dropdown create obj of select class
	  Select sel = new Select(dropDown);
	  // to get all the options from dropdown
	 List<WebElement> alloptions = sel.getOptions();
	 // to eliminate the duplicate & maintain the order of insertion we use
	 HashSet<String> hs = new HashSet<String>();
	 //to read the list by eliminating duplicates...
	 for(int i=0;i<alloptions.size();i++)
	 {
		 //get the options & text of options
		String op = alloptions.get(i).getText();
		
		//add the text of options to hashset
		hs.add(op);
	 }
	 
	 //to read the option from set
	 for(String options:hs)
	 {
		 Thread.sleep(2000);
		 System.out.println(options);
	 }

	}

}
