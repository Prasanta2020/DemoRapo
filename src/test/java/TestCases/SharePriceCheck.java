package TestCases;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Util.UtilClass;

public class SharePriceCheck {
	WebDriver driver;
	UtilClass obj = new UtilClass();
@BeforeMethod
public void setup() {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://money.rediff.com/index.html");
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
}
	
//@Test
//public void search() throws InterruptedException {
//	WebElement searchbox = driver.findElement(By.xpath("//input[@class='txt_srch']"));
//	searchbox.sendKeys("tata Steel ltd.", Keys.ENTER);
//	Thread.sleep(50);
//	 
//	}
//@Test
//public void searcha() throws InterruptedException {
//	WebElement searchbox = driver.findElement(By.xpath("//input[@class='txt_srch']"));
//	searchbox.sendKeys("Life Insurance Corporation of India", Keys.ENTER);
//	Thread.sleep(50);
//	 
//	}
//@Test
//public void searchb() throws InterruptedException {
//	WebElement searchbox = driver.findElement(By.xpath("//input[@class='txt_srch']"));
//	searchbox.sendKeys("Shree Renuka Sugars Ltd.", Keys.ENTER);
//	Thread.sleep(50);
//	 
//	}
//@Test
//public void searchc() throws InterruptedException {
//	WebElement searchbox = driver.findElement(By.xpath("//input[@class='txt_srch']"));
//	searchbox.sendKeys("One97 Communications Ltd.", Keys.ENTER);
//	Thread.sleep(50);
//	 
//	}

@Test(invocationCount=0)
public void search() throws InterruptedException {
	List<String> sharelists = obj.sharelist();
	System.out.println("Current Share Price::"+obj.dateShow());
	System.out.println("*************************************************");
	for(String a:sharelists) {
	WebElement searchbox = driver.findElement(By.xpath("//input[@class='txt_srch']"));
	searchbox.clear();
	searchbox.sendKeys(a,Keys.ENTER);
	WebElement price = driver.findElement(By.xpath("//span[@id='ltpid']"));
	System.out.println(a+"	"+price.getText());
	Thread.sleep(70);}	
	 
	}
@Test
public void checkmike() {
	WebElement gmike = driver.findElement(By.xpath("\\button[@id='voiceSearchButton']"));
	System.out.println(gmike.getText());
}
 
@AfterMethod
public void tearDown(){
	driver.close();
}
	

}
