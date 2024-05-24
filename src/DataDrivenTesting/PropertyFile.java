package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		//location /path of the file
		File f=new File(".\\Testdata\\Testdata.properties");
		FileInputStream fis=new FileInputStream(f);
		
		//Create an object of property file
		Properties prop=new Properties();
		
		//load the data in the property file
		prop.load(fis);
		
		//Using the data from the property file
		String url = prop.getProperty("URL");
		
		//common steps
		WebDriver driver=new ChromeDriver();
		driver.get(url);

	}

}
