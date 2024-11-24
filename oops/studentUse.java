import java.util.Scanner;

public class studentUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s1 = new student();
        student s2 = new student();
        
        s1.name = "abhishek";
        s1.setRoll(-123);


        s2.name = "manhisha0";
        s2.setRoll(256);


        System.out.println(s1.name);
        System.out.println(s1.getRollNo());



        System.out.println(s2.name);
        System.out.println(s2.getRollNo());

    }
}
