import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lenght=sc.nextInt();
        int[] arr = new int[lenght];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){

        
            System.out.println(arr[i]);
        }
    }
}
