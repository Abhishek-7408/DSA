import java.util.HashSet;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,6,5,4,6,8,9,9};
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        System.out.println(set.toString());
    }
}
