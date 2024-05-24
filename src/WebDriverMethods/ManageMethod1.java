package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		Dimension beforeMaximizing = driver.manage().window().getSize();
		System.out.println(beforeMaximizing);
		driver.manage().window().maximize();
		Dimension afterMaximizing = driver.manage().window().getSize();
		System.out.println(afterMaximizing);
		driver.manage().window().setSize(new Dimension(500,100));
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		driver.manage().window().setPosition(new Point(40,30));

	}

}
