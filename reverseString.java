import java.util.Scanner;

public class reverseString {
    public static String rev(String str){
        String revStr="";
        for(int i=str.length();i>=0;i--){
revStr+=str.charAt(i);
        }
        return revStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String ans = rev(str);
    }
}
