create table departments_mahesh (
 	dept_id varchar(10) primary key, 
	dept_name varchar(50)
);

create table courses_mahesh (
	course_id varchar(10), 
	course_name varchar(50), 
 	dept_id varchar(10) primary key
);

create table students_mahesh (
 	student_id varchar(10) primary key, 
 	student_name varchar(50), 
 	dob date, 
	age int, 
  	dept_id varchar(10)
);

insert into departments_mahesh values ('D1', "Computer Science");
insert into departments_mahesh values ('D2', "Mathematics");
insert into departments_mahesh values ('D3', "Physics");

select * from departments_mahesh;

insert into courses_mahesh values ('C1', "DBMS", 'D1');
insert into courses_mahesh values ('C2', "Linear Algebra", 'D2');
insert into courses_mahesh values ('C3', "Quantum Mechanics", 'D3');

select * from courses_mahesh;

insert into students_mahesh values ('S1', "Ravi", '2002-06-10', 22, 'D1');
insert into students_mahesh values ('S2', "Sneha", '2001-03-15', 23, 'D2');
insert into students_mahesh values ('S3', "Arjun", '2003-01-20', 21, 'D1');

select * from students_mahesh;
alter table courses_mahesh add column duration_in_weeks int;
update students_mahesh set student_name = 'Snaha Reddy' where student_id = 'S2';
delete from courses_mahesh where course_id = 'C3';