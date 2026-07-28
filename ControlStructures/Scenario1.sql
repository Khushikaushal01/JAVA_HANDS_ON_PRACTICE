-- Scenario 1: Apply 1% discount to loan interest rates for customers over 60 years old.
DECLARE
    CURSOR c_customers IS
        SELECT CustomerID, Name, DOB 
        FROM Customers;
        
    v_age NUMBER;
BEGIN
    FOR r_cust IN c_customers LOOP
        -- Calculate age in years
        v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, r_cust.DOB) / 12);
        
        IF v_age > 60 THEN
            -- Apply 1% discount
            UPDATE Loans 
            SET InterestRate = InterestRate - 1 
            WHERE CustomerID = r_cust.CustomerID;
            
            IF SQL%FOUND THEN
                DBMS_OUTPUT.PUT_LINE('Applied 1% interest rate discount for senior citizen Customer: ' || r_cust.Name || ' (Age: ' || v_age || ')');
            ELSE
                DBMS_OUTPUT.PUT_LINE('Customer ' || r_cust.Name || ' is over 60 (Age: ' || v_age || ') but has no active loans.');
            END IF;
        END IF;
    END LOOP;
    COMMIT;
END;
/
