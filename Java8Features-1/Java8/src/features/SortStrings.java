package features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortStrings {
public static void main(String[] args) {
	List<String> Fruits=new ArrayList<>();
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number of Strings You want to enter:");
	int n= sc.nextInt();
	for(int i=0;i<n;i++) {
		System.out.println("enter the fruit name:"+(i+1));
		Fruits.add(sc.next());
	}
	System.out.println("You Entered Fruits:"+Fruits);
	Collections.sort(Fruits);
	System.out.print("The Alphabetical Order is : "+Fruits);
	System.out.println();
	Collections.sort(Fruits,(a,b)->b.compareTo(a));
	System.out.println("The Reverse Alphabetical order is: "+Fruits);
}
}