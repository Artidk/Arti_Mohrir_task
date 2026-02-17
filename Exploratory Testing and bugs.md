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

## 5. Defect and charter prioritisation:

## 6. Risks for this application:




