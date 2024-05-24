package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calender_hiddenpopup {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.abhibus.com/");
		Actions a=new Actions(driver);
		a.moveByOffset(767, 257).click().perform();
		driver.findElement(By.xpath("//span[text()='May']/../../..//span[text()='20']")).click();

	}

}
