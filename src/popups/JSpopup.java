package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Alertpopup
//		driver.get("https://netbanking.hdfcbank.com/netbanking/");
//		driver.switchTo().frame("login_page");
//		driver.findElement(By.linkText("CONTINUE")).click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.accept();
		
		//confirmation popup
//		driver.get("https://licindia.in/");
//		driver.findElement(By.partialLinkText("Login")).click();
//		Alert alert = driver.switchTo().alert();
//		//alert.accept();
//		alert.dismiss();
		
		//prompt popup
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Tejaswi");
		alert.accept();

	}

}
