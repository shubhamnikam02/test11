package d_01_06_22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) throws InterruptedException {
 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubham\\eclipse-workspace\\selenium\\chromedrivers\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	System.out.println(driver.getCurrentUrl());
	
	System.out.println(driver.getTitle());
	Thread.sleep(4200);
	driver.close();
	
	
	}

}
