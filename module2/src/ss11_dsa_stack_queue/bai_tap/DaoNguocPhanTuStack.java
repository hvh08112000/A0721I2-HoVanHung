package ss11_dsa_stack_queue.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class DaoNguocPhanTuStack {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        System.out.println(Arrays.toString(array));
    }

    public void daoNguocPTSo
}
