package TestCases;

import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DataCoreTimeSheet{
	 Properties pros;
//for testing the DC time sheet	
	static WebDriver driver;
	@BeforeMethod
	public static void setUp() {
//		if(pros=="Chrome")
		
//		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://eip.datacoresystems.com/Login.aspx");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().getImplicitWaitTimeout();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
@Test
public void pageTitleTest() {
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Data-Core Connect");
	
}

@Test
public void validateLogo() {
	boolean b = driver.findElement(By.xpath("//*[@id=\"divcontent\"]/table/tbody/tr/td[1]/img")).isDisplayed();
		Assert.assertTrue(b);
}

@Test
public void loginPageTest() {
	driver.findElement(By.xpath("//input[@id='LoginControl_UserName']")).sendKeys("ppanda");
	driver.findElement(By.xpath("//input[@id='LoginControl_Password']")).sendKeys("DCIpkp791");
	driver.findElement(By.xpath("//input[@name='LoginControl$LoginButton']")).click();
	String text = driver.findElement(By.xpath("//span[@class='UserNameDisplay']")).getText();
	System.out.println(text);
	Assert.assertEquals(text, "Welcome Prasanta Panda");
			
	
}

	
@AfterMethod
public void tearDown() {
	driver.close();
	
}

}
