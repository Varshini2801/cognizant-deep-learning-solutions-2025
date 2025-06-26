CREATE OR REPLACE PROCEDURE SafeTransferFunds(
    p_from_account_id IN NUMBER,
    p_to_account_id IN NUMBER,
    p_amount IN NUMBER
)
IS
    insufficient_funds EXCEPTION;
    v_balance NUMBER;
BEGIN
    -- Get balance of sender
    SELECT balance INTO v_balance FROM Accounts WHERE account_id = p_from_account_id;

    IF v_balance < p_amount THEN
        RAISE insufficient_funds;
    END IF;

    -- Deduct from sender
    UPDATE Accounts SET balance = balance - p_amount WHERE account_id = p_from_account_id;

    -- Add to receiver
    UPDATE Accounts SET balance = balance + p_amount WHERE account_id = p_to_account_id;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Funds transferred successfully.');

EXCEPTION
    WHEN insufficient_funds THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: Insufficient funds in account ' || p_from_account_id);
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;

