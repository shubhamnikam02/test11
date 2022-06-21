package d_01_06_22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubham\\eclipse-workspace\\selenium\\chromedrivers\\chromedriver_win32\\chromedriver.exe");
	
	
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://g.co/kgs/PCe98a");
		driver.manage().window().maximize();
		
		driver.getTitle();
		driver.getCurrentUrl();
        Thread.sleep(3000);
	driver.close();
	}

}
