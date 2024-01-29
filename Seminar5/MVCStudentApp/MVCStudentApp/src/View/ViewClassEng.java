package View;

import java.util.HashMap;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

public class ViewClassEng implements iGetView {
    public void printAllStudents(HashMap<Long, Student> students) {
        System.out.println("---------------------------------------");
        for (Student st : students.values()) {
            System.out.println(st);
        }
        System.out.println("---------------------------------------");
    }

    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}
