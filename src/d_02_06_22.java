import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class d_02_06_22 {

	public static void main(String[] args) throws InterruptedException {
		
		
		String a="C:\\Users\\shubham\\eclipse-workspace\\selenium\\chromedrivers\\chromedriver_win32\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", a);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().back();
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
