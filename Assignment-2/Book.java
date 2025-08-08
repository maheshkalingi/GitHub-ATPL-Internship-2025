public class Book{
    String title;
    String author;
    double price;
   Book(String Title,String Author,double Price){
    this.title=Title;
    this.author=Author;
    this.price=Price;
   }
   public void applyDiscounts(double discountPercentage ){
    if(discountPercentage >0 && discountPercentage < 100){
        discountPercentage=price *(discountPercentage/100);
        price-=discountPercentage;
    }
    else{
        System.out.println("Invalid Discount");
    }

   }
   public void displayDetails(){
    System.out.println("TITLE : "+title);
    System.out.println("AUTHOR : "+author);
    System.out.println("FINAL PRICE : "+price);
   }


}
class One{
    public static void main(String[] args){
        Book b1=new Book("Java","James Gosling",579);
         b1.applyDiscounts(20);
         b1.displayDetails();
         System.out.println();
         Book b2=new Book("Spring Boot","Rod Johnson",1000);
         b2.applyDiscounts(30);
         b2.displayDetails();
          System.out.println();
         Book b3=new Book("Angular","Misco Hevery",2000);
         b3.applyDiscounts(40);
         b3.displayDetails();
        }
}
