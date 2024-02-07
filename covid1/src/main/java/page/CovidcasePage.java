package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.ElementUtil;
import utility.Waitutility;


public class CovidcasePage  {
	WebDriver driver;
	@FindBy(xpath="//select[@name='selectedState']")
	WebElement dropdown;
	@FindBy(xpath="//select[@name='selectedDistrict']")
	WebElement dropdown1;
	@FindBy(xpath="By.xpath(\"//button[@class='mt-2 btn btn-outline-info btn-sm']")
	WebElement refresh;
	@FindBy(xpath="//h4[contains(text(),'State - ')]")
	WebElement state;
	@FindBy(xpath="//h4[contains(text(),'District - ')]")
	WebElement district;
	@FindBy(xpath="//button[@title='Text']")
	WebElement listview;
	@FindBy(xpath="//button[@title='Pie Chart']")
	WebElement pichart;
	ElementUtil elementutil;
	Waitutility waitutil;
	public  CovidcasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		 
		 
		 elementutil = new ElementUtil(driver);
		 waitutil=new Waitutility(driver);
		 
		 
	} 
	
	
		 
		 public void SelectStateandDistrict()
		    {
			 Select oselect=new Select(dropdown);
		        oselect.selectByValue("Assam");
		        
		        
		        Select ooselect=new Select(dropdown1);
		        ooselect.selectByValue("Baksa");
		       
		        elementutil.click(listview);
		    } 
		 public String getstate()
		 {
			String s=state.getText();
			return s;
			
		        
		 }
		 public String getDistrict()
		 {
			 String s1=district.getText();
			 return s1;
			 
		 }
		 
		 

}
