// package services;

// import java.util.ArrayList;
// import java.util.List;

// import Domain.PersonComparator;

// public class StudentService implements iPersonService<Student> {
// private int count;
// private List<Student> students;

// public StudentService() {

// students = new ArrayList<>();

// }

// @Override
// public List<Student> getAll() {
// // TODO Auto-generated method stub
// return students;
// }

// @Override
// public void create(String name, int age) {
// // TODO Auto-generated method stub
// Student stud = new Student(name, age);
// count++;
// students.add(stud);
// sortByFIO();
// }

// public void sortByFIO() {
// PersonComparator<Student> studComp = new PersonComparator<>();
// students.sot(studComp);
// }
// }
