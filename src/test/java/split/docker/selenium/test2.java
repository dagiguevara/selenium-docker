package split.docker.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class test2 {
	RemoteWebDriver driver;
	
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() throws MalformedURLException {
	  DesiredCapabilities capability = DesiredCapabilities.chrome();
	  driver = new RemoteWebDriver (new URL ( "http://localhost:4446/wd/hub"), capability);
	  driver.get("http://aqua-gem-dev.acklenavenueclient.com/#/");
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
