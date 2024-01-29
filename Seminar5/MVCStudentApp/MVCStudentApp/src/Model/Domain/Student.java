package Model.Domain;

import Controller.Languages;

public class Student extends Person // implements Comparable<Student>
{

    // private int id;
    // private static int generalId;
    private Long id;
    private static Long generalId = 0L;

    public Student(String name, int age) {
        super(name, age);
        this.id = generalId++;
        // generalId++;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        // Переопределяем метод toString()
        // return "Students [age=" + super.getAge() + ", name=" + super.getName() + ",
        // id=" + id + "]";

        return Languages.langStud + " " + super.getName() + ", " + Languages.langAge + ": " + super.getAge() + ", ID = "
                + id;
    }

    // @Override
    // // Переопределяем метод compareTo(), сортирующий по возрасту
    // public int compareTo(Student o) {

    // System.out.println(super.getName() + " - " + o.getName());
    // if (super.getAge() == o.getAge()) {
    // if (id == o.id)
    // return 0;
    // if (id > o.id)
    // return 1;
    // else
    // return -1;
    // // return 0;
    // }

    // if (super.getAge() > o.getAge())
    // return 1;
    // else
    // return -1;
    // }
}
