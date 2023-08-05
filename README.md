Bank Account Application
The Bank Account Application is a Java program that simulates a simple banking system. It allows users to create checking and savings accounts, perform various banking operations such as deposits, withdrawals, transfers, and calculates compound interest for savings accounts.

How to Use
Bank Account Classes:

The application has three main classes:
Account: An abstract class that serves as the base for both Checking and Savings accounts. It implements the Interest interface to calculate interest rates.
Checking: A class representing checking accounts that extend the Account class.
Savings: A class representing savings accounts that also extend the Account class.
Interest Interface:

The Interest interface contains a default method getBaseRate() that returns a base interest rate of 2.5%.
CSV File Input:

The application reads account information from a CSV file. The file should have the following format:
graphql
Copy code
Name, SSN, Account Type, Initial Deposit
Name: Account holder's name.
SSN: Social Security Number of the account holder.
Account Type: Either "Savings" or "Checking" to specify the type of account.
Initial Deposit: The initial amount to deposit in the account.
Creating Accounts:

When the application starts, it reads the CSV file and creates Checking or Savings accounts based on the provided data.
Checking account numbers start with "2" followed by a unique identifier.
Savings account numbers start with "1" followed by a unique identifier.
Operations:

Once the accounts are created, the user can perform various operations on them, such as:
Deposit: Add funds to the account.
Withdraw: Withdraw funds from the account.
Transfer: Transfer funds from one account to another (only implemented in the base Account class).
Interest Calculation:

The Savings account calculates interest by overriding the setRate() method from the Account class. The interest rate for savings accounts is the base rate (2.5%) minus 0.25%.
The compound() method in the Account class calculates and adds compound interest to the balance.
Account Information:

The showInfo() method in both Checking and Savings classes displays the account holder's information along with specific features of each account type (e.g., debit card details for checking accounts and safety deposit box details for savings accounts).
Running the Application
To run the Bank Account Application:

Ensure you have a valid CSV file with account information in the specified format.
Copy the provided Java code into separate files for each class (Account.java, Checking.java, Savings.java, Interest.java, and BankAccountApp.java).
Save the CSV file path in the file variable within the main() method of the BankAccountApp class.
Compile and run the BankAccountApp class.
Note
This application is a basic simulation and does not include features like proper data validation, authentication, or database storage.




A java Application to handle new customer bank account requests

This Application  -->

Reads a .csv file of names, social security numbers, account type, and intial deposit.It uses a proper data structure to hold all these accounts.It has two types of accounts- savings and checking  which share following properties like deposit(), withdraw(), transfer(), showInfo().

11-Digit Account Number (generated with the followinng process: 1 or 2 depending on Savinngs or Checking, last two digits of SSN, unique 5-digit number, and random 3-digit number).


Savings Account holders are given a Safety Deposit box, identified by a 3-digit number and accessed with a 4 digit code.

Checking Account holders are assigned with a 12-digit number and 4 digit PIN

Both Accounts use an interface that determines the base rate.Savings accounts uses 0.25 less than the base rate.Checkings accounts will use 15% of the base rate.

The showInfo() method reveals relevant account information as well as information apecific to the checking or savings account.
