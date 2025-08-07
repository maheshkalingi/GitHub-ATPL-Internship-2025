
public class LargestElement{
    public static void main(String[] args){
        int arr[]={10,5,20,8,15};
        int b=arr.length;
       int max=arr[0];
        for(int i=0;i<b;i++){
            if(arr[i]>max){
             max=arr[i];
            }
        }
        System.out.println(max);
        
    }
}