package ss7_abstract_class_and_interface.bai_tap.trien_khai_interface_colorable;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8,"yellow",true);
        System.out.println(square);
        square.howToColor();
    }
}
