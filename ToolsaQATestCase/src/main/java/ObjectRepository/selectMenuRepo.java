package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectMenuRepo {
	
	public WebDriver driver;
	public selectMenuRepo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='element-list collapse show']/ul/li[9]")
	private WebElement selectMenu;
	
	@FindBy(xpath="(//div[@class=' css-1hwfws3']/div)[1]")
	private WebElement clickonField;
	
	@FindBy(xpath="(//div[@class=' css-yt9ioa-option'])[3]")
	private WebElement varifySelectedValue;
	
	
	@FindBy(xpath="(//div[@class=' css-yt9ioa-option'])[3]")
	private WebElement selelctValue;
	
	@FindBy(xpath="//*[@id='selectOne']/div/div[1]/div[1]")
	private WebElement clickonTitle;
	
	@FindBy(xpath="//div[@class=' css-yt9ioa-option']")
	 private List<WebElement> listOfTotles;
	
	@FindBy(xpath="(//div[@class=' css-1hwfws3']/div)[5]")
	private WebElement clickOnMultiColorField;
	
	@FindBy(xpath="//div[@class=' css-11unzgr']/div")
	private List<WebElement> listOfColors;
	
	
	@FindBy(id="cars")
	private WebElement multi;
	
	
	
	//list of methods
	
	public WebElement selectMenu()
	{
		return selectMenu;
	}
	
	public WebElement clickonField()
	{
		return clickonField;
	}
	 
	
	public WebElement textValidation()
	{
		return varifySelectedValue;
	}
	
	public WebElement selelctValue()
	{
		return selelctValue;
	}
	
	public WebElement clickonTitle()
	{
		return clickonTitle;
	}
	
	public List<WebElement> listOfTotles()
	{
		return listOfTotles;
	}
	
	
	public WebElement clickOnMultiColorField()
	{
		return clickOnMultiColorField;
	}
	
	
	public List<WebElement> listOfColors()
	{
		return listOfColors;
	}
	
	public WebElement multi()
	{
		return multi;
	}
	

}
