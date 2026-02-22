package com.qa.foundation;

import com.qa.petmodels.PetRecord;
import io.restassured.response.Response;
import org.testng.Assert;

public final class ApiAssertions {

    private ApiAssertions() {}

    public static void assertStatusCode(Response response, int expectedStatus) {
        Assert.assertNotNull(response, "Response should not be null");
        Assert.assertEquals(response.getStatusCode(), expectedStatus, "Unexpected HTTP status code");
    }

    public static void assertPetMatches(PetRecord expected, PetRecord actual) {
        Assert.assertNotNull(actual, "Returned pet should not be null");
        Assert.assertEquals(actual.getId(), expected.getId(), "Pet ID mismatch occurred");
        Assert.assertEquals(actual.getName(), expected.getName(), "Pet name mismatch occurred");
        Assert.assertEquals(actual.getStatus(), expected.getStatus(), "Pet status mismatch occurred");
    }
}
