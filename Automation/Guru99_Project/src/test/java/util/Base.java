package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Base {
	
public static WebDriver driver;
	
	public WebDriver connect()
	{
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Guru99_Project\\src\\test\\resources\\data.properties");
			Properties prop = new Properties();
			prop.load(fis);
			
			String browser = prop.getProperty("browser");
			String url = prop.getProperty("url");
			
			if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\OneDrive\\Desktop\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				 driver = new ChromeDriver();
			
				
			}
			
			else if(browser.equals("edge"))
			{
				System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\OneDrive\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe");
				 driver = new EdgeDriver();
			}
			
			driver.get(url);

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return driver;
	}
	
	public void getScreenShot(String name)
	{
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\OneDrive\\Pictures\\SS"+name+".png");
		
		try {
			Files.copy(source, dest);
			System.out.println("Scrrenshot taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
