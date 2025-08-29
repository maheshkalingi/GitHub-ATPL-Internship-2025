package com.features2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
public Math
 public class DiscountPrice {
    
	 String  name;
	  Double Price;
	  public DiscountPrice(String Name,Double price){
		 this.name=Name;
		 this.Price=price;
	 }
	 public Optional<Double> getPrice(){
		 return Optional.ofNullable(Price);
	 }
	  Function<Double,Double> Discount(){
		 return p->p-(0.10*p) ;
	 }
	 public  double discountedFinalPrice() {
		 if(Price!=null) {
			 return Discount().apply(Price);
		 }
		 return 0.0;
	 }
	 
	public static void main(String[] args) {
		List<DiscountPrice> dis=new ArrayList<>();
		dis.add(new DiscountPrice("mahesh",1000.0));
		dis.add(new DiscountPrice("Ramesh", 2000.0));
		dis.add(new DiscountPrice("Suresh",3000.0));
		dis.add(new DiscountPrice("Satish",4000.0));
		dis.add(new DiscountPrice("Sai",5000.0) );
		dis.add(new DiscountPrice("Ramana",null));
		
		dis.forEach(per->{
			System.out.println("The Name of the Customer is: "+per.name+"\nThe original price is "+per.Price+" After Discount of 10% is: "+per.discountedFinalPrice());
		});
		

	}

}

