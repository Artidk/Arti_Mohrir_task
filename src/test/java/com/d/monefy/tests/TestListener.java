package com.d.monefy.tests;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.d.monefy.core.driver.DriverProvider;

public class TestListener implements ITestListener {

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] takeScreenshot() {
        try {
            return ((TakesScreenshot) DriverProvider.getDriver()).getScreenshotAs(OutputType.BYTES);
        } catch (Exception e) {
            return new byte[0];
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot();
    }
}
