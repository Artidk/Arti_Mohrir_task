package com.d.monefy.core.driver;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public interface DriverManager {

    AppiumDriver createDriver();

}
