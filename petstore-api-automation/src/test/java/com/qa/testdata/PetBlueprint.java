package com.qa.testdata;

import com.qa.petmodels.Category;
import com.qa.petmodels.PetRecord;
import com.qa.petmodels.Tag;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public final class PetBlueprint {

    private PetBlueprint() {
        // Prevent instantiation — this is a utility/factory class
    }

    /**
     * Generates a valid PetRecord with testdata
     */
    public static PetRecord createRandomPet() {
        long id = generateRandomId();
        String name = "pet_" + id;
        List<String> photos = Collections.singletonList("https://images.petstore/" + id);

        Category category = new Category(2L, "Unique-category");
        List<Tag> tags = Collections.singletonList(new Tag(2L, "Unique-tag"));

        return new PetRecord(
                id,
                category,
                name,
                photos,
                tags,
                "available"
        );
    }

    private static long generateRandomId() {
        return ThreadLocalRandom.current().nextLong(200_000, 919_919);
    }
}
