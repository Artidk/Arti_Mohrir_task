package com.qa.testsuite;

import com.qa.foundation.ApiTestBootstrap;
import com.qa.petclient.PetGateway;
import com.qa.petmodels.PetRecord;
import com.qa.testdata.PetBlueprint;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.*;
import static io.qameta.allure.Allure.step;
import static com.qa.foundation.AllureAttachments.attachResponse;
import static com.qa.foundation.ApiAssertions.assertStatusCode;
import static com.qa.foundation.ApiAssertions.assertPetMatches;



/**
 * End-to-end lifecycle tests for the Pet domain.
 */

@Epic("Petstore API Automation")
@Feature("Pet Lifecycle Management")
public class PetLifecycleTest extends ApiTestBootstrap {

    private final PetGateway petGateway = new PetGateway();

    @Test(description = "Verify that a new pet can be created and retrieved successfully")
    @Story("Create and retrieve pet")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Ensures that a pet can be created and then fetched using its ID.")
    public void shouldCreateAndRetrievePet() {

        PetRecord newPet = PetBlueprint.createRandomPet();

        final Response[] creationHolder = new Response[1];
        final Response[] fetchHolder = new Response[1];

        step("Registering a new pet", () -> {
            creationHolder[0] = petGateway.registerPet(newPet);
            attachResponse("Create Pet Response", creationHolder[0]);
        });

        step("Fetching pet by ID: " + newPet.getId(), () -> {
            fetchHolder[0] = petGateway.fetchPet(newPet.getId());
            attachResponse("Get Pet Response", fetchHolder[0]);
        });


        assertStatusCode(creationHolder[0], 200);
        assertStatusCode(fetchHolder[0], 200);

        PetRecord returnedPet = fetchHolder[0].as(PetRecord.class);
        assertPetMatches(newPet, returnedPet);

    }


    @Test(description = "\"Verify that an existing pet can be updated successfully\"")
    @Story("Update pet details")
    public void shouldUpdateExistingPet() {


        PetRecord pet = PetBlueprint.createRandomPet();
        petGateway.registerPet(pet);

        pet.setStatus("sold");

        Response updateResponse = petGateway.modifyPet(pet);
        Response fetchResponse = petGateway.fetchPet(pet.getId());

        updateResponse.then().statusCode(200);
        fetchResponse.then().statusCode(200);

        PetRecord updatedPet = fetchResponse.as(PetRecord.class);

        Assert.assertEquals(updatedPet.getStatus(), "sold", "Pet status was not updated");
    }

}
