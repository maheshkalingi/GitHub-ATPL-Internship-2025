-- 📊 Show student count per department.
select dept_id,student_name,count(*) as students from students_mahesh
group by  dept_id;
-- 📊 Display average age of students in each department.
select dept_id,avg(student_age) as average from students_mahesh
group by dept_id;

-- 📊 Show the maximum and minimum student ages.
select max(student_age) as maximumAge ,min(student_age) as MinimumAge
from students_mahesh;

