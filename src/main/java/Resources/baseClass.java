package Resources;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class baseClass {
	
	public WebDriver driver;
	Properties prop;
	public void intialization() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		 driver=new ChromeDriver();
		 prop = new Properties();
		  prop.load(fis);
	}
	
	
	 // @BeforeMethod 
	/* public void LaunchUrl() throws IOException {
	  
		 // intialization();
		  String url = prop.getProperty("url");
		  driver.get(url);
	 }*/
	 

}
