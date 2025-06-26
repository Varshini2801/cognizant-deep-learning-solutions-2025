CREATE OR REPLACE PROCEDURE AddNewCustomer(
    p_customer_id IN NUMBER,
    p_name IN VARCHAR2,
    p_age IN NUMBER,
    p_balance IN NUMBER
)
IS
BEGIN
    INSERT INTO Customers (CustomerID, Name, Age, Balance, IsVIP)
    VALUES (p_customer_id, p_name, p_age, p_balance, 'FALSE');

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Customer added successfully.');

EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
        DBMS_OUTPUT.PUT_LINE('Error: Customer with ID ' || p_customer_id || ' already exists.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;

