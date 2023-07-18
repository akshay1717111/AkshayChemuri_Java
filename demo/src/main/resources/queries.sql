CREATE TABLE employees (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(30),
    last_name VARCHAR(30),
    job_start_date DATE,
    salary DOUBLE
);

alter table employees add department varchar(20);

INSERT INTO employees (first_name, last_name, job_start_date, salary, department) VALUES
('Divya', 'J', '2023-01-11', 800000, 'IT'),
('Akshay', 'C', '2022-04-01', 60000, 'Manager'),
('Vineeth', 'I', '2023-01-01', 70000, 'Techinal Developer'),
('Naveen', 'P', '2022-09-20', 58000, 'Full Stack');


SELECT MAX(salary) AS max_salary FROM employees;


SELECT * FROM employees WHERE job_start_date >= DATE_SUB(CURRENT_DATE, INTERVAL 6 MONTH);

SELECT department, COUNT(*) AS department_count FROM employees GROUP BY department;

create table lead_details
 (
 lead_id VARCHAR(20) primary key,
 first_name VARCHAR(30),
 last_name varchar(30),
 email_address VARCHAR(50),
 phone_number VARCHAR(15)
 );

create table consultant_details
 (
 consultant_id VARCHAR(50) primary key,
 lead_id VARCHAR(20),
 first_name VARCHAR(30),
 last_name VARCHAR(30),
 email_address VARCHAR(50),
 phone_number VARCHAR(15),
 Foreign key (lead_id) REFERENCES lead_details(lead_id)
 );



create table submission
(
 submission_id VARCHAR(50) primary key,
 consultant_id VARCHAR(50),
 submission_date DATETIME,
 vendor_company VARCHAR(60),
 vendor_name VARCHAR(80),
 vendor_email_address VARCHAR(50),
 vendor_phone_number VARCHAR(15),
 implementation_partner varchar(60),
 client_name VARCHAR(40),
 pay_rate DOUBLE,
 submission_status VARCHAR(60),
 submission_type VARCHAR(10),
 city VARCHAR(50),
 state VARCHAR(2),
 zip INTEGER,
 FOREIGN KEY (consultant_id) REFERENCES consultant_details(consultant_id)
 );


 create table submission_update
 (
 update_id VARCHAR(20) primary key,
 submission_id VARCHAR(50),
 update_text VARCHAR(50),
 created_date date,
 FOREIGN KEY (submission_id) REFERENCES submission(submission_id)
 );


INSERT INTO lead_details (lead_id, first_name, last_name, email_address, phone_number) VALUES
('001', 'A', 'B', 'j@example.com', '1234567890'),
('002', 'J', 'S', 'j@example.com', '9876543210'),
('003', 'M', 'J', 'm@example.com', '1234567890'),
('004', 'E', 'W', 'e@example.com', '8901234567'),
('005', 'R', 'B', 'r@example.com', '4567890123');



INSERT INTO consultant_details (consultant_id, lead_id, first_name, last_name, email_address, phone_number) VALUES
('001', '001', 'J', 'D', 'john.doe.consultant@example.com', '1234567890'),
('002', '002', 'J', 'S', 'jane.smith.consultant@example.com', '9876543210'),
('003', '003', 'M', 'J', 'michael.johnson.consultant@example.com', '5678901234'),
('004', '004', 'E', 'W', 'emily.williams.consultant@example.com', '8901234567'),
('005', '005', 'E', 'W', 'emily.williams.consultant@example.com', '8901234567');


INSERT INTO submission (submission_id, consultant_id, submission_date, vendor_company, vendor_name, vendor_email_address, vendor_phone_number, implementation_partner, client_name, pay_rate, submission_status, submission_type, city, state, zip) VALUES
('001', '001', '2023-01-15', 'Vendor Company 1', 'Vendor Name 1', 'vendor1@example.com', '1234567890', 'Implementation Partner 1', 'Client Name 1', 5000.00, 'Submitted', 'Type A', 'City 1', 'ST', 12345),
('002', '002', '2022-11-02', 'Vendor Company 2', 'Vendor Name 2', 'vendor2@example.com', '9876543210', 'Implementation Partner 2', 'Client Name 2', 4000.00, 'Submitted', 'Type B', 'City 2', 'ST', 23456),
('003', '003', '2023-02-28', 'Vendor Company 3', 'Vendor Name 3', 'vendor3@example.com', '5678901234', 'Implementation Partner 3', 'Client Name 3', 6000.00, 'Submitted', 'Type C', 'City 3', 'ST', 34567),
('004', '004', '2022-09-20', 'Vendor Company 4', 'Vendor Name 4', 'vendor4@example.com', '8901234567', 'Implementation Partner 4', 'Client Name 4', 5500.00, 'Submitted', 'Type A', 'City 4', 'ST', 45678),
('005', '005', '2023-03-10', 'Vendor Company 5', 'Vendor Name 5', 'vendor5@example.com', '4567890123', 'Implementation Partner 5', 'Client Name 5', 5200.00, 'Submitted', 'Type B', 'City 5', 'ST', 56789);


UPDATE consultant_details SET email_address = 'new_email_address@example.com' WHERE consultant_id = '001';

SELECT consultant_details.consultant_id,consultant_details.first_name AS consultant_first_name, consultant_details.last_name AS consultant_last_name,count(*) AS total_submission
FROM consultant_details JOIN submission ON (consultant_details.consultant_id = submission.consultant_id) GROUP BY consultant_details.consultant_id;

SELECT consultant_details.consultant_id,consultant_details.first_name AS consultant_first_name, consultant_details.last_name AS consultant_last_name,
count(*) AS total_submission,submission.submission_date
FROM consultant_details JOIN submission ON (consultant_details.consultant_id = submission.consultant_id) GROUP BY consultant_details.consultant_id,submission.submission_date;

DELETE FROM submission WHERE pay_rate IS NULL;

SELECT submission.* FROM submission JOIN consultant_details ON (submission.consultant_id=consultant_details.consultant_id)
JOIN lead_details ON (lead_details.lead_id=consultant_details.lead_id)
WHERE ( lead_details.first_name ="A" AND lead_details.last_name="B");

SELECT ld.lead_id,ld.first_name,ld.last_name, COUNT(s.submission_id) AS num_submissions FROM lead_details AS ld
LEFT JOIN consultant_details AS cd ON (ld.lead_id = cd.lead_id)
LEFT JOIN submission AS s ON (cd.consultant_id = s.consultant_id)
GROUP BY ld.lead_id;


