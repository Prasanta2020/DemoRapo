package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	static WebDriver driver;
	public void datacoreTimesheetLoginTest(String browser, String url, String username, String password) {
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		System.out.println(url);
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='LoginControl_UserName']")).clear();
		driver.findElement(By.xpath("//input[@id='LoginControl_UserName']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='LoginControl_Password']")).clear();
		driver.findElement(By.xpath("//input[@id='LoginControl_Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='LoginControl$LoginButton']")).click();
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	}

