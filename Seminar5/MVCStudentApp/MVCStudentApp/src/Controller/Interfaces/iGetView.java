package Controller.Interfaces;

import java.util.HashMap;
// import java.util.List;

import Model.Domain.Student;

public interface iGetView {

    void printAllStudents(HashMap<Long, Student> students);

    String prompt(String msg);

    // public HashMap<String, String> getLanguageList();

}