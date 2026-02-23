package com.d.monefy.screens;

import org.openqa.selenium.By;

public class AddTransactionScreen extends BaseScreen {

    private final By amountInput = id("com.monefy.app.lite:id/amount_text");
    private final By saveButton = id("com.monefy.app.lite:id/buttonSave");

    // Generic category selector by visible text (Food, Transport, etc.)
    private By categoryByName(String name) {
        return xpath("//android.widget.TextView[@text='" + name + "']");
    }

    public AddTransactionScreen enterAmount(String amount) {
        type(amountInput, amount);
        return this;
    }

    public AddTransactionScreen selectCategory(String categoryName) {
        click(categoryByName(categoryName));
        return this;
    }

    public void save() {
        click(saveButton);
    }
}
