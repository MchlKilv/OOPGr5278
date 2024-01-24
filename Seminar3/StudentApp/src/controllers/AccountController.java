package controllers;

import java.util.ArrayList;

import Domain.Person;
import Domain.Worker;

public class AccountController {
    public <T extends Worker, V> void paySalary(T person, V salary) {
        System.out.println(person.getName() + " выплачена зарплата: " + salary);
    }

    // Метод для расчета среднего возраста
    public static <T extends Person, V> void averageAge(ArrayList<T> listPerson) {

        double sum = 0;
        for (Person person : listPerson) {
            sum += person.getAge();
        }
        double averageAge = sum / listPerson.size();
        String s = String.format("%.2f", averageAge);
        for (Person person : listPerson) {
            System.out.println(person.getName() + " " + person.getAge());
        }
        System.out.println("Средний возраст: " + s + " лет" + " [" + averageAge + "]");

    }
}