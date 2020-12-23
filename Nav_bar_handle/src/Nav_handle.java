import org.testng.annotations.Test;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Nav_handle {
	@Test
	public  void test() throws InterruptedException {
		
		System.out.println(getClass().getSimpleName());
		Logger log=Logger.getLogger("test");
	PropertyConfigurator.configure("Log4j.properties");
	log.info("Launch URL");
		// TODO Auto-generated method stub
	System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\CHROMEDRIVER\\chromedriver.exe");
				WebDriver dr=new ChromeDriver();
      dr.get("http://www.sugunafoods.co.in/brands/suguna_chicken.asp");
      
      log.info("Validate the navbar files");
      Actions a=new Actions(dr).contextClick(dr.findElement(By.xpath("//*[@id=\"section_content\"]/img")));
      a.sendKeys(Keys.RIGHT).sendKeys(Keys.ENTER).build().perform();
     
      
      List<WebElement> value=dr.findElements(By.xpath("//*[@id=\"primary_global_navigation\"]/ul/li/a"));
      
      for(int i=0;i<value.size();i++)
      {
    	  String elementText = value.get(i).getAttribute("innerHTML");
    	  System.out.println(elementText); 
    	  
      }
      Thread.sleep(10000);
      value.get(1).click();
      
      log.info("Nav bar files loaded sucessfully");
      System.out.println("Completed");
      
      log.info("Completed status");
	/*dr.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
	Thread.sleep(5000);
	dr.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("TESTER1");
	dr.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("REDDY");
	dr.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("TESTER.1649.1649.1649");
	dr.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("TESTER.1649.1649.1649");
	dr.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("TESTER.1649.1649.1649");
	dr.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/content")).click();*/
	
	
	
      
      
	}

}

