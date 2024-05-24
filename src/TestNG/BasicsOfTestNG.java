package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicsOfTestNG {
	@Test(priority=-3,dependsOnMethods = "Flipkart")
	public void Amazon() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("Amazon",true);
		driver.quit();
		
	}
	@Test(priority=10)
	public void Flipkart() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Reporter.log("Flipkart",true);
		driver.quit();
		
	}
	@Test(priority=-1,enabled=false)
	public void W3school() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		Reporter.log("W3school",true);
		driver.quit();
		
	}
	@Test(priority=2)
	public void Myntra() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Reporter.log("Myntra",true);
		driver.quit();
		
	}

}
