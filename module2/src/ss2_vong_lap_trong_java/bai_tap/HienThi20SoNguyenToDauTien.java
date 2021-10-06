package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int number, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng SNT cần in ra: ");
        number = sc.nextInt();
        int n = 2;
        System.out.print(number + " số nguyên tố đầu tiên là: ");
        while (count < number) {
            if (checkPrimeNumber(n)) {
                System.out.print(n + "; ");
                count++;
            }
            n++;
        }
    }
    public static boolean checkPrimeNumber(int a) {
        if (a < 2)
            return false;
        else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a%i == 0)
                    return false;
            }
            return true;
        }
    }
}
