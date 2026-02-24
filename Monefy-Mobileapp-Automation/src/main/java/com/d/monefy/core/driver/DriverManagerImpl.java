package com.d.monefy.core.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class DriverManagerImpl implements DriverManager {

    @Override
    public AppiumDriver createDriver() {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("deviceName", "emulator-5554");
            caps.setCapability("udid", "emulator-5554");
            caps.setCapability("appPackage", "com.monefy.app.lite");
            caps.setCapability("appActivity", "com.monefy.activities.main.MainActivity");
            caps.setCapability("noReset", true);
            caps.setCapability("disableWindowAnimation", true);
            caps.setCapability("uiautomator2ServerLaunchTimeout", 60000);


            return new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);

        } catch (Exception e) {
            throw new RuntimeException("Failed to create driver", e);
        }
    }
}
