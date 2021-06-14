package udemyappium_2;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class firstTest {

	public static void main (String args[]) throws MalformedURLException
	{
		

	AndroidDriver<AndroidElement>  driver;
	File f=new File("src");
		File fs=new File(f,"ApiDemos-debug.apk");
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.VERSION, "11.0");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		//capabilities.setCapability(MobileCapabilityType.UDID, "emulator-1");
		//capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "sampleemulator_2");
	//	capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());//fs.getAbsolutePath to avoid hard coding of path
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		driver=new AndroidDriver<> (new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}

}
