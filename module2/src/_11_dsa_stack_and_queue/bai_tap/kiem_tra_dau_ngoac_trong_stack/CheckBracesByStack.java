package _11_dsa_stack_and_queue.bai_tap.kiem_tra_dau_ngoac_trong_stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracesByStack {
    public static void main(String[] args) {
        Stack bStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression want to check : ");
        String string = scanner.nextLine();
        boolean check = true;
        for (int i = 0;i < string.length();i++){
            if (string.charAt(i) == '('){
                bStack.push(string.charAt(i));
            }else if (string.charAt(i) == ')'){
                if (!bStack.isEmpty()){
                    bStack.pop();
                }else {
                    check = false;
                    break;
                }
            }
        }
        if (check && bStack.isEmpty()){
            System.out.println("correct expression");
        }else {
            System.out.println("error expression");
        }

    }

}
