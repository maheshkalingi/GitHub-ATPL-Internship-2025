package features;

import java.time.LocalDate;
import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the  date of birth year");
		int year=sc.nextInt();
		System.out.println("Enter the month");
		int month=sc.nextInt();
		System.out.println("Enter the date");
		int date=sc.nextInt();
		LocalDate dob= LocalDate.of(year, month, date);
		System.out.println("The Day of The Date of Birth Is:"+dob.getDayOfWeek());
		
	}

}
