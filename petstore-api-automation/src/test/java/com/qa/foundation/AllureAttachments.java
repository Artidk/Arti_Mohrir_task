package com.qa.foundation;

import io.qameta.allure.Allure;
import io.restassured.response.Response;

public final class AllureAttachments {

    private AllureAttachments() {
    }

    public static void attachResponse(String name, Response response) {
        if (response == null) {
            return;
        }
        Allure.addAttachment(
                name,
                "application/json",
                response.getBody().asPrettyString()
        );
    }

    public static void attachText(String name, String content) {
        if (content == null) {
            return;
        }
        Allure.addAttachment(
                name,
                "text/plain",
                content
        );
    }
}
