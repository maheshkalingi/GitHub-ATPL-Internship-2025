package com.features2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

class CheckEmail {
	int id;
	String name;
	String email;
	double Salary;
	public CheckEmail(int ID,String Name,String Email,double salary) {
		this.id=ID;
		this.name=Name;
		this.email=Email;
	    this.Salary=salary;
	}
	public Optional<String> getEmail(){
		return Optional.ofNullable(email);
	}

	public static void main(String[] args) {
		List<CheckEmail> Employees=new ArrayList<>();
		Employees.add(new CheckEmail(10,"Mahesh","mahesh@gmail.com",15000));
		Employees.add(new CheckEmail(20,"Bhargav","Bhargav@gmail.com",20000));
		Employees.add(new CheckEmail(30,"Aditya","Aditya@gmail.com",25000));
		Employees.add(new CheckEmail(40,"Manoj","Manoj@gmail.com",30000));
		Employees.add(new CheckEmail(50,"Mani kanta",null,35000));
		
		Predicate<CheckEmail> cond=emp->emp.Salary>20000;
		Employees.stream()
		         .filter(cond)
		         .forEach(e->{
		        	System.out.println("EMployee Id:"+e.id+"\nEMployee Name: "+e.name+"\nEMployee Email: "+e.getEmail().orElse("Email is not Available")+"\nEmployee Salary :"+e.Salary);
		        	System.out.println();
		         });
		
		
		
	}

}
