package _11_dsa_stack_and_queue.bai_tap.chuyen_doi_he_thap_phan_sang_nhi_phan;

import java.util.Stack;

public class StackReverseNumber {
    static Stack<Integer> stack = new Stack<>();

    static void push_digits(int number)
    {
        while(number != 0)
        {
            stack.push(number % 10);
            number = number / 10;
        }
    }
    static int reverseNumber(int number)
    {
        // Function call to push number's
        // digits to stack
        push_digits(number);
        int reverse = 0;
        int i = 1;

        // Popping the digits and forming
        // the reversed number
        while (!stack.isEmpty())
        {
            reverse = reverse + (stack.peek() * i);
            stack.pop();
            i = i * 10;
        }

        // Return the reversed number formed
        return reverse;
    }
}
