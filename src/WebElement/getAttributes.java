package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/demo-request");
		Thread.sleep(4000);
//		String attribute = driver.findElement(By.linkText("Try Free")).getAttribute("class");
//		System.out.println(attribute);
		WebElement attribute = driver.findElement(By.linkText("Try Free"));
		System.out.println(attribute.getCssValue("color"));
		System.out.println(attribute.getCssValue("cursor"));
		System.out.println(attribute.getTagName());
		System.out.println(attribute.getText());
		System.out.println(attribute.getLocation());
		System.out.println(attribute.getSize());
		

	}

}
