package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
	 // To avoid illegalstateexception
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		// to launch firefox browser
		FirefoxDriver driver = new FirefoxDriver();
		// to maximize browser
		driver.manage().window().maximize();		
		Thread.sleep(2000);
		//to close firefox browser
		driver.close();

	}

}
