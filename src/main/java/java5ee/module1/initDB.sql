CREATE TABLE IF NOT EXISTS customers (
id  INT  NOT NULL AUTO_INCREMENT PRIMARY KEY,
first_name  VARCHAR(50)  NOT NULL,
last_name  VARCHAR(200)  NOT NULL,
email  VARCHAR(200)  NOT NULL
);

ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS developers (
id  INT  NOT NULL AUTO_INCREMENT PRIMARY KEY,
first_name  VARCHAR(50)  NOT NULL,
last_name  VARCHAR(200)  NOT NULL,
email  VARCHAR(200)  NOT NULL
);

ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS companies (
id  INT  NOT NULL AUTO_INCREMENT PRIMARY KEY,
company VARCHAR(200)  NOT NULL,
developer_id  INT,
customer_id  INT
);

ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS projects (
id  INT  NOT NULL AUTO_INCREMENT PRIMARY KEY,
project  VARCHAR(200)  NOT NULL,
company VARCHAR(200)  NOT NULL,
developer_id  INT,
customer_id  INT
);

ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS skills (
id  INT  NOT NULL AUTO_INCREMENT PRIMARY KEY,
skill VARCHAR(200)  NOT NULL,
developer_id  INT
);

ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS references (
customer_id INT NOT NULL,
developer_id INT NOT NULL,

FOREIGN KEY (customer_id) REFERENCES customers (id),
FOREIGN KEY (developer_id) REFERENCES developers (id),

UNIQUE (customer_id, developer_id)
);

ENGINE = InnoDB;