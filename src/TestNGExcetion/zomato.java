package TestNGExcetion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class zomato {
	@Test(groups="System")
	public void zomatolaunch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		Reporter.log("zomato page",true);
		driver.quit();
	}

}
