package Controller.Interfaces;

import java.util.HashMap;
// import java.util.List;

import Model.Domain.Student;

public interface iGetModel {

    HashMap<Long, Student> getStudents();

    // public List<Student> getStudents();

}