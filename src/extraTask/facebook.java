package extraTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.name("firstname")).sendKeys("Tejaswi");
		driver.findElement(By.name("lastname")).sendKeys("S Rao");
		driver.findElement(By.name("reg_email__")).sendKeys("2456378902");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Tejaswi@34567");
		driver.findElement(By.xpath("//label[text()='Female']/..//input[@name='sex']")).click();
		driver.findElement(By.name("websubmit")).click();
		driver.findElement(By.name("birthday_age")).sendKeys("89");
		

	}

}
