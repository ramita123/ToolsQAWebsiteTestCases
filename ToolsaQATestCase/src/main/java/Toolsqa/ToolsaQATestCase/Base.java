package Toolsqa.ToolsaQATestCase;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static void driverinitiate()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\ToolsaQATestCase\\chromedriver2.exe" );
		driver= new ChromeDriver();
		driver.get("https://demoqa.com/widgets");	
		
		
		
	}
	
	public void executorforScroll(String value)
	{
		JavascriptExecutor obj4= (JavascriptExecutor)driver;
		obj4.executeScript(value);
	}
	
	
	
	

}
