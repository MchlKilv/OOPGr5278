package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student> {

    private int count;
    private List<Student> students;

    public StudentIterator(List<Student> students) {
        this.students = students;
        this.count = 0;

    }

    @Override
    public boolean hasNext() {
        return count < students.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        // count++;
        return students.get(count++);
    }
}
