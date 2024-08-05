package ThucHanh4;

public class StudentImpl extends People implements Student {

    public StudentImpl(String name, int age, boolean gender) {
        super(name, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Student is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Student is sleeping");
    }

    @Override
    public void study() {
        System.out.println("Student is studying");
    }

    @Override
    public void registerCourse(String course) {
        System.out.println("Student registered for course: " + course);
    }

    @Override
    public void attendClass() {
        System.out.println("Student is attending class");
    }
}

