-- Test script for Stored Procedures Exercise

SET SERVEROUTPUT ON;

PROMPT ====================================================
PROMPT Initial State of Accounts
PROMPT ====================================================
SELECT * FROM Accounts;

PROMPT ====================================================
PROMPT Scenario 1: Applying Monthly Interest (Savings Accounts)
PROMPT ====================================================
EXEC ProcessMonthlyInterest;
SELECT * FROM Accounts;

PROMPT ====================================================
PROMPT Initial State of Employees
PROMPT ====================================================
SELECT * FROM Employees;

PROMPT ====================================================
PROMPT Scenario 2: Updating Employee Bonus (IT Department, 10% Bonus)
PROMPT ====================================================
EXEC UpdateEmployeeBonus('IT', 10);
SELECT * FROM Employees;

PROMPT ====================================================
PROMPT Scenario 3: Fund Transfer (Valid Case: Transfer $1000 from 201 to 202)
PROMPT ====================================================
EXEC TransferFunds(201, 202, 1000);
SELECT * FROM Accounts;

PROMPT ====================================================
PROMPT Scenario 3: Fund Transfer (Invalid Case: Insufficient Funds)
PROMPT ====================================================
BEGIN
    TransferFunds(202, 201, 50000); -- Should fail as 202 does not have enough balance
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Caught Expected Exception: ' || SQL%ERRM);
END;
/
