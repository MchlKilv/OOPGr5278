// package services;

// import java.util.ArrayList;
// import java.util.List;

// import Domain.Employee;
// import Domain.PersonComparator;
// import Domain.Student;

// public class EmployeeService implements iPersonService<Employee> {
// private int count;
// private List<Employee> employees;

// public EmployeeService() {

// employees = new ArrayList<>();

// }

// @Override
// public List<Employee> getAll() {
// // TODO Auto-generated method stub
// return employees;
// }

// @Override
// public void create(String name, int age) {
// // TODO Auto-generated method stub
// Employee emp = new Employee(name, age, "secyurity");
// count++;
// employees.add(emp);

// }

// public void sortByFIO() {
// PersonComparator<Employee> empComp = new PersonComparator<>();
// employees.sort(empComp);
// }
// }
