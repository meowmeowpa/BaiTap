package ThucHanh4;

public class Test {
    public static void main(String[] args) {
        StudentImpl student = new StudentImpl("Minh Anh", 22, true);

        student.eat();
        student.sleep();
        student.study();
        student.registerCourse("Programming Node JS");
        student.attendClass();
    }
}

