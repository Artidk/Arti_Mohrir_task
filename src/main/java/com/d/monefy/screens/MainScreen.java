package com.d.monefy.screens;

import org.openqa.selenium.By;

public class MainScreen extends BaseScreen {

    private final By expenseButton  = By.id("com.monefy.app.lite:id/expense_button");
    private final By incomeButton   = By.id("com.monefy.app.lite:id/income_button");
    private final By transferButton = By.id("com.monefy.app.lite:id/transfer_menu_item");

    // FAB (+) via coordinates
    public void tapAddButton() {
        tapByPercentage(0.50, 0.88); // center bottom
    }

    public void tapIncome() {
        tapAddButton();
        click(incomeButton);
    }

    public void tapExpense() {
        tapAddButton();
        click(expenseButton);
    }

    public void openTransfer() {
        tapAddButton();
        click(transferButton);
    }
}
