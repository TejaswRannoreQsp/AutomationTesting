package TestNGExcetion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class blinkIt {
	@Test(groups="Smoke")
	public void blikITlaunch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://blinkit.com/");
		Reporter.log("blinkIt page",true);
		driver.quit();
	}

}
