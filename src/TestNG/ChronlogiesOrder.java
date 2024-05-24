package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronlogiesOrder {
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("BeforeSuite is getting Launched",true);
	}
	@AfterSuite
	public void Aftersuite() {
		Reporter.log("AfterSuite is getting Launched",true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("Beforeclass is getting Launched",true);
	}
	@AfterClass
	public void Afterclass() {
		Reporter.log("AfterClass is getting Launched",true);
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("BeforeMethod is getting Launched",true);
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("Aftermethod is getting Launched",true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("BeforeTest is getting Launched",true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("AfterTest is getting Launched",true);
	}
	@Test
	public void MainMethod() {
		Reporter.log("main method",true);
	}
	

}
