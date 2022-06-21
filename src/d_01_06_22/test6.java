package d_01_06_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test6 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubham\\eclipse-workspace\\selenium\\chromedrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/login.php");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		
		
		WebElement txt_name=driver.findElement(By.xpath("//input[@id='name']"));
		
		txt_name.sendKeys("nikam");
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
