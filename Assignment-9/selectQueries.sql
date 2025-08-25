-- 🔍 Fetch all students older than 21.
select * from students_mahesh
where student_age  > 21 ;
--  List student names & DOBs ordered by age (youngest to oldest).
select student_name,student_dob from students_mahesh
order by student_age asc;
-- 🔍 Retrieve the top 2 youngest students from the table.
select student_name,student_dob from students_mahesh
order by student_age asc
limit 2;
