DROP TABLE IF EXISTS questionnaire;

CREATE TABLE questionnaire (
  id INT PRIMARY KEY,
  title VARCHAR(250) NOT NULL,
  des VARCHAR(250) NOT NULL
);

INSERT INTO questionnaire (id, title, des) VALUES
  (1, 'Computer Cable', 'This is the computer cable for Mac'),
  (2, 'USB', 'A USB sticker only for FHNW students'),
  (3, 'Intel', 'An Intel Core i5 chip');