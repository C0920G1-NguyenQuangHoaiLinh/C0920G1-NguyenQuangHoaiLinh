package _11_dsa_stack_and_queue.bai_tap.dao_nguoc_phan_tu_mang;

import java.util.Arrays;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String string = "hello xin chao cac ban";
        Stack<String> stack = new Stack<>();
        String[] str = string.split(" ");
        System.out.println(Arrays.toString(str));

        for (String s : str) {
            stack.push(s);
        }

        for (int i = 0; i < str.length; i++){
            str[i] = stack.pop();
        }

        System.out.println(Arrays.toString(str));
    }
}
