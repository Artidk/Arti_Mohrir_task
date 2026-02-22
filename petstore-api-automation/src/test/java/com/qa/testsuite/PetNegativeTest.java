package com.qa.testsuite;

import com.qa.foundation.ApiTestBootstrap;
import com.qa.petclient.PetGateway;
import com.qa.petmodels.PetRecord;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;

import static com.qa.foundation.ApiAssertions.assertStatusCode;
/**
 * Expected, Actual tests for the Pet domain.
 */

public class PetNegativeTest extends ApiTestBootstrap {

    private final PetGateway petGateway = new PetGateway();

    @Test(description = "ACTUAL BEHAVIOR: Non-existing pet returns 404")
    public void shouldReturn404ForNonExistingPet() {

        long nonExistingId = 21391211954L;

        Response response = petGateway.fetchPet(nonExistingId);

        assertStatusCode(response, 404);
    }


    @Test(description = "ACTUAL BEHAVIOR: Non-existing pet returns 404 with error message")
    public void shouldReturnErrorMessageForNonExistingPet() {

        long nonExistingId = 1024784764L; // any ID you know does not exist

        Response response = petGateway.fetchPet(nonExistingId);

        assertStatusCode(response, 404);

        String message = response.jsonPath().getString("message");
        Assert.assertEquals(message, "Pet not found");
    }


    /**
     * Edge Case 1: Invalid ID format (negative ID)
     */

    @Test(description = "ACTUAL BEHAVIOR: Negative ID returns 404 with error message")
    public void shouldReturnErrorForNegativeId() {

        long invalidId = -1903322L;

        Response response = petGateway.fetchPet(invalidId);

        assertStatusCode(response, 404);

        String message = response.jsonPath().getString("message");
        Assert.assertEquals(message, "Pet not found");
    }


    /**
     * Edge Case 2: Invalid payload (missing required fields)
     */

    @Test(description = "ACTUAL BEHAVIOR: Missing required fields still returns 200 and creates a pet")
    public void shouldReturnErrorForMissingRequiredFields() {

        PetRecord invalidPet = new PetRecord(
                null,                // id
                null,                // category
                null,                // name
                Collections.emptyList(), // photoUrls
                Collections.emptyList(), // tags
                null                 // status
        );

        Response response = petGateway.registerPet(invalidPet);

        assertStatusCode(response, 200);

        Long id = response.jsonPath().getLong("id");
        Assert.assertNotNull(id, "Expected server to generate an ID even for invalid payload");
    }
    /**
     * Edge Case 3: Empty payload
     */

    @Test(description = "ACTUAL BEHAVIOR: Creating a pet with empty JSON payload")
    public void shouldReturnErrorForEmptyPayload() {

        Response response = petGateway.createRawJson("{}");

        assertStatusCode(response, 200);
        Long id = response.jsonPath().getLong("id");
        Assert.assertNotNull(id, "Expected server to generate an ID even for empty payload");

    }

}
