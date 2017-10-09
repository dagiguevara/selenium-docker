package split.docker.selenium;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import split.docker.selenium.Init;
import org.openqa.selenium.By;





public class  Test4 extends Init{
	

	
  @Test
  public void login() throws MalformedURLException {
	  driver.findElement(By.name("email")).sendKeys("donald05@test.com");
	  driver.findElement(By.name("password")).sendKeys("Password01");
	  driver.quit();
 
  }
  
}
