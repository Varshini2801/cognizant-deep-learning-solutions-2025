DECLARE
    CURSOR account_cursor IS
        SELECT account_id, balance FROM Accounts;

    v_account_id Accounts.account_id%TYPE;
    v_balance    Accounts.balance%TYPE;
    annual_fee   CONSTANT NUMBER := 200;
BEGIN
    OPEN account_cursor;
    LOOP
        FETCH account_cursor INTO v_account_id, v_balance;
        EXIT WHEN account_cursor%NOTFOUND;

        UPDATE Accounts
        SET balance = balance - annual_fee
        WHERE account_id = v_account_id;

        DBMS_OUTPUT.PUT_LINE('Annual fee deducted from Account ID: ' || v_account_id);
    END LOOP;
    CLOSE account_cursor;

    COMMIT;
END;
