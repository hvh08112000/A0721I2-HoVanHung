package ss11_dsa_stack_queue.bai_tap;

import java.util.*;

public class CountCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap vao 1 chuoi bat ky: ");
        String chuoi = scanner.nextLine();
        char[] kytu = chuoi.toCharArray();
        int length = kytu.length;

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            char ch = kytu[i];
            // Kiểm tra xem ch có phải chữ in hoa A-Z,
            if (ch >= 65 && ch <= 90) {
                // Chuyển thành chữ in thường dựa vào bảng mã ascii
                ch = (char) (ch + 32);
            }

            // kiểm tra char có phải là chữ thường hay không
            if (ch >= 97 && ch <= 122) {
                //Kiểm tra xem trong map có key này hay chưa.
                // Nếu có đẩy key này vào map và tăng value (số lượng từ) lên 1
                // Nếu key này chưa có trong map thì đẩy key vào map mặc định gán value là 1.
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }
        }
        Set<Character> keys = map.keySet();
        for (Character ch : keys) {
            System.out.println("Ký tự: " + ch + " xuất hiện: " + map.get(ch) + " lần");
        }
    }
}
