import java.util.Scanner;

public class checkPrime{
    public static boolean isPrime(int n){
        if (n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        if(isPrime(n)){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" Not a prime number");
        }
    }
}