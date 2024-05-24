package TestNGExcetion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Swiggy {
	@Test(groups="System")
	public void Swiggylaunch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		Reporter.log("Swiggy page",true);
		driver.quit();
	}

}
