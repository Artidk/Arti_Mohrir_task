package com.d.monefy.core.driver;

import com.d.monefy.core.config.FrameworkConfig;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverManager implements DriverManager {

    @Override
    public AppiumDriver createDriver() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", FrameworkConfig.platformName());
        caps.setCapability("appium:automationName", FrameworkConfig.automationName());
        caps.setCapability("appium:deviceName", FrameworkConfig.deviceName());
        caps.setCapability("appium:udid", FrameworkConfig.udid());
        caps.setCapability("appium:platformVersion", FrameworkConfig.platformVersion());
        caps.setCapability("appium:appPackage", FrameworkConfig.appPackage());
        caps.setCapability("appium:appActivity", FrameworkConfig.appActivity());
        caps.setCapability("appium:noReset", true);

        try {
            return new AndroidDriver(new URL(FrameworkConfig.appiumServerUrl()), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Invalid Appium server URL", e);
        }
    }
}
