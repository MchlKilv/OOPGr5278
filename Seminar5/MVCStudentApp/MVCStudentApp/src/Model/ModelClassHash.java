package Model;

import java.util.HashMap;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClassHash implements iGetModel {

    private HashMap<Long, Student> students;

    public ModelClassHash(HashMap<Long, Student> students) {
        this.students = students;
    }

    @Override
    public HashMap<Long, Student> getStudents() {

        return students;
    }

}

// import java.util.List; Model class

// import Controller.Interfaces.iGetModel;
// import Model.Domain.Student;

// public class ModelClass implements iGetModel {
// private List<Student> students;

// public ModelClass(List<Student> students) {
// this.students = students;
// }

// public List<Student> getStudents() {
// return students;
// }
// }
