CREATE OR REPLACE PROCEDURE TransferFunds(
    p_from_account_id IN NUMBER,
    p_to_account_id IN NUMBER,
    p_amount IN NUMBER
)
IS
    v_balance NUMBER;
BEGIN
    SELECT balance INTO v_balance
    FROM Accounts
    WHERE account_id = p_from_account_id
    FOR UPDATE;

    IF v_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
    END IF;

    UPDATE Accounts
    SET balance = balance - p_amount
    WHERE account_id = p_from_account_id;

    UPDATE Accounts
    SET balance = balance + p_amount
    WHERE account_id = p_to_account_id;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Funds transferred from account ' || p_from_account_id || ' to ' || p_to_account_id);
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
