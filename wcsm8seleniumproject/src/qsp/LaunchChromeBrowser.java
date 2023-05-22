package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// to avoid illegal state exception
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// to avoid connection failed exception
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		// to launch chrome browser

		ChromeDriver driver = new ChromeDriver(co);
		// to maximize browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// to close the chrome browser
		driver.close();

	}

}
