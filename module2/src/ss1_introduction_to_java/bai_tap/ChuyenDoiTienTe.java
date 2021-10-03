package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền USD: ");
        usd = sc.nextDouble();
        System.out.println("Giá trị VND: " + usd * 23000);
    }
}
