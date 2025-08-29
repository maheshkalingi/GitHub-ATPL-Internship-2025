package features;

import java.time.LocalDate;

public class AddingDeleting {

	public static void main(String[] args) {
		LocalDate currentDate=LocalDate.now();
		System.out.println("Current date is : "+currentDate);
		LocalDate afteradding = currentDate.plusDays(10);
		System.out.println("After adding of 10 days : "+afteradding);
		LocalDate newDate=afteradding.minusMonths(2);
	System.out.println("The new Date after deleting 2 months: "+newDate);
	}

}
