package split.docker.selenium;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

public class Init {
	
	public RemoteWebDriver driver;
 
  @BeforeMethod
  public void beforeMethod() throws MalformedURLException {
	  DesiredCapabilities capability = DesiredCapabilities.chrome();
	  driver = new RemoteWebDriver (new URL("http://ec2-34-235-112-25.compute-1.amazonaws.com:4446/wd/hub"), capability);
	  driver.get("http://roadrunner-dashboard-dev.s3-website-us-east-1.amazonaws.com/#!/signin");
	  //driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  }

}
