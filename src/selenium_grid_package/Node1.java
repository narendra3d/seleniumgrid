package selenium_grid_package;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node1 
{
	@Test
	public void node1() throws Exception
	{
		//Node1
		URL u1=new URL("http://192.168.1.8:5555/wd/hub");
		DesiredCapabilities dc1=DesiredCapabilities.chrome();
		WebDriver driver1=new RemoteWebDriver(u1,dc1);
		driver1.get("https://www.google.com/");
		Thread.sleep(5000);
		driver1.close();
	}
}
