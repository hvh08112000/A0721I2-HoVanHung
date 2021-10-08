package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Mảng:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa nhập: " + Arrays.toString(array));
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
