package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {

    private Integer idStream;

    public List<StudentGroup> getStream() {
        return stream;
    }

    public List<StudentGroup> stream;

    public StudentStream(List<StudentGroup> stream, Integer idStream) {
        this.idStream = idStream;
        this.stream = stream;
    }

    @Override
    public String toString() {

        return "\nStudentStream" + "\nidStream: " + idStream + "\ngroupList: " + stream.size() + "\nstream: " + "\n"
                + stream;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIterator(stream);
    }

}