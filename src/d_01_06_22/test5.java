package d_01_06_22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 {

	public static void main(String[] args) throws InterruptedException {

		String url="C:\\Users\\shubham\\eclipse-workspace\\selenium\\chromedrivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", "url");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://support.google.com/chrome/?p=help&ctx=keyboard#topic=9796470");
		driver.manage().window().maximize();
		driver.getCurrentUrl();
		driver.getTitle();
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.getTitle();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.close();
		
	}

}
