package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimPTLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước ma trận m*n: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] array = new int[m][n];
        nhapMang(m,n,array);
        inMang(m,n,array);
        timMax(m,n,array);
    }
    //nhập mảng
    public static void nhapMang(int m, int n, int[][] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử thứ ["+ i +"]["+ j +"]: ");
                array[i][j] = scanner.nextInt();
            }
        }
    }
    //in mảng
    public static void inMang(int m, int n, int[][] array) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Phần tử thứ ["+ i +"]["+ j +"]: " + array[i][j]);
            }
        }
    }
    //tìm max
    public static void timMax(int m, int n, int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất ma trận là: " + max);
    }
}
