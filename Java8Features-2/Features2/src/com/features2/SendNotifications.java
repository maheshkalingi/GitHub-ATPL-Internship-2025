package com.features2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SendNotifications {
	String name;
	boolean Subscription;
	SendNotifications(String Name,Boolean Subscription){
		this.name=Name;
		this.Subscription=Subscription;
	}
	

	public static void main(String[] args) {
		List<SendNotifications> customers=new ArrayList<>();
		customers.add(new SendNotifications("Mahesh",true));
		customers.add(new SendNotifications("deelip",true));
		customers.add(new SendNotifications("Naveen",true));
		customers.add(new SendNotifications("Kumar",false));
		customers.add(new SendNotifications("Santhosh",true));
		customers.add(new SendNotifications("Surya",false));
		Consumer<String> con=s->System.out.println(s);

		customers.stream()
		.filter(s->s.Subscription)
		.forEach(a->con.accept("Thanks for Subscribe! Mr. "+a.name));
		

	}
	
}
