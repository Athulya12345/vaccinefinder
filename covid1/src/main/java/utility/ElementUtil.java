package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	WebDriver driver;
	public ElementUtil(WebDriver driver)
	{
		 this.driver=driver;
	}
	public void click(WebElement element)
	{
		 element.click();
		 
	}
	public void sendkeys(WebElement element,String value)
	{
		element.sendKeys(value);
	}
	public void dropdownIndexPosition(WebElement element,int number)
	{
		Select select=new Select(element);
        select.selectByIndex(number);
        
	}
	public String getText(WebElement element)
	{
		String text=element.getText();
		return text;
		
	}
	public void dateSelect(WebElement element,String dateValue) {

		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].setAttribute('value','"+dateValue+"');", element);

	}
	

}
