package d_01_06_22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubham\\eclipse-workspace\\selenium\\chromedrivers\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://support.google.com/chrome/?p=help&ctx=keyboard");
	
	driver.manage().window().maximize();
	driver.getCurrentUrl();
	driver.getTitle();
	
	
	Thread.sleep(2000);
	driver.close();
	
	}

}
