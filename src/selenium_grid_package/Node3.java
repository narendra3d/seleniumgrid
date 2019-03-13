package selenium_grid_package;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node3 
{
	@Test
	public void node3() throws Exception
	{
		//Node3
		URL u3=new URL("http://192.168.1.8:7777/wd/hub");
		DesiredCapabilities dc3=DesiredCapabilities.firefox();
		WebDriver driver3=new RemoteWebDriver(u3,dc3);
		driver3.get("http://www.way2sms.com/");
		Thread.sleep(5000);
		driver3.close();
	}
}
