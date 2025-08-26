
create view student_department as select s.student_name, d.dept_name from students_mahesh s join departments_mahesh d on s.dept_id = d.dept_id;

select * from student_department;

update student_department set student_name = "mahesh" where student_name = "Ravi";