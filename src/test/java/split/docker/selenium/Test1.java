package split.docker.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;



public class  Test1 {
	
RemoteWebDriver driver;
	
  @Test
  public void f() throws MalformedURLException {
	  
 DesiredCapabilities capability = DesiredCapabilities.chrome();
 driver = new RemoteWebDriver(new URL ("http://ec2-34-235-112-25.compute-1.amazonaws.com:4446/wd/hub"), capability);
 driver.get("http://facebook.com");
 
  }
  @BeforeMethod
  public void beforeMethod() {

	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
