package com.d.monefy.core.driver;

import io.appium.java_client.AppiumDriver;

public class DriverProvider {

    private static AppiumDriver driver;

    public static AppiumDriver getDriver() {
        if (driver == null) {
            driver = new DriverManagerImpl().createDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
