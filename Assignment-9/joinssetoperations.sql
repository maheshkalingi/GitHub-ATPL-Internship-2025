select departments_mahesh.dept_name,students_mahesh.student_name from 
students_mahesh inner join departments_mahesh on students_mahesh.dept_id=departments_mahesh.dept_id;


select departments_mahesh.dept_name,students_mahesh.student_name from 
 departments_mahesh left join students_mahesh  on students_mahesh.dept_id=departments_mahesh.dept_id;
 
select student_name from students_mahesh as s
where student_age>(
  select 	avg(student_age)  from students_mahesh
  group by dept_id 
  having s.dept_id=dept_id
  );
  

