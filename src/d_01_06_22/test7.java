package d_01_06_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test7 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubham\\eclipse-workspace\\selenium\\chromedrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		
		if(txt_email.isEnabled()==true && txt_email.isDisplayed()==true)
		{
			txt_email.sendKeys("shubham");
			System.out.println("email is enter");
			
		}
		
		WebElement btn_login=driver.findElement(By.xpath("//button[text()='Log In']"));
		if(btn_login.isDisplayed()==true) {
			btn_login.click();
			System.out.println("button is enter");
		}
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
