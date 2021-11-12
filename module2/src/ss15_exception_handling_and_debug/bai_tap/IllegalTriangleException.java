package ss15_exception_handling_and_debug.bai_tap;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException(String s) {
        super("Khong phai 3 canh 1 tam giac!!!");
    }
}
