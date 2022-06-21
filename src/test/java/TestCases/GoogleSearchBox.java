package TestCases;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchBox {
	static WebDriver driver;
	WebElement alertpopup; 
@BeforeMethod
public void setup() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
//	driver.get("https://www.google.co.in/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
}
//@Test
//public static void googlePageTest() {
//	driver.get("https://www.google.co.in/");
//	WebElement searchbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
//	searchbox.click();
//	List<WebElement> list = driver.findElements(By.xpath("//li[@role='presentation']"));
//	for(WebElement a:list) {
//		System.out.println(a.getText());
//	}
//	searchbox.sendKeys(list.get(2).getText(), Keys.ENTER);
//}

//@Test
//public static void makeMyTrip() {
//	driver.get("https://www.google.co.in/");
//	WebElement searchbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
//	searchbox.sendKeys("Photo");
//}
@Test
public void railEurope() throws InterruptedException {
//	driver.get("https://int-13167.era-dev.raileurope.com/home");
	driver.get("https://sandbox.era.raileurope.com/sign-in");
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(200));
	System.out.println(driver.getTitle());
	alertpopup = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"))));
	alertpopup.click();
	
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("etroadec");
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("P@ssword01");
	WebElement loginbutton = driver.findElement(By.xpath("//button[@class='signIn-button']"));
	loginbutton.click();
	WebElement okaygotit = driver.findElement(By.xpath("//footer[@class='footer']"));
	okaygotit.click();
	WebElement nokaygotit = driver.findElement(By.xpath("//button[@Class='era-cta--tertiary era-cta--small ok']"));
	nokaygotit.click();
	System.out.println(driver.getTitle());
	
}
	

@AfterMethod
public void tearDown() {
//	driver.close();
}


}
