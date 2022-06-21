package selenium_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class d_1_06_22 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubham\\eclipse-workspace\\selenium\\chromedrivers\\chromedriver_win32\\chromedriver.exe");
	
	
		WebDriver driver=new ChromeDriver();
	
		
		driver.get("https://support.google.com/chrome/?p=help&ctx=keyboard#topic=9796470");
		
		driver.manage().window().maximize();
		
		driver.getCurrentUrl();
		
	driver.getTitle();
	driver.close();
	}

}
