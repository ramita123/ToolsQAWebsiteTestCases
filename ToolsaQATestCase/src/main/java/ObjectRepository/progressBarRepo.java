package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class progressBarRepo {
	
	public WebDriver driver;
	public progressBarRepo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	

	@FindBy(xpath="//button[@id='startStopButton']")
	private WebElement start;
	
	
	@FindBy(xpath="//div[@class='element-list collapse show']/ul/li[5]")
	private WebElement progressbar;
	
	@FindBy(xpath="//div[@role='progressbar']")
	private WebElement progress;
	
	
	public WebElement progressbar()
	{
		return progressbar;
	}
	
	public WebElement start()
	{
		return start;
	}
	
	
	
	public WebElement progress()
	{
		return progress;
	}

}
