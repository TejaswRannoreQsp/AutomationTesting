package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		Actions a=new Actions(driver);
		//1st strategy
//		a.moveByOffset(215, 36).perform();
//		driver.findElement(By.linkText("Kurtas & Suits")).click();
		
		//2nd Strategy
		WebElement abc = driver.findElement(By.partialLinkText("WOMEN"));
		a.moveToElement(abc).perform();
		driver.findElement(By.linkText("Kurtas & Suits")).click();
		

	}

}
