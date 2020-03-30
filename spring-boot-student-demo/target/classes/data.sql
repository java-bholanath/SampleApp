DROP TABLE IF EXISTS TBL_STUDENT;
 
CREATE TABLE TBL_STUDENT (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL
);

INSERT INTO 
	TBL_STUDENT (first_name, last_name, email) 
VALUES
  	('Lokesh', 'Gupta', 'abc@gmail.com'),
  	('John', 'Doe', 'xyz@email.com');