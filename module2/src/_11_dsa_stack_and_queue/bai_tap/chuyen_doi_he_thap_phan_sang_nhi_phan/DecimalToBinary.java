package _11_dsa_stack_and_queue.bai_tap.chuyen_doi_he_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Decimal : ");
        int input = scanner.nextInt();

        do {
            stack.push(input % 2);
            input = input / 2;
        } while (input > 0);

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
