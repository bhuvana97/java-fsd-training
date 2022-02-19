create database tutorials;
use tutorials;
create table tutorials_tbl(
   tutorial_id INT NOT NULL AUTO_INCREMENT,
   tutorial_title VARCHAR(100) NOT NULL,
   tutorial_author VARCHAR(40) NOT NULL,
   submission_date DATE,
   PRIMARY KEY ( tutorial_id )
);

INSERT INTO tutorials_tbl (tutorial_title, tutorial_author, submission_date)VALUES("Learn PHP", "John", '2022-1-06');
INSERT INTO tutorials_tbl (tutorial_title, tutorial_author, submission_date)VALUES("Learn Java", "Elina", '2022-01-08');
INSERT INTO tutorials_tbl (tutorial_title, tutorial_author, submission_date)VALUES("Learn sql", "cassie", '2022-02-06');
INSERT INTO tutorials_tbl (tutorial_title, tutorial_author, submission_date)VALUES("Learn  flutter", "Sam", '2022-02-10');
INSERT INTO tutorials_tbl (tutorial_title, tutorial_author, submission_date)VALUES("Learn Java", "jacob", '2022-02-12');
select * from tutorials_tbl;
select * from tutorials_tbl where tutorial_author = 'jacob';
update tutorials_tbl  set tutorial_title = 'Learning Spring'  WHERE tutorial_id = 3;
delete from tutorials_tbl where tutorial_id=3;
select * from tutorials_tbl  where tutorial_author LIKE '%ina';
select * from tutorials_tbl ORDER BY tutorial_author ASC;
select * from tutorials_tbl ORDER BY tutorial_author DESC;
drop table tutorials_tbl;
alter table tutorials_tbl drop column tutorial_title;
  
