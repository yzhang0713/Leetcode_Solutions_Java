import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student student1 = new Student();
        student1.setAge(10);
        Student student2 = new Student("James", 25, "Male");

        Student.setAge(10);

        Student student3 = new Student();
//        student.name = "James";
//        student.setAge(25);
        System.out.println(student2.name);
        System.out.println(student2.getAge());

//        Test test = new Test();
//        System.out.println(test.gcd(125, 35));

//        System.out.println(Test.gcd(125, 35));
//
//        int a = 1;
//
//        String b = 1; // Compile time exception
//        System.out.println(b.length());
        String s = null;
        System.out.println(s);
//        s.length(); // Run time exception
        String s1 = "a";
        String s2 = "A";
        System.out.println(s1.compareTo(s2));
        s1.equals(s2);
        s1.equalsIgnoreCase(s2);
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s3.equals(s4));
        String s5 = "abc\"";
        char i = s5.charAt(0);
        System.out.println(i);

        int intArray[] = {1, 2, 3, 4, 5}; // Static array
        List<Integer> intList = new ArrayList<>();
        List<Integer> intList3 = new LinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(15);
        List<Float> floatList = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        ArrayList<Integer> intList2 = new ArrayList<>();
    }
}