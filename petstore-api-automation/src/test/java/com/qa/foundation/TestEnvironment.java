package com.qa.foundation;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class TestEnvironment {

    private static final String CONFIG_FILE = "test-environment.properties";
    private static final Properties PROPERTIES = new Properties();

    static {
        try (InputStream input = TestEnvironment.class
                .getClassLoader()
                .getResourceAsStream(CONFIG_FILE)) {

            if (input == null) {
                throw new IllegalStateException("Missing config file: " + CONFIG_FILE);
            }
            PROPERTIES.load(input);
        } catch (IOException e) {
            throw new IllegalStateException("Failed to load environment configuration", e);
        }
    }

    private TestEnvironment() {
    }

    public static String getBaseUri() {
        String env = PROPERTIES.getProperty("env", "dev");
        String baseUri = PROPERTIES.getProperty(env + ".baseUri");
        if (baseUri == null || baseUri.isBlank()) {
            throw new IllegalStateException("Base URI not configured for env: " + env);
        }
        return baseUri;
    }
}
