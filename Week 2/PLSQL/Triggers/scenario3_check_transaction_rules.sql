CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
DECLARE
    v_balance NUMBER;
BEGIN
    SELECT balance INTO v_balance FROM Accounts WHERE account_id = :NEW.account_id;

    IF :NEW.transaction_type = 'Withdrawal' AND :NEW.amount > v_balance THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance for withdrawal.');
    ELSIF :NEW.transaction_type = 'Deposit' AND :NEW.amount <= 0 THEN
        RAISE_APPLICATION_ERROR(-20002, 'Deposit amount must be greater than zero.');
    END IF;
END;
