CREATE OR REPLACE PROCEDURE TransferFunds (
    p_source_account_id IN NUMBER,
    p_destination_account_id IN NUMBER,
    p_amount IN NUMBER
) AS
    v_source_balance NUMBER;
    v_dest_exists NUMBER;
    insufficient_funds EXCEPTION;
    invalid_amount EXCEPTION;
    account_not_found EXCEPTION;
BEGIN
    -- 1. Check if amount is valid
    IF p_amount <= 0 THEN
        RAISE invalid_amount;
    END IF;

    -- 2. Check if source account exists and retrieve balance
    BEGIN
        SELECT Balance INTO v_source_balance 
        FROM Accounts 
        WHERE AccountID = p_source_account_id;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RAISE account_not_found;
    END;

    -- 3. Check if destination account exists
    SELECT COUNT(*) INTO v_dest_exists 
    FROM Accounts 
    WHERE AccountID = p_destination_account_id;
    
    IF v_dest_exists = 0 THEN
        RAISE account_not_found;
    END IF;

    -- 4. Check for sufficient funds
    IF v_source_balance < p_amount THEN
        RAISE insufficient_funds;
    END IF;

    -- 5. Perform the transfer (deduct from source, add to destination)
    UPDATE Accounts 
    SET Balance = Balance - p_amount 
    WHERE AccountID = p_source_account_id;

    UPDATE Accounts 
    SET Balance = Balance + p_amount 
    WHERE AccountID = p_destination_account_id;

    DBMS_OUTPUT.PUT_LINE('Successfully transferred $' || p_amount || 
                         ' from Account ' || p_source_account_id || 
                         ' to Account ' || p_destination_account_id);
    COMMIT;

EXCEPTION
    WHEN invalid_amount THEN
        ROLLBACK;
        RAISE_APPLICATION_ERROR(-20001, 'Transfer failed: Amount must be greater than zero.');
    WHEN insufficient_funds THEN
        ROLLBACK;
        RAISE_APPLICATION_ERROR(-20002, 'Transfer failed: Account ' || p_source_account_id || ' has insufficient balance ($' || v_source_balance || ').');
    WHEN account_not_found THEN
        ROLLBACK;
        RAISE_APPLICATION_ERROR(-20003, 'Transfer failed: One or both accounts do not exist.');
    WHEN OTHERS THEN
        ROLLBACK;
        RAISE_APPLICATION_ERROR(-20099, 'Transfer failed due to unexpected database error: ' || SQL%ERRM);
END;
/
