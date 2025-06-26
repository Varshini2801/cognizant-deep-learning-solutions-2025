DECLARE
    CURSOR transaction_cursor IS
        SELECT customer_id, transaction_id, transaction_type, amount, transaction_date
        FROM Transactions
        WHERE TO_CHAR(transaction_date, 'MMYYYY') = TO_CHAR(SYSDATE, 'MMYYYY')
        ORDER BY customer_id;

    v_customer_id       Transactions.customer_id%TYPE;
    v_transaction_id    Transactions.transaction_id%TYPE;
    v_transaction_type  Transactions.transaction_type%TYPE;
    v_amount            Transactions.amount%TYPE;
    v_date              Transactions.transaction_date%TYPE;
BEGIN
    OPEN transaction_cursor;
    LOOP
        FETCH transaction_cursor INTO v_customer_id, v_transaction_id, v_transaction_type, v_amount, v_date;
        EXIT WHEN transaction_cursor%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE('Customer ID: ' || v_customer_id ||
                             ', Transaction ID: ' || v_transaction_id ||
                             ', Type: ' || v_transaction_type ||
                             ', Amount: ' || v_amount ||
                             ', Date: ' || TO_CHAR(v_date, 'DD-MON-YYYY'));
    END LOOP;
    CLOSE transaction_cursor;
END;
