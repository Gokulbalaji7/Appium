package BaseMethod;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AndroidBaseClass {
	
	
	public AndroidDriver driver;

	public AppiumDriverLocalService service;

	@BeforeClass
	public void configurationForAppium() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities caps = new DesiredCapabilities();	
		//android device name
		caps.setCapability("deviceName", "emulator-5554");
		caps.setCapability("newCommandTimeout", 100000);
		//which platform 
		caps.setCapability("platformName", "ANDROID");
		//platform version of current device or emulator
		caps.setCapability("platformVersion", "14");
		//real device unique id
		//caps.setCapability("udid", "lfzhn7rwk7irbqbe");
		//caps.setCapability("app", "C:\\Users\\gokul\\OneDrive\\Desktop\\resources\\ApiDemos-debug.apk");
		
		caps.setCapability("appPackage", "com.google.android.youtube");
		caps.setCapability("appActivity", "com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity");
		//if app is already installed no need to reinstall
		caps.setCapability("noReset", true);
		//automation driver name for android 
		caps.setCapability("automationName", "UIAutomator2");

		//to start the server automatically useful for Jenkins integration
//		service= new AppiumServiceBuilder()
//				.withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
//				.withIPAddress("127.0.0.1")
//				.usingPort(4723)
//				.build();
//		service.start();

		//connecting the server with mobile
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"), caps);
		//implicit wait for whole class
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//It is only for real device
		//Thread.sleep(10000);
	}

	 

}

