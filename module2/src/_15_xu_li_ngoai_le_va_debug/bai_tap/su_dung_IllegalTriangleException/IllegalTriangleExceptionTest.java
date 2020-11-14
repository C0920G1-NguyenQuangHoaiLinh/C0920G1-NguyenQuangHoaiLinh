package _15_xu_li_ngoai_le_va_debug.bai_tap.su_dung_IllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh A ");
        int number = scanner.nextInt();
        System.out.println("nhap canh B ");
        int number2 = scanner.nextInt();
        System.out.println("nhap canh C ");
        int number3 = scanner.nextInt();
        try {
            checkTriangle(number,number2,number3);
        } catch (IllegalTriangleException e){
            System.err.println(e.getMessage());
        }
    }
    public static void checkTriangle(int number, int number2, int number3) throws IllegalTriangleException{
        if (number <= 0 || number2 <=0 || number3 <=0 || number + number2 <= number3 || number2 + number3 <= number || number + number3 <= number2){
            throw new IllegalTriangleException();
        }
    }
}
