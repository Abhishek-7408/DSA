import java.util.Scanner;

public class conUpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
if(ch>32){
    ch=ch-32;
}
else{
   ch= ch+32;
}
System.out.println(ch);

        }
    }
}
