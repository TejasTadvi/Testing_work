package main;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import util.Base;
import util.ExcellReader;

public class LoginTest extends Base{
	
	@Test(dataProvider = "dp")
	public void test(String uname, String pass,String expected)
	{
		
		driver = connect();
		System.out.println(uname+" "+pass+" "+expected);
		LoginPage log = new LoginPage(driver);
		log.enterUsername(uname);
		log.enterPassword(pass);
		log.loginclick();
		  
		
		
		try {
			Alert alert = driver.switchTo().alert();
			String actual = alert.getText();
			assertEquals(actual, expected);
			
		} catch (Exception e) {
			String actualTitle = driver.getTitle();
			assertEquals(actualTitle,expected);
		}
	}
	
	@DataProvider(name="dp")
	public Object[][] getData()
	{
		ExcellReader rd = new ExcellReader("C:\\Users\\pc\\Desktop\\Test\\28march.xlsx", "guru");
		int rows= rd.rowcount();
		int cols = rd.colcount();
		
		Object obj[][] = new Object[rows-1][cols];
		
		for(int i=1;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				String data = rd.getData(i, j);
				obj[i-1][j] = data;
			}
		}
	
		return obj;
	
	}

}
