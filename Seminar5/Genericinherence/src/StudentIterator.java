import java.util.Iterator;
import java.util.List;

public class StudentIterator<T extends Comparable<T>, V> implements Iterator<Student<T, V>> {

    private int count;
    private List<Student<T, V>> students;

    public StudentIterator(List<Student<T, V>> students) {
        this.students = students;
        this.count = 0;

    }

    @Override
    public boolean hasNext() {
        return count < students.size();
    }

    @Override
    public Student<T, V> next() {
        if (!hasNext()) {
            return null;
        }
        // count++;
        return students.get(count++);
    }
}
