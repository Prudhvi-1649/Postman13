package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dr = new FirefoxDriver();
		Thread.sleep(5000);
		//dr.manage().window().maximize();
		//login to IRCTC
		dr.get("https://www.irctc.co.in/");
		
		
	}

}
