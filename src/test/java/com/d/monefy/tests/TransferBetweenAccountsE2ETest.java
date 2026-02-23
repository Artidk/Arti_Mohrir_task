package com.d.monefy.tests;

import com.d.monefy.flows.TransferFlow;
import org.testng.annotations.Test;

public class TransferBetweenAccountsE2ETest extends BaseTest {

    @Test
    public void transferBetweenAccounts() {
        new TransferFlow().transfer("Cash", "Card", "20");
    }
}
