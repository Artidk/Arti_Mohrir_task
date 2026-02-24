package com.d.monefy.tests;

import com.d.monefy.core.driver.DriverFactory;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;

@Listeners(com.d.monefy.tests.TestListener.class)
public abstract class BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        DriverFactory.initDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        DriverFactory.quitDriver();
    }

    protected AppiumDriver driver() {
        return DriverFactory.getDriver();
    }
}
