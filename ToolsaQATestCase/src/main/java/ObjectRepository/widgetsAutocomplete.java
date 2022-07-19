package ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class widgetsAutocomplete {

	public WebDriver driver;
	public widgetsAutocomplete(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath ="//div[@class='element-list collapse show']/ul/li[2]")
	 private WebElement AutoComplete;
	
	
	
	@FindBy(xpath="//input[@id='autoCompleteMultipleInput']")
	
	 private WebElement multicolor;
	
	@FindBy(xpath="//div[@class='auto-complete__menu-list auto-complete__menu-list--is-multi css-11unzgr']/div")
	private List<WebElement> listofcolors;
	
	

	
	public WebElement AutoComplete()
	{
		return AutoComplete;
	}
	
	public WebElement multicolorSelelction()
	{
		return multicolor;
	}
	
	public List<WebElement> listofcolors()
	{
		return listofcolors;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
