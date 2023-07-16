# Bank-Account-Application
A java Application to handle new customer bank account requests

This Application  -->

Reads a .csv file of names, social security numbers, account type, and intial deposit.It uses a proper data structure to hold all these accounts.It has two types of accounts- savings and checking  which share following properties like deposit(), withdraw(), transfer(), showInfo().

11-Digit Account Number (generated with the followinng process: 1 or 2 depending on Savinngs or Checking, last two digits of SSN, unique 5-digit number, and random 3-digit number).


Savings Account holders are given a Safety Deposit box, identified by a 3-digit number and accessed with a 4 digit code.

Checking Account holders are assigned with a 12-digit number and 4 digit PIN

Both Accounts use an interface that determines the base rate.Savings accounts uses 0.25 less than the base rate.Checkings accounts will use 15% of the base rate.

The showInfo() method reveals relevant account information as well as information apecific to the checking or savings account.
