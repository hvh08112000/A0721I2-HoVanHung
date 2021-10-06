package ss2_vong_lap_trong_java.bai_tap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.print("Các số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 2; i < 100; i++) {
            if (checkPrimeNumber(i))
                System.out.print(i + "; ");
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
