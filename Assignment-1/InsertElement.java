public class InsertElement {
    public static void main(String[] args){
        int arr[]={10,20,30,40};
        int ele=25;
        int pos=2;
        int arr2[]=new int[5];
        for(int i=0;i<pos;i++){
            arr2[i]=arr[i];
        }
        arr2[pos]=ele;
        for(int i=pos;i<arr.length;i++){
            arr2[i+1]=arr[i];
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
