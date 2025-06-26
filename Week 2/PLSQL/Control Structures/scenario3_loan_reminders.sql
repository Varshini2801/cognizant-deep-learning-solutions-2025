DECLARE
    v_name VARCHAR2(100);
BEGIN
    FOR loan IN (
        SELECT l.LoanID, l.CustomerID, l.DueDate, c.Name
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Dear ' || loan.Name || 
                             ', your loan (ID: ' || loan.LoanID || 
                             ') is due on ' || TO_CHAR(loan.DueDate, 'DD-Mon-YYYY'));
    END LOOP;
END;
