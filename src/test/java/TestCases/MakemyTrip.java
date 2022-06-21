package TestCases;

import java.util.List;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakemyTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(300);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.manage().deleteAllCookies();
//		driver.switchTo().alert().getText();
//		driver.switchTo().alert().dismiss();
//		WebElement fromCity = driver.findElement(By.id("fromCity"));
//		Select fromCityDrp = new Select (fromCity);
//		List <WebElement> allOptions = fromCityDrp.getOptions();
//		for(WebElement a: allOptions) {
//			System.out.println(a.getText());
//		}
		
		driver.findElement(By.xpath("//p[@class='blackText font20 code']")).click();
		new WebDriverWait (driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']")));
		String monthYearVal = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
		System.out.println(monthYearVal);
		String month = monthYearVal.split(" ")[0].trim();
		String year = monthYearVal.split(" ")[1].trim();
		while(!(month.equals("February") && year.equals("2023"))) {
			Thread.sleep(30);
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		
			monthYearVal = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
			System.out.println(monthYearVal);
			month = monthYearVal.split(" ")[0].trim();
			year = monthYearVal.split(" ")[1].trim();
		}
		
		
		
		driver.close();
		
		
		
		
		

	}

}
