package features;


 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Square {

		public static void main(String[] args) {
			List<Integer> numbers=new ArrayList<>();
			List<Integer> squNum=new ArrayList<>();
			Scanner sc= new Scanner(System.in);
			System.out.println("how many numbers you want to add :");
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				System.out.println("enter the number "+i);
			    numbers.add(sc.nextInt());	
			}
			System.out.println(" you entered numbers is : "+numbers);
			numbers.forEach(num->{
				int squ=num*num;
				squNum.add(squ);
				
			});
			System.out.println("The Even Numbers In the Given Array Is :"+squNum);
	}

}
