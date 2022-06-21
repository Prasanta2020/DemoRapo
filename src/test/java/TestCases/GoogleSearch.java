package TestCases;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleSearch {
	
	
public static void main(String[] args)throws InterruptedException {
	//webdriver initialization
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	WebElement searchbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	searchbox.click();
	List<WebElement> list = driver.findElements(By.xpath("//li[@role='presentation']"));
	for(WebElement a:list) {
		System.out.println(a.getText());
		}
	String searchText = list.get(2).getText();
	searchbox.sendKeys(searchText, Keys.ENTER);
	
}
	

}
