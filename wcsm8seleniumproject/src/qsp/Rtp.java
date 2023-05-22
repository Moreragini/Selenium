package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//ask the input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("select the browser which u want to open!!");
		String browservalue=sc.next();
		
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
		else
		{
			System.out.println("select the valid browservalue!!!");
		}
	}
}
			
			
			
			
			
			
					
		
