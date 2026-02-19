# Arti_Mohrir_task
Task Solution

Task 1 – Exploratory Testing of Monefy Application

## 1. Overview - Exploratory Testing and Monefy Application:

I have performed exploratory testing on Monefy Android Application. 
I have tested an application according to priority from high to low requirements as per my understandings.
My aim was to test important functionalities of money tracking and session based testing.
This document prepared based on my testing experience.


## 2. Test environment and scope:

**Device and app**

- Device: Android OS and My device details - OnePlus 9R, LE2101
- Android version: 14 
- Monefy Application  
- App language and currency: English, Deutsch and EUR

**In scope**

- Adding income and expenses from the main screen.  
- Editing and deleting existing transactions.  
- Checking how the total balance changes after each operation.
- Transfer Money from Cash to Payment card
- Checking Enabled Categories are updating on main screen.
- Checking Settings in the Application


## 3. Exploratory charters:


| ID  | What I planned to check | Screens | Priority |
|-----|-------------------------|---------|----------|
| C01_AddExpense | Add New expense from main screen by clicking on '-' button, check if balance updates instantly | Main screen, Add Expense | High |
| C02_AddIncome  | Add new income from main screen by clicking on '+', check if total balance shows correct income | Main screen, Add income | High |
| C03_HistoryList | Go to history, edit an expense amount and check if balance updates | History list, Edit screen | High |
| C04_HistoryList | Go to history, delete a transaction, check if it disappears and balance updates | History list, Delete Transaction | High |
| C05_TransferAccount | Transfer Amount from Cash to Payment card and also reverse transfer, check the Amount updates correctly | Transfer Account, Transfer Amount | High |
| C06_CategoryPicker | Pick different categories when adding expenses, check if they show correctly in history | Category picker, History list | Medium |
| C07_NegativeAmounts | Try entering negative amounts (-5 EUR) for expense and see if app blocks it | Add expense, Income input | Medium |
| C08_TimeCharts | Switch between daily/weekly/monthly view, check if Balance match my transactions | Main screen charts | Medium |
| C09_LanguageCurrency | Change currency and Language in settings and add expense, check if balance displays correct | Settings, Language and Currency | Low |




## 4. Session notes and findings:

### C01_Add Expense – Findings

**Perform below Steps**
- Clicked on '-' button on Main Screen and 35 EUR expense added and Choose CATEGORY "Food" now Check for notification.
- Added 22.50 EUR expense and Choose CATEGORY "Transport" now Check for notification.
- Added 21.99 EUR expense and Choose CATEGORY "Food" now Check for notification.

**What worked**
- All the expenses updated in the History with Red dot symbol.
- CATEGORY updated in the History with value and currency.
- Total balance updated on the screen.

**What didn't work**

### C01_Add Expense – Bug

| Field             | BUG Details                                                                                          |
|-------------------|--------------------------------------------------------------------------------------------------|
| Bug ID            | BUG-1001                                                                                         |
| Title             | Amount for same "Food" category is not summarized in History                                    |
| Status            | New                                                                                              |
| Charter Reference | C01_Add Expense                                                                                  |
| Operating System  | Android                                                                                          |
| Steps to Reproduce | 1. Add an expense of 35 EUR in the "Food" category.<br>2. Add another expense of 21.99 EUR in the "Food" category.<br>3. Go to History (or category view) and look for the total for "Food". |
| Expected Result   | History shows a summarized total for the "Food" category (around 56.99 EUR for the selected period). |
| Actual Result     | History only shows individual "Food" entries and no clear total amount for the "Food" category.  |
| Impact            | The user cannot easily see how much was spent on a single category, which makes it harder to understand spending patterns. |

### C02_Add Income – Findings

**Perform below Steps**
Add Account Payment Method Cash and VISA Card.
- Main screen Click on  '+' added income 5000 EUR "Salary" in VISA card Account Method.
- Click on '+' add income 2000 EUR "Deposits" in Cash Account Method.
- Check History by clicking on Three lines. |

**What worked**
- All the income added are updated in the History with Green dot symbol.
- CATEGORY "Salary" and "Deposits" are updated in the History with value and currency.
- Total balance updated on the screen.

**What didn't work**

### C02_Add Income – Bug

| Field             | Details                                                                                          |
|-------------------|--------------------------------------------------------------------------------------------------|
| Bug ID            | BUG-1002                                                                                         |
| Title             |Selected Account payment method is not present in History for added Income.                              |
| Status            | New                                                                                              |
| Charter Reference | C02_Add Income                                                                                   |
| Operating System  | Android                                                                                          |
| Steps to Reproduce | 1. Main screen Click on  '+' add income 5000 EUR "Salary" in VISA card Account Method.<br>2.Click on '+' add income 2000 EUR "Deposits" in Cash Account Method.<br>3. Check History by clicking on Three lines. |
| Expected Result   |After clicking on Three Lines on Main Screen, Account Method selected should be displayed in the History.      |
| Actual Result     |After clicking on Three Lines on Main Screen, Account Method selected is not displayed in the History.                     |
| Impact            | User is unable to understand in which Account Method income is added whether its Cash or VISA Card from History.|


### C03_Hisotry List – Findings

**Perform below Steps**
- Main screen Click on  '-' and add expense 500 EUR "Clothes" category.
- Main screen Click on  '-' and add expense 1200 EUR "Gifts" category.
- Click on Expense Clothes in History and update amount to 2300EUR.
- Check the History again and "Clothes" category amount should be updated to 2300 EUR.
 
**What worked**
- All the expense added are updated in the History with Red dot symbol.
- CATEGORY "Clothes" and "Gifts" are updated in the History with value and currency.
- Total balance updated on the screen after added expenses.
- After updating expense CATEGORY "Clothes", amount is updated in History and total balance is also updated.

### C04_Hisotry List – Findings

**Perform below Steps**
- Main screen Click on  '+' and add Income 7000 EUR "SALARY" category.
- Main screen Click on  '-' and add expense 500 EUR "Clothes" category.
- Main screen Click on  '+' and add Income 12000 EUR "DEPOSITS" category.
- Main screen Click on  '-' and add expense 1200 EUR "Gifts" category.
- Check the History for all the added expenses and added Income.
- Delete the expense transaction 500 EUR "Clothes" category from History.
- Total balance should be updated after deleting transaction.
- History List should be updated after deleting transaction.


**What worked**
- All the expense added are updated in the History with Red dot symbol.
- All the Income added are updated in the History with Green dot symbol.
- CATEGORY "Clothes" and "Gifts" are updated in the History with value and currency.
- CATEGORY "SALARY" and "DEPOSITS" are updated in the History with value and currency.
- Total balance updated on the screen after deleted transaction.
- After deleting 500 EUR CATEGORY "Clothes", History is updated.

### C05_Transfer Account – Findings

**Perform below Steps**
- Add Account Payment Method Cash and VISA Card.
- Click on  Main screen button Transfer right corner.
- Add an 2200 EUR Amount user wants to transfer.
- Click on 1st drop box to select Account Method for transfer Amount. Select VISA Card Account Method.
- Click on 2nd drop box and select Account Method Where the User wants to collect an Amount. Select Cash Account Method.
- Click on Add Transfer.
- Check the Amount is transferred correctly from VISA Card  and reflected into the selected Cash Account.
- Check the History and balance in the Account is updated correctly.

**What worked**
- Account payment method Cash and VISA card added successfully.
- Amount is transferred from VISA card to Cash without any issue.
- balance is updated in the respective Account method.

**What didn't work**

### C05_Transfer Account – Bug

| Field             | Details                                                                                          |
|-------------------|--------------------------------------------------------------------------------------------------|
| Bug ID            | BUG-1003                                                                                         |
| Title             | Amount Transfer details from Account Method VISA card or Cash is not updated in History (Three Lines View).                           |
| Status            | New                                                                                              |
| Charter Reference | C05_Transfer Account                                                                             |
| Operating System  | Android                                                                                          |
| Steps to Reproduce | 1.Account payment method Cash and VISA card added successfully.<br>2. Transfer 2200 EUR from VISA card to Cash Account Method.<br>3. Check History by clicking on Three lines. |
| Expected Result   |After clicking on Three Lines on Main Screen, Transfer Amount details should be present in History.|
| Actual Result     |After clicking on Three Lines on Main Screen, Transfer Amount details are not present in History.|                  |
| Impact            |User is unable to get an information about Amount Transfer from Histroy. This leads to mileading information to user. |



## 5. Defect and charter prioritisation:

## 6. Risks for this application:




