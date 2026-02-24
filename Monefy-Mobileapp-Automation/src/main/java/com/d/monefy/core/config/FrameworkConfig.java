package com.d.monefy.core.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FrameworkConfig {

    private static final Properties PROPS = new Properties();

    static {
        try (InputStream is = FrameworkConfig.class
                .getClassLoader()
                .getResourceAsStream("config.properties")) {
            if (is == null) {
                throw new IllegalStateException("config.properties not found on classpath");
            }
            PROPS.load(is);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
    }

    private static String get(String key) {
        return System.getProperty(key, PROPS.getProperty(key));
    }

    public static String platformName() {
        return get("platformName");
    }

    public static String deviceName() {
        return get("deviceName");
    }

    public static String udid() {
        return get("udid");
    }

    public static String platformVersion() {
        return get("platformVersion");
    }

    public static String automationName() {
        return get("automationName");
    }

    public static String appPackage() {
        return get("appPackage");
    }

    public static String appActivity() {
        return get("appActivity");
    }

    public static String appiumServerUrl() {
        return get("appiumServerUrl");
    }
}
