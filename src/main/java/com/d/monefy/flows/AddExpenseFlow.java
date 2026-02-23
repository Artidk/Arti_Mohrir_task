package com.d.monefy.flows;

import com.d.monefy.screens.MainScreen;
import com.d.monefy.screens.AddTransactionScreen;


public class AddExpenseFlow {

    public void addExpense(String amount, String category) {
        MainScreen main = new MainScreen();
        main.tapExpense();

        AddTransactionScreen add = new AddTransactionScreen();
        add.enterAmount(amount)
                .selectCategory(category)
                .save();
    }
}
