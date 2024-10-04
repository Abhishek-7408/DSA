import java.util.Scanner;

public class digitCount {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        n=sc.nextInt();
        int count =0;
        while (n!=0) {
            count++;
            n=n/10;
            
        }
        System.out.println("Digit in number are:\n"+count);
    }
}
