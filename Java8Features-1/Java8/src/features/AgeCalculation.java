package features;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculation {
		public static void  CalculateAge(LocalDate birthdate,LocalDate currentdate) {
			if((birthdate!=null) && (currentdate!=null)){
			System.out.println(Period.between(birthdate,currentdate).getYears());
			System.out.println(Period.between(birthdate,currentdate).getMonths());
			System.out.println(Period.between(birthdate,currentdate).getDays());
			}
		}
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the  date of birth year");
			int year=sc.nextInt();
			System.out.println("Enter the month");
			int month=sc.nextInt();
			System.out.println("Enter the date");
			int date=sc.nextInt();
			LocalDate dob=LocalDate.of(year, month, date);
			CalculateAge(dob,LocalDate.now());
		
			sc.close();
			
		}

}
