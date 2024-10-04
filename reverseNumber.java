import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev*=10+rem;
            n/=10;
        }
        System.out.println("reverse of digit is:"+rev);
    }
}
