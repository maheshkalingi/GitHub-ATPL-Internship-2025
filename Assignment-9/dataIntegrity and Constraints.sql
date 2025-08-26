select * from departments_mahesh;
select * from students_mahesh;
SELECT * FROM courses_mahesh;
alter table courses_mahesh
add course_code varchar(20);

alter table courses_mahesh add constraint unique(course_code);
alter table courses_mahesh add credits int check(credits between 1 and 5);

UPDATE courses_mahesh SET course_code='CS101', credits=4 WHERE course_id=4;
UPDATE courses_mahesh SET course_code='MATH205', credits=3 WHERE course_id=5;
