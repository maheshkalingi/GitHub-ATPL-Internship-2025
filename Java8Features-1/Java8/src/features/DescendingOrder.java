package features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class DescendingOrder {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		System.out.println("how many numbers you want to add :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enter the number "+i);
		    numbers.add(sc.nextInt());	
		}
		System.out.println(" you entered numbers is : "+numbers);
		Comparator<Integer> comp=(n1,n2)->n2-n1;
		Collections.sort(numbers,comp);
        System.out.println("the descending order is :"+numbers);
	}

}
