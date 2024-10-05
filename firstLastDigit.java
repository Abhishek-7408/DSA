import java.util.Scanner;

public class firstLastDigit{
    public static int getFirstDigit(int n){
        while(n>=10){
            n/=10;
        }
        return n;
    }
    public static int getLastDigit(int n){
        return n%10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        int firstDigit=getFirstDigit(n);
        int lastDigit=getLastDigit(n);
        System.out.println(firstDigit);
        System.out.println(lastDigit);

    }
}