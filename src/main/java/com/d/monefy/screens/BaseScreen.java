package com.d.monefy.screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Collections;

public class BaseScreen {

    protected AppiumDriver driver;

    public BaseScreen() {
        this.driver = com.d.monefy.core.driver.DriverProvider.getDriver();
    }

    // ---------- BASIC ACTIONS ----------
    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void type(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    protected By id(String id) {
        return By.id(id);
    }

    protected By xpath(String xp) {
        return By.xpath(xp);
    }

    // ---------- COORDINATE TAP (W3C ACTIONS) ----------
    public void tapByPercentage(double xPercent, double yPercent) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;

        int x = (int) (width * xPercent);
        int y = (int) (height * yPercent);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);

        tap.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(tap));
    }
}
