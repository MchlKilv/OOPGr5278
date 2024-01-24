package Viev;

import java.util.List;

import Controller.Interfaces.iGetViev;
import Model.Domain.Student;

public class VievClass implements iGetViev {
    public void printALLStudents(List<Student> students) {
        System.out.println("All students: -----------------");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("-------------------------------");
    }

}
