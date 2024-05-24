package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/product.php");
		WebElement quantity = driver.findElement(By.id("add"));
		Actions a=new Actions(driver);
		a.doubleClick(quantity).perform();
		a.keyDown(Keys.ARROW_DOWN).perform();
		a.keyDown(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		a.keyUp(Keys.ARROW_UP).perform();
		

}
}