package selenium_grid_package;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node2 
{
	@Test
	public void node2() throws Exception
	{
		//Node2
		URL u2=new URL("http://192.168.1.8:6666/wd/hub");
		DesiredCapabilities dc2=DesiredCapabilities.edge();
		WebDriver driver2=new RemoteWebDriver(u2,dc2);
		driver2.get("https://www.gmail.com/");
		Thread.sleep(5000);
		driver2.close();
	}
}
