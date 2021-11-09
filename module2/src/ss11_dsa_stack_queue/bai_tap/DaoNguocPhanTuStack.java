package ss11_dsa_stack_queue.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class DaoNguocPhanTuStack {
    public static void main(String[] args) {
        // Đảo ngược pt trong mảng số nguyên sử dụng stack
        int[] array = {1,2,3,4,5};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        System.out.println(Arrays.toString(array));

        //Đảo ngược chuỗi sử dụng Stack
        String string = "Toi di hoc";
        String output = "";
        Stack<String> wStack = new Stack<>();
        String[] mWord = string.split("\\s");
        for (String word : mWord) {
            wStack.push(word);
        }

        for (int i = 0; i < mWord.length; i++) {
            mWord[i] = wStack.pop();
            output += mWord[i] + " ";
        }
        System.out.println("Chuỗi sau khi đảo ngược: " + output);
    }
}
