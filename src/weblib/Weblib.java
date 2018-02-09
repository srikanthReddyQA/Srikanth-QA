package weblib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Weblib {
	
	WebDriver driver;
	
	
	public boolean ClickElement(String locator,String value,WebDriver driver)
	{
		boolean stepstatus=true;
		
		switch(locator.toLowerCase())
		{
		case "id":
			
			try
			{
				driver.findElement(By.id(value)).click();
				stepstatus=true;
			}
			catch(Exception e)
			{
				System.out.println("$$$$$$$$$$$$$$$");
				stepstatus=false;
			}
			
			 break;
			 
		case "xpath":
			try
			{
				driver.findElement(By.xpath(value)).click();
				stepstatus=true;
			}
			catch(Exception e)
			{
				stepstatus=false;
			}

			 break;
			 
		case "css":
			 break;
			 
		case "linktext":
			 break;
			 
		case "partiallinktext":
			 break;
			 
		case "name":
			 break;
			 
		 default:
				 
				 break;
		
		
		}
		
		
		
		
		
	
		
		return stepstatus;
		
	}

	
	// By Username=By.xpath("//input[@id='txtUsername");
	public boolean SetText(String xpathobj, String value,WebDriver driver)
	{
		boolean stepstatus=true;
		try {
			
			driver.findElement(By.xpath(xpathobj)).sendKeys(value);
			stepstatus=true;
		
		}
		catch(Exception e)
		{
			stepstatus=false;
		}
		return stepstatus;
			
	}

}
