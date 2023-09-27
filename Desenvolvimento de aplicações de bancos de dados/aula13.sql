CREATE OR REPLACE PROCEDURE calculo(
    n IN INT,
    m OUT INT,
    p IN OUT INT
)
AS
    y INT;
BEGIN
    y := 100;
    DECLARE
        y INT DEFAULT 10;
    BEGIN
        m := p + n + y;
    END;
    p := 10;
END

DECLARE
    a INT := 15;
    b INT := 25;
    c INT := 30;
BEGIN
    calculo(a,b,c);
END
