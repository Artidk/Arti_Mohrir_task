package com.d.monefy.tests;

import com.d.monefy.flows.AddExpenseFlow;
import org.testng.annotations.Test;

public class AddExpenseE2ETest extends BaseTest {

    @Test
    public void addExpenseAndVerify() {
        new AddExpenseFlow().addExpense("50", "Food");
        // TODO: add balance + history assertions
    }
}
