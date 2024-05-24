package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	@Test(dataProvider="cred")
	public void ToLogin(String username1,String password1) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		username.sendKeys(username1);
		password.sendKeys(password1);
		driver.quit();
	}
	
	@DataProvider(name="cred")
	public String[][] senddata() {
		String[][] data= {
				{"VigneshNayak678@gmail.com","Nayak123"},
				{"Sunil@gmail.com","sunil123"},
				{"pavanreddy208@gmail.com","pavan123"},
				{"ganesh@gmail.com","ganesh123"},
				{"aruna@gmail.com","aruna123"}
		};
		return data;
		
	}

}
