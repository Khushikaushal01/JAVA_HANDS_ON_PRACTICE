-- Scenario 3: Send reminders to customers whose loans are due within the next 30 days.
DECLARE
    CURSOR c_due_loans IS
        SELECT c.Name, l.LoanID, l.EndDate
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
    DBMS_OUTPUT.PUT_LINE('=== Loan Repayment Reminders ===');
    FOR r_loan IN c_due_loans LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Customer ' || r_loan.Name || 
                             ' (Loan ID: ' || r_loan.LoanID || 
                             ') - Your loan is due on ' || TO_CHAR(r_loan.EndDate, 'YYYY-MM-DD') || 
                             '. Please arrange for repayment.');
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('================================');
END;
/
