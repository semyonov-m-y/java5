CREATE TABLE IF NOT EXISTS customers (
id  INT  NOT NULL AUTO_INCREMENT PRIMARY KEY,
first_name  VARCHAR(50)  NOT NULL,
last_name  VARCHAR(200)  NOT NULL,
email  VARCHAR(200)  NOT NULL
);

CREATE TABLE IF NOT EXISTS developers (
id  INT  NOT NULL AUTO_INCREMENT PRIMARY KEY,
first_name  VARCHAR(50)  NOT NULL,
last_name  VARCHAR(200)  NOT NULL,
email  VARCHAR(200)  NOT NULL,
project_id  INT,
FOREIGN KEY (project_id) REFERENCES projects (id)
);

CREATE TABLE IF NOT EXISTS companies (
id  INT  NOT NULL AUTO_INCREMENT PRIMARY KEY,
company_name VARCHAR(200)  NOT NULL
);

CREATE TABLE IF NOT EXISTS projects (
id  INT  NOT NULL AUTO_INCREMENT PRIMARY KEY,
project_name  VARCHAR(200)  NOT NULL,
company_id INT  NOT NULL,
customer_id  INT NOT NULL,
FOREIGN KEY (customer_id) REFERENCES customers (id),
FOREIGN KEY (company_id) REFERENCES companies(id)
);

CREATE TABLE IF NOT EXISTS skills (
id  INT  NOT NULL AUTO_INCREMENT PRIMARY KEY,
skill VARCHAR(200)  NOT NULL
);

CREATE TABLE IF NOT EXISTS developers_skills (
developer_id INT  NOT NULL,
skill_id  INT NOT NULL,
FOREIGN KEY (developer_id) REFERENCES developers (id),
FOREIGN KEY (skill_id) REFERENCES skills (id)
);
