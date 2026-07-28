-- Test script for Control Structures Exercise

SET SERVEROUTPUT ON;

PROMPT ====================================================
PROMPT Initial State of Customers and Loans
PROMPT ====================================================
SELECT * FROM Customers;
SELECT * FROM Loans;

PROMPT ====================================================
PROMPT Scenario 1: Applying 1% discount to Senior Citizens
PROMPT ====================================================
@Scenario1.sql
SELECT * FROM Loans;

PROMPT ====================================================
PROMPT Scenario 2: Promoting Customers to VIP based on balance
PROMPT ====================================================
@Scenario2.sql
SELECT * FROM Customers;

PROMPT ====================================================
PROMPT Scenario 3: Loan Due Reminders (Due in next 30 days)
PROMPT ====================================================
@Scenario3.sql
