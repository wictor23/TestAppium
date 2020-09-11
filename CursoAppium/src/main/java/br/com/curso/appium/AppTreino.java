package br.com.curso.appium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;


public class AppTreino {
	
	@Test
	public  void AcessarAppTreino()throws MalformedURLException {
//		Config Driver de conexão
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "emulator-5554");
	    desiredCapabilities.setCapability("appPackage", "com.tricolorcat.calculator");
	    desiredCapabilities.setCapability("appActivity", "com.tricolorcat.calculator.MainActivity");
	    desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
	    desiredCapabilities.setCapability("newSessionWaitTimeout", 800);
	    desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 50);

	    
	    AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
	
	    
	    MobileElement el1 = (MobileElement) driver.findElementById("com.tricolorcat.calculator:id/btOK");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementById("com.tricolorcat.calculator:id/nine");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementById("com.tricolorcat.calculator:id/plus");
	    el3.click();
	    MobileElement el4 = (MobileElement) driver.findElementById("com.tricolorcat.calculator:id/nine");
	    el4.click();
	    MobileElement el5 = (MobileElement) driver.findElementById("com.tricolorcat.calculator:id/equal");
	    el5.click();
	    MobileElement el7 = (MobileElement) driver.findElementById("com.tricolorcat.calculator:id/display");
	    
	    Assert.assertEquals("18", el7.getText());
	    
	    driver.quit();
	}

}
