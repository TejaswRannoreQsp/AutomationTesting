package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByGroupedIndex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dunzo.com/search");
		driver.findElement(By.xpath("//input[@placeholder='Search for item or a store']")).sendKeys("Oranges");
		Thread.sleep(4000);
		//xpath by grouped index
//		driver.findElement(By.xpath("(//button[text()='ADD'])[1]")).click();
		
		//dependent n independent xpath
		driver.findElement(By.xpath("(//p[text()='Orange - Kinnow'])[1]/../../..//button[text()='ADD']")).click();
		

	}

}
