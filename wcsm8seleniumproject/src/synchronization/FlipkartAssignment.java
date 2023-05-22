package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartAssignment {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
    WebDriver driver=new ChromeDriver(co);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://www.flipkart.com/");
    

	}

}
