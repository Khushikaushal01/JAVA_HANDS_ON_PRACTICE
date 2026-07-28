-- Create Customers table
CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    DOB DATE,
    Balance NUMBER(15, 2),
    IsVIP VARCHAR2(10) DEFAULT 'FALSE'
);

-- Create Loans table
CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    LoanAmount NUMBER(15, 2),
    InterestRate NUMBER(5, 2),
    StartDate DATE,
    EndDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

-- Insert Sample Data for Customers
INSERT INTO Customers (CustomerID, Name, DOB, Balance, IsVIP) VALUES (1, 'Alice Smith', TO_DATE('1955-05-12', 'YYYY-MM-DD'), 12000.00, 'FALSE');
INSERT INTO Customers (CustomerID, Name, DOB, Balance, IsVIP) VALUES (2, 'Bob Jones', TO_DATE('1980-11-23', 'YYYY-MM-DD'), 4500.00, 'FALSE');
INSERT INTO Customers (CustomerID, Name, DOB, Balance, IsVIP) VALUES (3, 'Charlie Brown', TO_DATE('1960-03-15', 'YYYY-MM-DD'), 15000.00, 'FALSE');
INSERT INTO Customers (CustomerID, Name, DOB, Balance, IsVIP) VALUES (4, 'Diana Prince', TO_DATE('1995-07-04', 'YYYY-MM-DD'), 8500.00, 'FALSE');

-- Insert Sample Data for Loans
INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate) VALUES (101, 1, 50000.00, 7.50, TO_DATE('2024-01-01', 'YYYY-MM-DD'), TO_DATE('2029-01-01', 'YYYY-MM-DD'));
INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate) VALUES (102, 2, 20000.00, 8.00, TO_DATE('2023-05-15', 'YYYY-MM-DD'), TO_DATE('2026-08-15', 'YYYY-MM-DD')); -- Due in ~18 days
INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate) VALUES (103, 3, 100000.00, 6.50, TO_DATE('2022-10-10', 'YYYY-MM-DD'), TO_DATE('2027-10-10', 'YYYY-MM-DD'));
INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate) VALUES (104, 4, 15000.00, 9.00, TO_DATE('2025-06-01', 'YYYY-MM-DD'), TO_DATE('2026-08-25', 'YYYY-MM-DD')); -- Due in ~28 days

COMMIT;
