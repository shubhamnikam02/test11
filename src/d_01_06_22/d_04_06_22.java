package d_01_06_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d_04_06_22 {

	public static void main(String[] args) throws InterruptedException {

		
		
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubham\\eclipse-workspace\\selenium\\chromedrivers\\chromedriver_win32\\chromedriver.exe");
	     
		
      	WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/login.php");
		driver.manage().window().maximize();
		
         System.out.println(driver.getCurrentUrl());		
		WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement txt_pass=driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
		
		txt_email.sendKeys("nikam.shubham4@gmail.com");
		txt_pass.sendKeys("123456");
		Thread.sleep(3000); 
		btn_login.click();
		 
		Thread.sleep(3000);
		
		driver.navigate().to("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
		
		Thread.sleep(3000);
		
		WebElement txt_firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement txt_lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		
		
		WebElement btn_value= driver.findElement(By.xpath("//input[@value='2']"));
		System.out.println(driver.getCurrentUrl());
		txt_firstname.sendKeys("shubham");
		txt_lastname.sendKeys("more");
		Thread.sleep(3000);
		
		btn_value.click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
