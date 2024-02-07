package covidTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.CovidcasePage;



public class CovidcaseTest extends BaseTest{
  @Test
  public void verifydropdown() {
	  CovidcasePage cp=new CovidcasePage(driver);
	  cp.SelectStateandDistrict();
  }
  public void verifystate()
  {
	  CovidcasePage cp=new CovidcasePage(driver);
	String actstate=  cp.getstate();
	String expstate="Assam";
	Assert.assertEquals(actstate, expstate);

  }
  public void verifydistrict()
  {
	  CovidcasePage cp=new CovidcasePage(driver);
	  String actdist=cp.getDistrict();  
	  String expdist="Baksa";
	  Assert.assertEquals(actdist, expdist);
  }
  
  
  
}
