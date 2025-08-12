import java.util.Arrays;

public class SortingStrings {
    public static void main(String[] args) {
        String[] names = { "Mahesh", "Ramesh", "Sai", "Kumar", "Ashok" };
        Arrays.sort(names);
       System.out.println("The Sorted Array  in Ascending Order Is :");
       for(String name:names){
        System.out.println(name+" ");
       }
      int len=names.length;
       System.out.println("The Sorted Array in Descending Order is:");
     for(int i=len-1;i>=0;i--){
       
        System.out.println(names[i]);
     }
       }
 }
