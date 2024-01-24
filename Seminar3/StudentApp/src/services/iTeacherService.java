package services;

import java.util.ArrayList;
import java.util.List;

import Domain.PersonComparator;
import Domain.Teacher;

public class iTeacherService implements iPersonService<Teacher> {
    private int count;
    private List<Teacher> teachers;

    public iTeacherService() {

        teachers = new ArrayList<>();
    }

    public void sortByFIO() {

        PersonComparator<Teacher> teacherComp = new PersonComparator<>();
        teachers.sort(teacherComp);
    }

    @Override
    public List<Teacher> getAll() {

        return teachers;
    }

    @Override
    public void create(String name, int age) {

        Teacher teacher = new Teacher(name, age, "бакалавр");
        count++;
        teachers.add(teacher);

    }

}
