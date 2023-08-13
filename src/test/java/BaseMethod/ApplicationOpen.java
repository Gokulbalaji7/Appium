package BaseMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApplicationOpen extends AndroidBaseClass{
	
	@Test
	public void calculator() throws MalformedURLException, InterruptedException
	{
		configurationForAppium();
		
		

	}
}

