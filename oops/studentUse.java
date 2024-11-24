import java.util.Scanner;

public class studentUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s1 = new student("Abhishek",123);
        student s2 = new student("manisha",789);
        
        // s1.name = "abhishek";
        
s1.print();
s2.print();


        // System.out.println(s1.name);
        // System.out.println(s1.getRollNo());



        // System.out.println(s2.name);
        // System.out.println(s2.getRollNo());

    }
}
