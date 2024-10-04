import java.util.HashSet;

public class checkdupl {
    public static void check(int a[]){
        HashSet<Integer> set= new HashSet<>();
        boolean isFound=false;
        for(int i=0;i<a.length;i++){
            if(set.contains(a[i])){
System.out.println("Duplicate element found :"+a[i]);
isFound=true;

            }
            set.add(a[i]);

        }
        if(!isFound){
            System.out.println("no duplicate found");
        }
    }
    public static void main(String[] args) {
        int a[] = {20,120,150,1,1,2,3,5,6,55};
        check(a);
        
    }
}
