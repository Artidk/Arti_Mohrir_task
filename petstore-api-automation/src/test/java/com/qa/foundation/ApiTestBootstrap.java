package com.qa.foundation;

import io.restassured.RestAssured;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.annotations.BeforeClass;

import static com.qa.foundation.TestEnvironment.getBaseUri;

public abstract class ApiTestBootstrap {

    @BeforeClass
    public void configureFramework() {

        RestAssured.baseURI = getBaseUri();

        RestAssured.filters(
                new RequestLoggingFilter(LogDetail.ALL),
                new ResponseLoggingFilter(LogDetail.ALL)
        );

        System.out.println("🔧 API Test Framework initialized for base URI: " + RestAssured.baseURI);
    }
}
