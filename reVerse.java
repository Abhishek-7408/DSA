import java.util.Scanner;

import org.xml.sax.SAXException;

public class reVerse {
    public static int reverse(int n){
        int reversed=0;
        while(n!=0){
            int digit=n%10;
            reversed=reversed*10+digit;
            n/=10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        int reversedNumber = reverse(n);
        System.out.println(reversedNumber);
    }
}
