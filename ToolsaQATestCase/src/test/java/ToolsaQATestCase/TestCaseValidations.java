package ToolsaQATestCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import ObjectRepository.progressBarRepo;
import ObjectRepository.selectMenuRepo;
import ObjectRepository.sliderrepo;
import ObjectRepository.widgetsAutocomplete;
import Toolsqa.ToolsaQATestCase.Base;





	public class TestCaseValidations extends Base {
		public ExtentReports report;
	public 	widgetsAutocomplete obj;
	
	 
	@BeforeClass
	public void strartDriver()
	{
		driverinitiate();
		System.out.println("start the browser");
		System.out.println("should start only once");
		System.out.println("check whih browser you are using");
		
		
	}
	
	@BeforeTest
	public void confi()
	{
		String path=System.getProperty("user.dir")+"\\reports\\report.html";
		ExtentSparkReporter spark= new ExtentSparkReporter(path);
		spark.config().setReportName("ToolsqsReport");
		spark.config().setDocumentTitle("Toolsqa");
		
		 report= new ExtentReports();
		report.attachReporter(spark);
		System.out.println("this code will run to generate the xtent report");
	}
	
	//testcase1
	@Test(priority=0,enabled=true)
	 public void AutoComplete() throws InterruptedException
	 {
		
		System.out.println("this code will selelct color from multicolorlist");
		
		report.createTest("AutoComplete");
		 obj= new widgetsAutocomplete(driver);
		 obj.AutoComplete().click();
		 
		 executorforScroll("window.scrollBy(0,200)");
		 obj.multicolorSelelction().click();
		 obj.multicolorSelelction().sendKeys("r");
		 
		 List<WebElement> multicolorlist= obj.listofcolors();
		 System.out.println(multicolorlist.size());
		 try {
		 for(int i=0;i<=multicolorlist.size();i++)
		 {
			 
			 String text=obj.listofcolors().get(i).getText();
			 System.out.println(text);
			 if(text.equals("Purple"))
			 {
				 obj.listofcolors().get(i).click();
				 System.out.println("selelcted clor is "+ obj.listofcolors().get(i).getText());	 
			 }
			 }
		 }
		 catch
		 (Exception e) {
	            System.out.println("\nException caught");
	        }
		 
		Thread.sleep(3000);
		 obj.multicolorSelelction().sendKeys("b");
		 List<WebElement> multicolorlist2= obj.listofcolors();
		 System.out.println(multicolorlist2.size());
		 try {
		 for(int i=0;i<multicolorlist2.size();i++)
		 {
			 
			 String text=obj.listofcolors().get(i).getText();
			 if(text.equals("Black"))
			 {
				 obj.listofcolors().get(i).click();
				 System.out.println("selelcted clor is "+ obj.listofcolors().get(i).getText());
			 }
		 }
		 }
		 catch(Exception e)
		 {
			 System.out.println("\nException caught");
			 
		 }
		 
			 
		 
		// obj.multicolorSelelction().sendKeys(Keys.ENTER);
		//// obj.multicolorSelelction().sendKeys("")
	  }
	
	@Test(priority=1,enabled=true)
	public void slider() throws InterruptedException
	{
		
		report.createTest("slider");
		sliderrepo obj= new sliderrepo(driver);
		obj.slider().click();
		for (int i = 1; i <= 28 ; i++) {
            obj.range().sendKeys(Keys.ARROW_RIGHT);
        }
		
		Thread.sleep(2000);
		String value=obj.valuerange().getAttribute("value");
		System.out.println("value is" +value);
		int valuenew=Integer.parseInt(value);  
		Assert.assertEquals(valuenew, 53);
	}
	
	//Testcase 3
	@Test(priority=2,enabled=true)
	
	public void progressBar() throws InterruptedException
	{
		
		report.createTest("progressBar");
		progressBarRepo obj = new progressBarRepo(driver);
		executorforScroll("window.scrollBy(0,600)");
		obj.progressbar().click();
		Thread.sleep(2000);
		String text2="progresswidth: 63%;";
		String text=obj.progress().getAttribute("style");
		System.out.println("progress"+text);
		obj.start().click();
		Thread.sleep(6250);
		obj.start().click();	
	}
	
	@Test(priority=3, enabled=true)
	public void menuSelection() throws InterruptedException
	{
		report.createTest("menuSelection");
		selectMenuRepo obj= new selectMenuRepo(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		executorforScroll("window.scrollBy(0,800)");
		obj.selectMenu().click();
		Thread.sleep(2000);
		obj.clickonField().click();
		String valueselelcted=obj.textValidation().getText();
		System.out.println("selected value for group "+valueselelcted);
		obj.selelctValue().click();
		Thread.sleep(2000);
		
		
		obj.clickonTitle();
		List<WebElement> list=obj.listOfTotles();
		for(int i=0;i<list.size();i++)
		{
			
			WebElement text=obj.listOfTotles().get(i);
			
			System.out.println(text.getText());
			if(text.getText().equals("Mrs."))
			{
				System.out.println("selelcted text is "+ text.getText());
				Thread.sleep(2000);
				//System.out.println("jhgjhgjh");
				obj.listOfTotles().get(i).click();
				
				break;
			}	
			}
		
		executorforScroll("window.scrollBy(0,500)");
		obj.clickOnMultiColorField().click();
		List<WebElement> colorlist=obj.listOfColors();
		int count=0;
		for(int j=0;j<colorlist.size();j++)
		{
			WebElement color=obj.listOfColors().get(j);
			
			
			if(color.getText().equals("Black") || color.getText().equals("Green") )
			{
				System.out.println("added text is "+ color.getText());
				obj.listOfColors().get(j).click();		
			}
	
			count++;
			if(count==2)
			{
				break;
			}
			
		}
		
			Select s= new Select(obj.multi()); 
			s.selectByValue("saab");
			s.selectByValue("audi");	
	}

	
	
	@AfterClass
	public void driverclose()
	{
		driver.quit();
		report.flush();
	}
	}
