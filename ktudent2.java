import java.util.*;
class Student{
    String name;
    int age;  
}
    public class ktudent2{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Student s = new Student();
            s.name = sc.nextLine();
            s.age = sc.nextInt();   
            System.out.println(s.name);
            System.out.println(s.age);
            sc.close();
    }
}
