public class Frequency {
    public static void main(String[] args) {
        int[] arr={10,20,20,10,30,10};
        int n=arr.length;
        boolean[] counted=new boolean[n];
        for(int i=0;i<n;i++){
            if(counted[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count+=1;
                    counted[j]=true;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
        }
          
        
    }
}
