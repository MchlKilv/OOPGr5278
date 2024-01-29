import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Student<String, Integer> s1 = new Student<String, Integer>("John", 21);
        System.out.println(s1);
        Student<String, Integer> s2 = new Student<String, Integer>("Jane", 22);
        Student<String, Integer> s3 = new Student<String, Integer>("Joe", 23);

        List<Student<String, Integer>> listStudents = new ArrayList<>();
        listStudents.add(s1);
        listStudents.add(s2);
        listStudents.add(s3);

        StudentGroup<String, Integer> group = new StudentGroup<String, Integer>(listStudents, 5555);
        for (Student<String, Integer> stud : group) {
            System.out.println(stud);
        }
    }
}
