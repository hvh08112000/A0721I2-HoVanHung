package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng các phần tử của 2 mảng: ");
        int size = scanner.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        //Nhập mảng 1
        System.out.println("Mảng 1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " mảng 1: ");
            arr1[i] = scanner.nextInt();
        }

        //In mảng 1
        System.out.println("Mảng 1 vừa nhập: " + Arrays.toString(arr1));

        //Nhập mảng 2
        System.out.println("Mảng 2:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " mảng 2: ");
            arr2[i] = scanner.nextInt();
        }

        //In mảng 2
        System.out.println("Mảng 2 vừa nhập: " + Arrays.toString(arr2));
        int[] newArr = new int[arr1.length + arr2.length];

//        int k = 0;
//        //Gộp mảng dùng for
//        for (int j = 0; j < arr1.length; j++) {
//            newArr[j] = arr1[j];
//        }
//        for (int j = arr2.length + k; j < newArr.length; j++) {
//            newArr[j] = arr2[k++];
//        }

        //Gộp mảng dùng arraycopy()
        System.arraycopy(arr1,0,newArr,0,arr1.length);
        System.arraycopy(arr2,0,newArr,arr1.length,arr2.length);

        //In mảng sau khi gộp
        System.out.println("Sau khi gộp 2 mảng: " + Arrays.toString(newArr));
    }
}
