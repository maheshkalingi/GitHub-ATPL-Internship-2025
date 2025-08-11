import java.util.Scanner;

public class Analyze {
    String content;
    Analyze(String Content){
    this.content=Content;
    }
    public void usingCount(){
        String[] Words=content.split(" ");
        int wordCount=Words.length;
        System.out.println("Number of words: " + wordCount);
        
    }
    public void usingOccurence(){
        int firstIndex=content.indexOf('i');
        int lastIndex=content.lastIndexOf('i');
        System.out.println("First occurrence of 'i': " + firstIndex);
        System.out.println("Last occurrence of 'i': " + lastIndex);
    }
     public void usingCheck() {
        boolean startsWithLearn = content.startsWith("Learn");
        boolean endsWithIng = content.endsWith("ing");
        System.out.println("Starts with 'Learn': " + startsWithLearn);
        System.out.println("Ends with 'ing': " + endsWithIng);

}
}
class ana{
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter Something:");
       String Word=sc.nextLine();
       Analyze a=new Analyze(Word);
      a.usingCount();
      a.usingOccurence();
      a.usingCheck();
      sc.close();
    }
    
}

