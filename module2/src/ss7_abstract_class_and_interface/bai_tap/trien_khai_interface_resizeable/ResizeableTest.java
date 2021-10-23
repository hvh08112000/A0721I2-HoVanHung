package ss7_abstract_class_and_interface.bai_tap.trien_khai_interface_resizeable;

import java.util.Random;

public class ResizeableTest {
    public static void main(String[] args) {
        Random random = new Random();

        //Test Circle
        Circle[] circle = new Circle[5];
        int length = circle.length;
        //init array circle
        for (int i = 0; i < length; i++) {
            circle[i] = new Circle(10);
        }
        //resize circle
        for (int i = 0; i < length; i++) {
            System.out.println("Shape circle " + (i + 1) + " :");
            System.out.println("Area before resize: " + circle[i].getArea());
            int percent = (int)(random.nextDouble() * 100);
            System.out.println("Percent: " + percent);
            circle[i].resize(percent);
            System.out.println("Area after resize: " + circle[i].getArea());
        }
        System.out.println("===========================================================");
        //Test Rectangle
        Rectangle[] rectangles = new Rectangle[5];
        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i] = new Rectangle(5,10);
        }

        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Shape rectangle " + (i + 1) + " :");
            System.out.println("Area before resize: " + rectangles[i].getArea());
            int percent = (int)(random.nextDouble() * 100);
            System.out.println("Percent: " + percent);
            rectangles[i].resize(percent);
            System.out.println("Area after resize: " + rectangles[i].getArea());
        }
    }
}
