public class ConcateString {
   String names[];
    ConcateString(String[] Names){
        this.names=Names;
    }
   public void usingplusOperator(){
    long startTime = System.nanoTime();
    String Combined="";
    for(int i=0;i<names.length;i++){
        Combined+=names[i];
    }
     long endTime = System.nanoTime();
      long Time = endTime - startTime; 
     System.out.println("By Using + Operator : "+Combined );
     System.out.println("Executed time in nanoseconds: " + Time);
   }
   public void usingBuilder(){
    long startTime = System.nanoTime();
  StringBuilder Combined=new StringBuilder("");
    for(int i=0;i<names.length;i++){
      Combined.append(names[i]);
    }
     long endTime = System.nanoTime();
      long Time = endTime - startTime; 
 System.out.println("By Using StringBuilder: "+Combined);
  System.out.println("Executed time in nanoseconds: " + Time);
   }
    public void usingBuffer(){
      long startTime = System.nanoTime();
  StringBuffer Combined=new StringBuffer("");
    for(int i=0;i<names.length;i++){
      Combined.append(names[i]);
    }
     long endTime = System.nanoTime();
      long Time = endTime - startTime; 
 System.out.println("By Using StringBuffer: "+Combined);
  System.out.println("Executed time in nanoseconds: " + Time);
   }
}
class concat{
    public static void main(String[] args){
        String[] mah={"Mahesh","Aditya","Shyam"};
        ConcateString cs= new ConcateString(mah);
        cs.usingplusOperator();
        cs.usingBuilder();
        cs.usingBuffer();
    }
}