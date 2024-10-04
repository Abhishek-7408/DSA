public class checkDplcateInarr {
    public static void check(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println("Duplicate element present in array:"+a[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a={10,20,30,40,20,50,1,2,3};
        check(a);
        
    }
}
