public class Student<T extends Comparable<T>, V> extends Person<T, V> implements Comparable<Student<T, V>> {

    private V id;
    // private static int generalId = 1;

    public Student(T name, V age) {
        super(name, age);
        // this.id = generalId;
        // generalId++;
    }

    public V getId() {
        return id;
    }

    @Override
    public String toString() {
        // Переопределяем метод toString()
        return "\nStudent - age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id;
    }

    @Override
    // Переопределяем метод compareTo(), сортирующий по возрасту
    public int compareTo(Student<T, V> o) {

        return super.getName().compareTo(o.getName());

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
    }
}
