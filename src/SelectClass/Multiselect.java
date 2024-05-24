package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
		WebElement Multi = driver.findElement(By.id("cars"));
		Select s=new Select(Multi);
		s.selectByValue("90");
		s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		s.selectByValue("399");
		Thread.sleep(2000);
		s.deselectByValue("399");
		System.out.println(s.getFirstSelectedOption().getText());
		System.out.println(s.isMultiple());
		
		List<WebElement> multi1 = s.getAllSelectedOptions();
		int size = multi1.size();
	      for(int i =0; i<size ; i++){
	         String options = multi1.get(i).getText();
	         System.out.println(options);
		
		
			
		}

	}
}


