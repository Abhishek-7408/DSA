import java.util.HashSet;

public class duplictrem {
    public static void main(String[] args) {
        int[] arr = {55,10,25,55,2,2,2,4,6,4,6,8,8,9,10};
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        System.out.println(set.toString());
    }
}
