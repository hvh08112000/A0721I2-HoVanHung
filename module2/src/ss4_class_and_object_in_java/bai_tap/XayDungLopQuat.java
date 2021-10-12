package ss4_class_and_object_in_java.bai_tap;

public class XayDungLopQuat {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(fan1.medium);
        fan2.setRadius(5);
        fan2.getColor();
        fan2.setOn(false);
        fan1.getDisplay();
        fan2.getDisplay();
    }
}
