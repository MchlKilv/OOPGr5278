package SingleResponsibilityPrinciple;

import java.util.Date;

// Класс employee, описывающий сотрудника
public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    // Конструктор класса employee
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    // Метод для получения информации о сотруднике
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    // Метод для получения размера базовой зарплаты
    public int getBaseSalary() {
        return baseSalary;
    }
}
