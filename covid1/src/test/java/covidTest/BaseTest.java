package covidTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {

	WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    driver.get("https://indian-vaccine.web.app/total-cases");
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
  }

}
