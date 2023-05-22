package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.airindia.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='from']")).sendKeys("Pune, Lohegaon Airport, PNQ, India, IN");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='to']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='to']")).sendKeys("Kochi, Cochin International Airport, COK, India, IN");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='_depdateeu1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='_depdateeu1']")).sendKeys("08/04/2023");
		driver.findElement(By.xpath("//input[@id='_retdateeu1']")).click();
		driver.findElement(By.xpath("//input[@id='_retdateeu1']")).sendKeys("14/04/2023");
		driver.findElement(By.xpath("//select[@id='ddladult1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='ddladult1']")).sendKeys("3");
		driver.findElement(By.xpath("//select[@id='ddlchildren1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='ddlchildren1']")).sendKeys("2");
		driver.findElement(By.xpath("//select[@id='concessionaryType1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='concessionaryType1']")).sendKeys("student");
		driver.findElement(By.xpath("//input[@id='btnbooking']")).click();
		

	}

}
