-- Create Accounts table
CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    AccountType VARCHAR2(20),
    Balance NUMBER(15, 2)
);

-- Create Employees table
CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Department VARCHAR2(50),
    Salary NUMBER(15, 2)
);

-- Insert Sample Data for Accounts
INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance) VALUES (201, 1, 'Savings', 5000.00);
INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance) VALUES (202, 1, 'Checking', 1500.00);
INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance) VALUES (203, 2, 'Savings', 10000.00);
INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance) VALUES (204, 3, 'Savings', 25000.00);
INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance) VALUES (205, 3, 'Checking', 3000.00);

-- Insert Sample Data for Employees
INSERT INTO Employees (EmployeeID, Name, Department, Salary) VALUES (1, 'John Doe', 'IT', 60000.00);
INSERT INTO Employees (EmployeeID, Name, Department, Salary) VALUES (2, 'Jane Smith', 'HR', 55000.00);
INSERT INTO Employees (EmployeeID, Name, Department, Salary) VALUES (3, 'Bob Johnson', 'IT', 65000.00);
INSERT INTO Employees (EmployeeID, Name, Department, Salary) VALUES (4, 'Alice Davis', 'Finance', 70000.00);

COMMIT;
