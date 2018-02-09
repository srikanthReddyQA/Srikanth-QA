package weblib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test extends Weblib {

	public void login() throws InterruptedException
	{
		boolean status;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm");
		Thread.sleep(1000);
		status=SetText("//input[@id='txtUsername']" ,"user01", driver);
		System.out.println(status);
		
		status=SetText("//input[@id='txtPassword']", "pass1234", driver);
		System.out.println(status);
		
		status=ClickElement("id", "btnLogin", driver);
		System.out.println(status);
		
		
	}
	public static void main(String  arg[]) throws InterruptedException {
		Test t = new Test();
		t.login();
	}

}
