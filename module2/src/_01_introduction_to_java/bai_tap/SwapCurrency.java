package _01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class SwapCurrency {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input money USD");
        usd = scanner.nextDouble();
        double quyDoi = usd * vnd;
        System.out.println("VND :" + quyDoi);
    }
}
