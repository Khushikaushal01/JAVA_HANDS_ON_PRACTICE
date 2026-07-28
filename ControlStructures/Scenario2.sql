-- Scenario 2: Promote customers to VIP status (IsVIP = 'TRUE') if balance is over $10,000.
DECLARE
    CURSOR c_customers IS
        SELECT CustomerID, Name, Balance 
        FROM Customers;
BEGIN
    FOR r_cust IN c_customers LOOP
        IF r_cust.Balance > 10000 THEN
            UPDATE Customers 
            SET IsVIP = 'TRUE' 
            WHERE CustomerID = r_cust.CustomerID;
            
            DBMS_OUTPUT.PUT_LINE('Customer ' || r_cust.Name || ' promoted to VIP. New Balance: $' || r_cust.Balance);
        END IF;
    END LOOP;
    COMMIT;
END;
/
