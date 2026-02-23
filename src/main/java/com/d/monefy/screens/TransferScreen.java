package com.d.monefy.screens;

import org.openqa.selenium.By;

public class TransferScreen extends BaseScreen {

    private final By fromAccount = id("com.monefy.app.lite:id/from_account_spinner");
    private final By toAccount = id("com.monefy.app.lite:id/to_account_spinner");
    private final By amountInput = id("com.monefy.app.lite:id/amount_text");
    private final By saveButton = id("com.monefy.app.lite:id/buttonSave");

    private By accountOption(String name) {
        return xpath("//android.widget.TextView[@text='" + name + "']");
    }

    public TransferScreen selectFromAccount(String name) {
        click(fromAccount);
        click(accountOption(name));
        return this;
    }

    public TransferScreen selectToAccount(String name) {
        click(toAccount);
        click(accountOption(name));
        return this;
    }

    public TransferScreen enterAmount(String amount) {
        type(amountInput, amount);
        return this;
    }

    public void save() {
        click(saveButton);
    }
}
