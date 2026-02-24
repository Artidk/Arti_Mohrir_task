package com.d.monefy.screens;

import org.openqa.selenium.By;

public class HistoryScreen extends BaseScreen {

    private final By firstTransaction = xpath("(//android.widget.LinearLayout[contains(@resource-id,'transaction')])[1]");
    private final By editButton = id("com.monefy.app.lite:id/edit");
    private final By deleteButton = id("com.monefy.app.lite:id/delete");

    public HistoryScreen openFirstTransaction() {
        click(firstTransaction);
        return this;
    }

    public HistoryScreen editTransaction() {
        click(editButton);
        return this;
    }

    public HistoryScreen deleteTransaction() {
        click(deleteButton);
        return this;
    }
}
