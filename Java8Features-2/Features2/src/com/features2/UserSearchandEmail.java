package com.features2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class UserSearchandEmail {
String name;
String email;
 public  UserSearchandEmail(String Name,String Email){
	this.name=Name;
	this.email=Email;
}
	public Optional<String>getEmail(){
		return Optional.ofNullable(email);
		
	}
	
	Function<String,String> toUpper=s->s.toUpperCase();
	
	public static void main(String[] args) {
		List<UserSearchandEmail> list=new ArrayList<>();
		list.add(new UserSearchandEmail("Mahesh","mahesh@gmail.com"));
		list.add(new UserSearchandEmail("Ramesh","ramesh@gmail.com"));
		list.add(new UserSearchandEmail("Suresh","suresh@gmail.com"));
		list.add(new UserSearchandEmail("Satish","satish@gmail.com"));
		list.add(new UserSearchandEmail("Manoj","manoj@gmail.com"));
		list.add(new UserSearchandEmail("Sandeep","sandeep@gmail.com"));
		
		list.stream()
		   .filter(user->user.name equalsIgnoreCase())
		   .
      
	}

}
