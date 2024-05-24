package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		Rectangle emailtextfield = email.getRect();
		Rectangle passwordtextfield = password.getRect();
		System.out.println(emailtextfield.getX());
		System.out.println(passwordtextfield.getX());
		if(emailtextfield.getX()==passwordtextfield.getX()) {
			System.out.println("x-coordinates are similar");
		}else
			System.out.println("x-coordinates are not similiar");

	}

}
