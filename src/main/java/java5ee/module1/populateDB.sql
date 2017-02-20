INSERT INTO companies (company_name) VALUES 
('Luxoft'), 
('MTS');

INSERT INTO customers (first_name, last_name, email) VALUES 
('Ivan', 'Ivanov', 'ivanov@mail.ru'), 
('Petr', 'Petrov', 'petrov@gmail.com');

INSERT INTO developers (first_name, last_name, email, project_id) VALUES 
('Slava', 'Chervoniy', 'cherv@mail.ru', 1),
('Grisha', 'Hlebnik', 'hleb@gmail.com', 2),
('Dasha', 'Beketova', 'bek@ngs.ru', 3),
('Sergey', 'Ovchinnikov', 'ovhin@yahoo.ru', 4),
('Ruslan', 'Baybekov', 'baybekov@ya.ru', 5),
('Elena', 'Levchenko', 'lev@mail.ru', 5),
('Sergey', 'Shubin', 'shuba@ya.ru', 4),
('Alex', 'Kotov', 'kot@gmail.com', 3),
('Alena', 'Bal', 'bal@ngs.ru', 2),
('Ruslan', 'Umerkaev', 'um@mal.ru', 1);

INSERT INTO developers_skills (developer_id, skill_id) VALUES 
(1, 1),
(1, 2),
(2, 2),
(2, 3),
(3, 3),
(3, 4),
(4, 4),
(4, 5),
(5, 5),
(5, 1),
(6, 1),
(6, 2),
(7, 2),
(7, 1),
(8, 1),
(8, 2),
(9, 3),
(9, 4),
(10, 5),
(10, 1);

INSERT INTO projects (project_name, company_id, customer_id) VALUES 
('RFC 231456', 1, 1),
('Main SIRIUS menu', 2, 2),
('Patch to PFR functional', 1, 1),
('SAMO', 2, 2),
('China Union Pay', 2, 2),
('RFC 231456', 1, 1),
('Main SIRIUS menu', 2, 2),
('Patch to PFR functional', 1, 1),
('SAMO', 2, 2),
('China Union Pay', 2, 2);

INSERT INTO skills (skill) VALUES 
('C++'),
('Java'),
('Web Technologies'),
('Linux'),
('DB');
