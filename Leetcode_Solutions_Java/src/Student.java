import java.util.ArrayList;
import java.util.List;

public class Student {

    public String name;
    private int age;
    private String gender;
    private List<Integer> classNumbers;

    public Student() {
        classNumbers = new ArrayList<>();
        age = 20;
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.classNumbers = new ArrayList<>();
    }

    public static void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void enrollClass(int classNumber) {
        classNumbers.add(classNumber);
    }

}
