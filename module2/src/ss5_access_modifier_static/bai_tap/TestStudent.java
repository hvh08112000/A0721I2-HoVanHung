package ss5_access_modifier_static.bai_tap;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Hung");
        student.setClasses("A07");
        System.out.println("Name: " + student.getName() + "\nClasses: " + student.getClasses());
    }
}
