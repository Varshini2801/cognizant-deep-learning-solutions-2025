DECLARE
    CURSOR loan_cursor IS
        SELECT loan_id, interest_rate FROM Loans;

    v_loan_id       Loans.loan_id%TYPE;
    v_interest_rate Loans.interest_rate%TYPE;
BEGIN
    OPEN loan_cursor;
    LOOP
        FETCH loan_cursor INTO v_loan_id, v_interest_rate;
        EXIT WHEN loan_cursor%NOTFOUND;

        -- Sample policy: increase rate by 0.5% if current rate < 10%
        IF v_interest_rate < 10 THEN
            UPDATE Loans
            SET interest_rate = interest_rate + 0.5
            WHERE loan_id = v_loan_id;

            DBMS_OUTPUT.PUT_LINE('Interest rate updated for Loan ID: ' || v_loan_id);
        END IF;
    END LOOP;
    CLOSE loan_cursor;

    COMMIT;
END;
