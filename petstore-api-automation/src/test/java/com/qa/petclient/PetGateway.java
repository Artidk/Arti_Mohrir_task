package com.qa.petclient;

import com.qa.petmodels.PetRecord;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

/**
 *Gateway layer responsible for communicating with the Petstore API.
 **/
public class PetGateway {

    private static final String PET_ENDPOINT = "/pet";

    public Response registerPet(PetRecord pet) {
        return given()
                .contentType(ContentType.JSON)
                .body(pet)
                .post(PET_ENDPOINT);
    }

    public Response fetchPet(long petId) {
        return given()
                .get(PET_ENDPOINT + "/{id}", petId);
    }

    public Response modifyPet(PetRecord pet) {
        return given()
                .contentType(ContentType.JSON)
                .body(pet)
                .put(PET_ENDPOINT);
    }

    public Response removePet(long petId) {
        return given()
                .delete(PET_ENDPOINT + "/{id}", petId);
    }

    /**
     * Sends raw JSON payloads to the Pet API.
     * Used for negative and edge-case testing (invalid JSON, empty JSON, malformed payloads).
     */
    public Response createRawJson(String json) {
        return given()
                .contentType(ContentType.JSON)
                .body(json)
                .post(PET_ENDPOINT);
    }
}
