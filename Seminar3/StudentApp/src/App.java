import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentStream;
// import Domain.Employee;
// import Domain.Person;
// import Domain.Teacher;
// import controllers.AccountController;

public class App {
    public static void main(String[] args) throws Exception {

        Student student1 = new Student("John", 20);
        Student student2 = new Student("Mary", 21);
        Student student3 = new Student("Bob", 22);
        Student student4 = new Student("Ivan", 21);
        Student student5 = new Student("Ken", 20);

        Student student6 = new Student("Peter", 19);
        Student student7 = new Student("Elena", 21);
        Student student8 = new Student("Victor", 23);
        Student student9 = new Student("Nik", 21);
        Student student10 = new Student("Frank", 22);
        Student student11 = new Student("Olga", 18);

        Student student12 = new Student("Steven", 20);
        Student student13 = new Student("Anna", 20);
        Student student14 = new Student("Robert", 22);

        // Группа 1 №117
        List<Student> listGroup1 = new ArrayList<>();
        listGroup1.add(student1);
        listGroup1.add(student2);
        listGroup1.add(student3);
        listGroup1.add(student4);
        listGroup1.add(student5);

        StudentGroup group1 = new StudentGroup(listGroup1, 117);
        // System.out.println(group1);

        System.out.println("--------------------------------------------");

        // Группа 2 №1064
        List<Student> listGroup2 = new ArrayList<>();
        listGroup2.add(student6);
        listGroup2.add(student7);
        listGroup2.add(student8);
        listGroup2.add(student9);
        listGroup2.add(student10);
        listGroup2.add(student11);

        StudentGroup group2 = new StudentGroup(listGroup2, 1064);
        // System.out.println(group2);

        // Группа 3 №135

        List<Student> listGroup3 = new ArrayList<>();
        listGroup3.add(student12);
        listGroup3.add(student13);
        listGroup3.add(student14);

        StudentGroup group3 = new StudentGroup(listGroup3, 135);

        for (Student stud : group1) {
            System.out.println(stud);
        }

        System.out.println("--------------------------------------------");
        for (Student stud : group2) {
            System.out.println(stud);
        }

        System.out.println("--------------------------------------------");

        for (Student stud : group3) {
            System.out.println(stud);
        }
        System.out.println("--------------------------------------------");
        // Список групп
        List<StudentGroup> groups = new ArrayList<>(List.of(group1, group2, group3));
        // Объединение групп в один поток студентов
        StudentStream str = new StudentStream(groups, 1);

        for (StudentGroup group : str) {
            System.out.println(group);
        }

        System.out.println(str);

        // Сортировка по количеству студентов в группах потока
        Collections.sort(str.getStream());
        for (StudentGroup group : str) {
            System.out.println(group);
        }
        // for (Student stud : group1.getGroup()) {
        // System.out.println("Группа " + group1.getIdGroup() + " " + stud);
        // }

        // Teacher t1 = new Teacher("John", 50, "Доцент");
        // Employee e1 = new Employee("Fedor", 35, "Директор");
        // AccountController controller = new AccountController();
        // controller.paySalary(t1, 50000);
        // controller.paySalary(e1, 100000);

    }
}
