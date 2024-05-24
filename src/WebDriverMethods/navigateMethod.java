package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		Navigation navigate = driver.navigate();
		navigate.to("https://www.swiggy.com/");
		Thread.sleep(2000);
		navigate.back();//zomato
		Thread.sleep(2000);
		navigate.forward();//swiggy
		Thread.sleep(2000);
		navigate.refresh();//swiggy
		

	}

}
