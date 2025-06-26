CREATE OR REPLACE PROCEDURE UpdateSalary(
    p_emp_id IN NUMBER,
    p_percent IN NUMBER
)
IS
    v_salary NUMBER;
BEGIN
    -- Get current salary
    SELECT salary INTO v_salary FROM Employees WHERE emp_id = p_emp_id;

    -- Update salary
    UPDATE Employees
    SET salary = salary + (salary * p_percent / 100)
    WHERE emp_id = p_emp_id;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE(' Salary updated for employee ID ' || p_emp_id);

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Error: Employee ID ' || p_emp_id || ' not found.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;

