package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        String[] hangDonVi = {"zero","one","two","three","four","five","six","seven","eight","seven","nine"};
        String[] muoiDen20 = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] hangChuc = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        int x = 57;
        if (x < 10) {
            System.out.println(hangDonVi[x]);
        } else if (x < 20) {
            System.out.println(muoiDen20[x - 10]);
        } else if (x < 100) {
            System.out.println(hangChuc[x/10%10 - 2] + " " + hangDonVi[x%10]);
        } else if (x % 100 < 10) {
            System.out.println(hangDonVi[x/100] + " hundred " + hangDonVi[x%10]);
        } else if (x % 100 < 20) {
            System.out.println(hangDonVi[x/100] + " hundred " + muoiDen20[x - 10]);
        } else {
            System.out.println(hangDonVi[x/100] + " hundred " + hangChuc[x/10%10 - 2] + " " + hangDonVi[x%10]);
        }
    }
}
