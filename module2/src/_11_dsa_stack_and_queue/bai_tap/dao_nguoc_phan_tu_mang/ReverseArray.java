package _11_dsa_stack_and_queue.bai_tap.dao_nguoc_phan_tu_mang;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1,2,3,4,5};

        for (int i = 0 ; i < arr.length;i++){
            stack.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++){
            arr[i] = stack.pop();
        }

        System.out.println(Arrays.toString(arr));

    }
}
