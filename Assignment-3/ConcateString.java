public class ConcateString {
   String names[];
    ConcateString(String[] Names){
        this.names=Names;
    }
   public void usingplusOperator(){
    String Combined="";
    for(int i=0;i<names.length;i++){
        Combined+=names[i];
    }
     System.out.println("By Using + Operator : "+Combined);
   }
   public void usingBuilder(){
  StringBuilder Combined=new StringBuilder("");
    for(int i=0;i<names.length;i++){
      Combined.append(names[i]);
    }
 System.out.println("By Using StringBuilder: "+Combined);
   }
    public void usingBuffer(){
  StringBuffer Combined=new StringBuffer("");
    for(int i=0;i<names.length;i++){
      Combined.append(names[i]);
    }
 System.out.println("By Using StringBuffer: "+Combined);
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