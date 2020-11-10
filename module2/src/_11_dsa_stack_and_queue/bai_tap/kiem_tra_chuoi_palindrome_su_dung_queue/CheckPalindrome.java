package _11_dsa_stack_and_queue.bai_tap.kiem_tra_chuoi_palindrome_su_dung_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string want to check : ");
        String inputString = scanner.nextLine();
        Queue queue = new LinkedList();
        for (int i = inputString.length()-1; i >=0; i--){
            queue.add(inputString.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()){
            reverseString = reverseString + queue.remove();
        }
        if (inputString.equals(reverseString)){
            System.out.println("this is the string palindrome");
        }else {
            System.out.println("this is not the string palindrome");
        }
    }

}
