CREATE DATABASE smartops_db;
USE smartops_db;

CREATE TABLE employee_requests (
    id INT AUTO_INCREMENT PRIMARY KEY,
    emp_id INT,
    emp_name VARCHAR(50),
    leave_days INT,
    status VARCHAR(40)
);
