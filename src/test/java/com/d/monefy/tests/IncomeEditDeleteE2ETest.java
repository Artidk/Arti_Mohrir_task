package com.d.monefy.tests;

import com.d.monefy.flows.IncomeLifecycleFlow;
import org.testng.annotations.Test;

public class IncomeEditDeleteE2ETest extends BaseTest {

    @Test
    public void incomeLifecycle() {
        IncomeLifecycleFlow flow = new IncomeLifecycleFlow();
        flow.addIncome("100", "Salary");

    }
}
