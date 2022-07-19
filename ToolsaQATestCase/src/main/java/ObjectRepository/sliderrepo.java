package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sliderrepo {
	
	public WebDriver driver;
	public sliderrepo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='element-list collapse show']/ul/li[4]")
	private WebElement slider;
	
	@FindBy(xpath="//input[@type='range']")
	private WebElement range;
	
	@FindBy(xpath="//div[@class='col-3']/input")
	private WebElement valuerange;
	
	public WebElement slider()
	{
		return slider;
	}
	
	public WebElement range()
	{
		return range;
	}
	
	
	public WebElement valuerange()
	{
		
		return valuerange;
	}

}
