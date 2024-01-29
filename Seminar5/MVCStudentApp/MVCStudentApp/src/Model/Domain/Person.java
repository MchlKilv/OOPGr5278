package Model.Domain;

public abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        // Конструктор класса Person
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        // Переопределяем метод toString()
        return "Persone [name=" + name + "age=" + age + "]";
    }
}