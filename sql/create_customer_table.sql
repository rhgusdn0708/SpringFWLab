CREATE TABLE customer(
    id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(30) UNIQUE,
    name VARCHAR(30),
    age INT(10),
    entry_date DATE DEFAULT CURRENT_TIMESTAMP
);

