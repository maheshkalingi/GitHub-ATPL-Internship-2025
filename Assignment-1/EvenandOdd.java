public class EvenandOdd {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b=a.length;
        int odd=0,even=0;
        for(int i=0;i<b;i++){
         if(a[i]%2==0){
            even+=1;
         }else{
            odd+=1;
         }
        }
        System.out.println("Even count:"+even);
        System.out.println("Odd count:"+odd);
    }
}
