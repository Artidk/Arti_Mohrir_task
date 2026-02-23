package com.d.monefy.flows;

import com.d.monefy.screens.MainScreen;

import com.d.monefy.screens.TransferScreen;

public class TransferFlow {

    public void transfer(String from, String to, String amount) {
        MainScreen main = new MainScreen();
        main.openTransfer();

        new TransferScreen()
                .selectFromAccount(from)
                .selectToAccount(to)
                .enterAmount(amount)
                .save();
    }
}
