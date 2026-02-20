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
- Check History by clicking on Three lines. 

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

### C06_Category picker – Findings

**Perform below Steps**
- Click on  Main screen Three dot(Upper Right Corner)
- Click on Categories.
- Check the Enabled Categories are visible on Main Screen.
- Add Expenses for selected Categories.
- Add Expense 'Eating out'500 EUR from Main Screen.
- Check the Total balance and History updated.
- Disable category 'Eating out' and should not be displayed on main screen.
- Check Merged Categories as a one Category should be displayed on main screen.

**What worked**
- Categories are present on the main Screen as per Enabled function.
- Disabled Function is also working and categories are not visible on the main screen.
- Merge function is also working and Merged categories which is selected to be on main screen is visible.
- History is updated and Balance also updated after adding expenses as per categories.

**What didn't work**

### C06_Category picker – Bug

| Field             | Details                                                                                          |
|-------------------|--------------------------------------------------------------------------------------------------|
| Bug ID            | BUG-1004                                                                                         |
| Title             | Disabled categories remain visible on main screen with previous transaction after disabling                         |
| Status            | New                                                                                              |
| Charter Reference | C06_Category picker                                                                            |
| Operating System  | Android                                                                                          |
| Steps to Reproduce | 1.Add Expense for 'Eating out' 500 EUR from Main Screen. .<br>2.Check the History is updated with 'Eating out' transaction  .<br>3. Disabled 'Eating out'  from Categories  | 
| Expected Result   | After Disabled Category, It should not be displayed on the Main screen. Previous transaction should be hidden on the screen.|
| Actual Result     | After Disabled Category, Category is still present on the screen with previous transaction details.               |
| Impact            | User can not trust App if he is disabling Category that means user wants to remove category from main screen and it should not be present on the main screen. It is impacting usability of an Application. |

### C07_Add Expense – Findings

**Perform below Steps**
- Click '-' button on  Main screen.
- Add "-5 EUR" Expense.
- Check for user is unable to add negative value during transaction. It should be blocked.

**What worked**
- Tried to add Expense "-5 EUR".
- Negative transaction is blocked and unable to perform the further action.

### C08_Category Transaction – Findings

**Perform below Steps**
- Add Expenses on a date 12-02-2026.
- Add Salary on 15-02-26.
- Add other expenses and Details in the week and Feb Month.
- Check balance is updated correctly and visible on the main screen after Switch between daily/weekly/monthly view

**What worked**
- Added Expenses on different Month and week , dates.
- These transactions are visible on main screen after Switch between daily/weekly/monthly view  

### C09_Language and Currency – Findings

**Perform below Steps**
- Select Language "English" and Currency "EUR" from Settings.
- Check the Application is translated according to selected Language and Balance is visible with correct selected currency.
- Select "Deutsch" and Currency "EUR" from Settings.
- Check the Main screen is translated according to selected Language and Balance is visible with correct selected currency.
- Select Language "Italino" and Currency "CAD" from Settings.
- Check the Main screen is translated according to selected Language and Balance is visible with correct selected currency.

**What worked**
- Language "English" and Currency "EUR" from Settings can be selected.
- Language "Deutsch" and Currency "EUR" from Settings can be selected.
- Language Language "Italino" and Currency "CAD" from Settings can be selected.
- Translation is partially available for an Application. Like popup and "Balance" text is not translated according to selected Language for ex "Italino". English and Deutsch translation is present on the Application.
- Currency is selected and visible on the screen.


**What didn't work**

### C09_Language and Currency – Bug

| Field             | Details                                                                                          |
|-------------------|--------------------------------------------------------------------------------------------------|
| Bug ID            | BUG-1005                                                                                         |
| Title             | Popup and "Balance" text translation is not present for other Languages like "Italino".Only English and Deutsch translations are present.                         |
| Status            | New                                                                                              |
| Charter Reference | C09_Language and Currency                                                                             |
| Operating System  | Android                                                                                          |
| Steps to Reproduce | 1.Select language "Italino". <br>2. Check for Balance and Popup text translation<br> |
| Expected Result   | Popup and Balance text should be translated according to selected language.|
| Actual Result     |Popup and Balance text is not translated according to selected language.|                  |
| Impact            |User is unable to understand an Application. Application is not translating content like popup and Balance text in the preferred language.|


## 5. Charter prioritisation with reasons :


| ID                | What I planned to check                                      | Priority | Reason |
|-------------------|-------------------------------------------------------------|----------|--------|
| C01_Add Expense   | Add New expense from main screen by clicking on '-' button, check if balance updates instantly | **High** | Users add expenses every day - if balance doesn't update right away, they stop trusting the app completely. |
| C02_Add Income    | Add new income from main screen by clicking on '+', check if total balance shows correct income | **High**  | Income entries directly affect total balance available - wrong income means wrong financial view on Main screen. |
| C03_History List  | Go to history, edit an expense amount and check if balance updates | **High**     | Editing past entries is common - balance must reflect changes immediately or user data becomes unreliable. |
| C04_History List  | Go to history, delete a transaction, check if it disappears and balance updates | **High**     | Deleting wrong entries happens often - if balance doesn't fix itself, users lose trust in corrections. |
| C05_Transfer Account | Transfer Amount from Cash to Payment card and also reverse transfer, check the Amount updates correctly | **High** | Moving money between accounts is core feature - if transfers break, multi-account tracking fails completely. |
| C06_Category picker | Pick different categories when adding expenses, check if they show correctly in history | **Medium** | Categories help understand spending patterns but users can still track without perfect category display. |
| C07_Add Expense   | Try entering negative amounts (-5 EUR) for expense and check if app blocks it | **Medium**  | Edge case input - most users enter normal amounts, but wrong handling can confuse balance calculations. |
| C08_Category Transaction | Switch between daily/weekly/monthly view, check if Balance match my transactions | **Medium** | Time charts are useful for patterns but main daily balance works fine even if charts have small issues. |
| C09_Language and Currency | Change currency and Language in settings and add expense, check if balance displays correct and translations update according to selected Language | **Low** | Settings changes happen rarely - most users stick to one currency/language during normal use. |


## 6. Defect Prioritization with reasons :

| Bug ID   | Title                                                                 | Priority | Reason |
|----------|-----------------------------------------------------------------------|----------|--------|
| BUG-1001 | Amount for same "Food" category is not summarized in History.            | **High(P1)**   | Core budgeting fails - users cannot see total category spending, main app purpose broken |
| BUG-1002 | |Selected Account payment method is not present in History for added Income.             | **High(P1)**   | Multi-account tracking impossible - cannot tell Cash vs VISA card income in history |
| BUG-1003 | Amount Transfer details from Account Method VISA card or Cash is not updated in History (Three Lines View).             | **High(P1)**   | Cannot track money movement between accounts - breaks fundamental multi-account feature |
| BUG-1004 | Disabled categories remain visible on main screen with previous transaction after disabling   | **Medium(P2)**   | Settings don't work - users see categories they disabled, breaks category management enabled disabled functionality |
| BUG-1005 | Popup and "Balance" text translation is not present for other Languages like "Italino".Only English and Deutsch translations are present.  | **Low(P3)**   | Minor issue - affects only specific languages, core functions work |


## 7. Risks for the application:

**Main Screen shows current balances** :
-Main screen widget displays current Cash/VISA card total Balance. Balance is visible to anyone picking up unlocked phone. There is security risk is present.

**No separate encryption for individual transactions** :
Single database file holds everything - one breach exposes complete financial history, no transaction-level protection.

**Three-line history shows all accounts unprotected** :
Single menu reveals all transactions in History. There is no any option for hide transactions.

**No Guidance or support for Long-term planning using Data** : 
Application does not use Expense or income data to guide user for their expenses and income for long term planning. It just tracks data as per dates or Months. User may get insecure and bored of doing repetitive tasks.

**Single-device dependency risk** :
If a user keeps data only on one device and doesn’t regularly back up to Google Drive, losing or resetting the phone means losing the entire expense history

**Create data Backup- Backup file left unprotected** :
Manual backups save as readable files in device storage - anyone with phone access can open and see all transaction history without app passcode.

**Restore Data- Restore Data directly Accessible** :
There is data integrity risk as no data is secured and anyone can access data from phone.

**Misleading view of financial view** :
If balances and summaries only reflect what the user enters manually and there is no bank connection or automatic validation, users may make decisions based on incomplete or wrong data.



