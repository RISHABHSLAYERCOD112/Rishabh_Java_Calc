import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(char c : str.toCharArray()) {
            if(Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
            } else if(Character.isLowerCase(c)) {
                System.out.print(Character.toUpperCase(c));
            } else {
                System.out.print(c);import java.util.*;
class Student{
    String name;
    int age;  
}
    public class kt qudent{
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
            }
        }
        
        sc.close();
    }
}