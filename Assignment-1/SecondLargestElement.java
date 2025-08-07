public class SecondLargestElement {
    public static void main(String[] args){
     int arr[]={10,5,20,8,15};
     int b=arr.length;
     for(int i=0;i<b;i++){
        for(int j=i+1;j<=i;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[i]=temp;
            }
        }
     }
     
    }
}
