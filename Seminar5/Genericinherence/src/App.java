import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Student<String, Integer> student1 = new Student<String, Integer>("John", 21);
        System.out.println(student1);
        Student<String, Integer> student2 = new Student<String, Integer>("Jane", 22);
        Student<String, Integer> student3 = new Student<String, Integer>("Joe", 23);

        List<Student<String, Integer>> listStudents = new ArrayList<>();
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);

        StudentGroup<String, Integer> group = new StudentGroup<String, Integer>(listStudents, 5555);
        for (Student<String, Integer> stud : group) {
            System.out.println(stud);
        }
    }
}
