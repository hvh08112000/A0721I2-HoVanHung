package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int arr[] = {3,7,9,3,6,2,5,6};
        int x, i = 0, count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phần tử cần xóa: ");
        x = scanner.nextInt();
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == x) {
                count++;
            }
        }
        int[] result = new int[arr.length - count];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != x) {
                result[i++] = arr[j];
            }
        }
        System.out.println("Mảng sau khi xóa: " + Arrays.toString(result));
    }
}
