package com.d.monefy.flows;

import com.d.monefy.screens.MainScreen;
import com.d.monefy.screens.AddTransactionScreen;

public class IncomeLifecycleFlow {

    public void addIncome(String amount, String category) {
        MainScreen main = new MainScreen();
        main.tapIncome();

        new AddTransactionScreen()
                .enterAmount(amount)
                .selectCategory(category)
                .save();
    }
}
