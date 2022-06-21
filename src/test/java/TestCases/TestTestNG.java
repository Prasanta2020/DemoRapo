package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTestNG {
	@BeforeSuite   //1
	public void setup() {
		System.out.println("Before Suite executed");
		}
	@AfterSuite //9
	public void generateReport() {
		System.out.println("After Suite executed");
	}
	@BeforeClass //3
	public void openBrowser() {
		System.out.println("Before Class executed");
	}
	
	@AfterClass  //6
	public void deleteCookies() {
		System.out.println("After Class execute");
	}
	@BeforeMethod  //4
	public void beforeMethod() {
		System.out.println("Before method execute");
	}
	@AfterMethod  //5
	public void afterMethod() {
		System.out.println("After method execute");
	}
	
	@BeforeTest  //2
	public void openLogin() {
		System.out.println("Before Test executed");
	}
	@AfterTest  //7
	public void logout() {
		System.out.println("After Test executed");
	}
	
	@Test //8
	public void show() {
		System.out.println("This is 1st Test Cases in TestNG");
	}

//	@Test
//	public void display() {
//		
//		System.out.println("This is 2nd Test Cases in TestNG");
//	}
//	
//	@Test
//	public void run() {
//		System.out.println("This is 3rd Test Cases in TestNG");
//	}
}
