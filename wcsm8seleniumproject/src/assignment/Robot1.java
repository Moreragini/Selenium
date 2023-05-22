package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Robot1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	        WebDriver driver=new ChromeDriver(co);
	        
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.get("https://www.selenium.dev/");
	       
	       
	      WebElement target = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
	      
	      // to perform right click on getting started
	      
	    Actions act = new Actions(driver);
	    act.contextClick(target).perform();
	    
	    // To click on inspect by using for loop....
	  
	    Robot robot = new Robot();
	    for(int i=0;i<=9;i++)
	    {
	    	Thread.sleep(2000);
	    	robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	    	robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    	
	    }
	    
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	       


	}

}
