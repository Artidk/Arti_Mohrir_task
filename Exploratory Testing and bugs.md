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
| C05_TransferAccount | Transfer Accounts from Cash to Payment card and also reverse transfer, check the Amount updates correctly | Transfer Account, Transfer Amount | High |
| C06_CategoryPicker | Pick different categories when adding expenses, check if they show correctly in history | Category picker, History list | Medium |
| C07_NegativeAmounts | Try entering negative amounts (-5 EUR) for expense and see if app blocks it | Add expense, Income input | Medium |
| C08_TimeCharts | Switch between daily/weekly/monthly view, check if Balance match my transactions | Main screen charts | Medium |
| C09_LanguageCurrency | Change currency and Language in settings and add expense, check if balance displays correct | Settings, Language and Currency | Low |




## 4. Session notes and findings:
**Perform below Steps**
- Clicked on '-' button on Main Screen → 35 EUR expense added and Choose CATEGORY "Food" → Check for notification 
- Added 22.50 EUR expense and Choose CATEGORY "Transport" → Check for notification
- Added 21.99 EUR expense and Choose CATEGORY "Food" → Check for notification

**What worked**

- All the expenses updated in the History with Red dot symbol.
- CATEGORY updated in the History with value and currency.
- Total balance updated on the screen.

**What didn't work**

### C01_Add Expense – Findings

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



## 5. Defect and charter prioritisation:

## 6. Risks for this application:




