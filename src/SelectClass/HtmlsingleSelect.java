package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HtmlsingleSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Tejaswi%20S%20Rao/Documents/Testing%20Batches/SelectClass.html");
		WebElement Menu = driver.findElement(By.id("Empire"));
		
		//Single-select
		Select s=new Select(Menu);
//		s.selectByIndex(0);
//		s.selectByVisibleText("Peri peri chicken");
//		s.selectByValue("b");
		
//		Multi-select
		s.selectByIndex(0);
		s.selectByValue("c");
		s.selectByVisibleText("chicken Sizzler");
		Thread.sleep(2000);
		s.deselectByIndex(2);
		
		
	

	}


}
