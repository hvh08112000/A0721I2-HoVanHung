package ss5_access_modifier_static.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Bán kính hình tròn: " + circle.getRadius());
        System.out.println("Diện tích hình tròn: " + circle.getArea());
    }
}
