import java.util.Scanner;

public class studentUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s1 = new student();
        student s2 = new student();
        
        s1.name = "abhishek";
        s1.rollNumber = 2409;

        System.out.println(s1.name);
        System.out.println(s1.rollNumber);

    }
}
