

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {10,20,2,5,9,1,3,5,44,22};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int a:arr){
        System.out.println(arr[a]);

        }
    }
    
}
