package selenium_grid_package;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid 
{
	public static void main(String[] args) throws Exception
	{
		//Node1
		URL u1=new URL("http://192.168.1.8:5555/wd/hub");
		DesiredCapabilities dc1=DesiredCapabilities.chrome();
		WebDriver driver1=new RemoteWebDriver(u1,dc1);
		driver1.get("https://www.google.com/");
		Thread.sleep(5000);
		driver1.close();
		
		//Node2
		URL u2=new URL("http://192.168.1.8:6666/wd/hub");
		DesiredCapabilities dc2=DesiredCapabilities.edge();
		WebDriver driver2=new RemoteWebDriver(u2,dc2);
		driver2.get("https://www.gmail.com/");
		Thread.sleep(5000);
		driver2.close();
		
		//Node3
		URL u3=new URL("http://192.168.1.8:7777/wd/hub");
		DesiredCapabilities dc3=DesiredCapabilities.firefox();
		WebDriver driver3=new RemoteWebDriver(u3,dc3);
		driver3.get("http://www.way2sms.com/");
		Thread.sleep(5000);
		driver3.close();
	}
}
