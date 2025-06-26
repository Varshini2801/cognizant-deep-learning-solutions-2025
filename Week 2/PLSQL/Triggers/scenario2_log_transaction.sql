CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
    INSERT INTO AuditLog (
        log_id,
        transaction_id,
        action,
        log_time
    ) VALUES (
        audit_seq.NEXTVAL,
        :NEW.transaction_id,
        'INSERT',
        SYSDATE
    );
END;
