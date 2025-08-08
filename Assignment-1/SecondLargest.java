public class SecondLargest{
    public static void main(String[] args){
        int[] arr={10,5,20,8,15};
        int b=arr.length;
        int temp;
        for(int i=0;i<b;i++){
            for(int j=i+1;j<b;j++){
                
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("the second largest number:"+arr[b-2]);
    }
}