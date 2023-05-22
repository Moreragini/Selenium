package methodsofwebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		// to maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//to set size of browser
		Dimension targetsize = new Dimension(450, 350);
		Thread.sleep(2000);
		driver.manage().window().setSize(targetsize);
		// to set position of browser
		Point targetposition = new Point(450, 350);
		Thread.sleep(2000);
		driver.manage().window().setPosition(targetposition);
		
		

	}

}
