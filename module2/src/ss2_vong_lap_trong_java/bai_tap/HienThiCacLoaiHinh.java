package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choose = -1;
        Scanner sc = new Scanner(System.in);
        while (choose != 4) {
            System.out.println("Menu:" +
                    "\n1. Print the rectangle" +
                    "\n2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)" +
                    "\n3. Print isosceles triangle" +
                    "\n4. Exit" +
                    "\nEnter the choose: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("The rectangle:");
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("*\t");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    System.out.println("The square triangle: botton-left");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*\t");
                        }
                        System.out.println("\n");
                    }
                    System.out.println("The square triangle: top-left");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*\t");
                        }
                        System.out.println("\n");
                    }
                    System.out.println("The square triangle: botton-right");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= (5 - i); j++) {
                            System.out.print("\t");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*\t");
                        }
                        System.out.println("\n");
                    }
                    System.out.println("The square triangle: top-right");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("\t");
                        }
                        for (int j = i; j <= 5; j++) {
                            System.out.print("*\t");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    System.out.println("Isosceles triangle:");
                    System.out.println("Nhập chiều cao h:");
                    int h = sc. nextInt();
                    int m = h, n = h;
                    for (int i = 1; i <= h; i++) {
                        for (int j = 1; j <= 2 * h - 1; j++) {
                            if (j >= m && j <= n)
                                System.out.print("*\t");
                            else
                                System.out.print("\t");
                        }
                        m--;
                        n++;
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choose!!!");
            }
        }
    }
}
