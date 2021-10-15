package ss6_inheritance.bai_tap;

public class TestPoint {
    public static void main(String[] args) {
        //Test point2D
        Point2D point2D = new Point2D(3,5);
        System.out.println(point2D.toString());

        //Test point3D
        Point3D point3D = new Point3D(4,6,8);
        System.out.println(point3D.toString());

        //Test point
        Point point = new Point(2, 7);
        System.out.println(point.toString());

        //Test MovablePoint
        MovablePoint movablePoint = new MovablePoint(5,10);
        System.out.println(movablePoint.toString());
    }
}
