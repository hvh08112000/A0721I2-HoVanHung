package ss4_class_and_object_in_java.bai_tap;

import java.util.Scanner;

public class XayDungLopPTBacHai {
    public static void main(String[] args) {
        QuadraticEquation qe = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình bậc 2: ax^2 + bx + c");
        System.out.print("Nhập a: ");
        qe.setA(scanner.nextDouble());
        System.out.print("Nhập b: ");
        qe.setB(scanner.nextDouble());
        System.out.print("Nhập c: ");
        qe.setC(scanner.nextDouble());

        if (qe.getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm!!!");
        }
        else if (qe.getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + qe.getRootDouble());
        }
        else {
            System.out.println("Phương trình có hai nghiệm phân biệt: " + qe.getRoot1() + " và " + qe.getRoot2());
        }
    }
}
