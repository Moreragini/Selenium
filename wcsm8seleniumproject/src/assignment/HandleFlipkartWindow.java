package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFlipkartWindow {

	public static void main(String[] args) throws InterruptedException {
           System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.flipkart.com/");
        
        driver.findElement(By.xpath("//button[.='✕']")).click();
        driver.findElement(By.name("q")).sendKeys("samsung s23 ultra");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        
        //handle of parent window
      String parentHandle = driver.getWindowHandle();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)']")).click();

	}

}
