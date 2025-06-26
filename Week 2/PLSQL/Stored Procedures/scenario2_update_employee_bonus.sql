CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_department_id IN NUMBER,
    p_bonus_percent IN NUMBER
)
IS
BEGIN
    UPDATE Employees
    SET salary = salary + (salary * p_bonus_percent / 100)
    WHERE department_id = p_department_id;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Bonus applied to employees in department ' || p_department_id);
END;
/
