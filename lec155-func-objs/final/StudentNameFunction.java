
public class StudentNameFunction implements IFunc<Student, String> {
    public String apply(Student obj) {
        return obj.getName();
    }
}
