package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EipDataCore {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://eip.datacoresystems.com/Login.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='LoginControl$UserName']")).sendKeys("ppanda");
		driver.findElement(By.xpath("//input[@name='LoginControl$Password']")).sendKeys("DCIpkp791");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		@FindBy(xpath="//input[@name='LoginControl$UserName']")
//				WebElement username;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('Welcome Karabi DIDI')");
		Thread.sleep(3000);
//		String title = driver.getTitle();
//		System.out.println(title);
		driver.switchTo().alert().accept();
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[@href=\"LoggedOut.aspx\"]")).click();
		String s = driver.getTitle();
		System.out.println(s);
		Thread.sleep(300);
		driver.close();
		
				
		

	}

}
