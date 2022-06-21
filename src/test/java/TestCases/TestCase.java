package TestCases;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase {
public static void main (String [] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://loco2:sidings@staging.raileurope.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[@Class='recaptcha-checkbox-border']")).click();
//	driver.manage().deleteAllCookies();
//	driver.switchTo().newWindow(null);
//	WebElement acceptAllCookies = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
//	acceptAllCookies.clear();
}
	
}
