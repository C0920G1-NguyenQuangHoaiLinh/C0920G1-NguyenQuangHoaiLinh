package _01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String readIsNumber;
            if (num > 0 && num <= 10) {
                switch (num) {
                    case 1:
                        readIsNumber = "one";
                        break;
                    case 2:
                        readIsNumber = "two";
                        break;
                    case 3:
                        readIsNumber = "three";
                        break;
                    case 4:
                        readIsNumber = "four";
                        break;
                    case 5:
                        readIsNumber = "five";
                        break;
                    case 6:
                        readIsNumber = "six";
                        break;
                    case 7:
                        readIsNumber = "seven";
                        break;
                    case 8:
                        readIsNumber = "eight";
                        break;
                    case 9:
                        readIsNumber = "nine";
                        break;
                    case 10:
                        readIsNumber = "ten";
                        break;
                    default:
                        readIsNumber = "";
                }
                System.out.println(readIsNumber);
            } else if (num > 10 && num < 20) {
                int temp = num - 10;
                switch (temp) {
                    case 1:
                        readIsNumber = "eleven";
                        break;
                    case 2:
                        readIsNumber = "twelve";
                        break;
                    case 3:
                        readIsNumber = "thirteen";
                        break;
                    case 4:
                        readIsNumber = "fourteen";
                        break;
                    case 5:
                        readIsNumber = "fifteen";
                        break;
                    case 6:
                        readIsNumber = "sixteen";
                        break;
                    case 7:
                        readIsNumber = "seventeen";
                        break;
                    case 8:
                        readIsNumber = "eighteen";
                        break;
                    case 9:
                        readIsNumber = "nineteen";
                        break;
                    default:
                        readIsNumber = "";
                }
                System.out.println(readIsNumber);
            } else if (num >= 20 && num < 100) {
                int tens = num / 10;
                int ones = num % 10;
                switch (tens) {
                    case 2:
                        readIsNumber = "twenty";
                        break;
                    case 3:
                        readIsNumber = "thirty";
                        break;
                    case 4:
                        readIsNumber = "forty";
                        break;
                    case 5:
                        readIsNumber = "fifty";
                        break;
                    case 6:
                        readIsNumber = "sixty";
                        break;
                    case 7:
                        readIsNumber = "seventy";
                        break;
                    case 8:
                        readIsNumber = "eighty";
                        break;
                    case 9:
                        readIsNumber = "ninety";
                        break;
                    default:
                        readIsNumber = "";
                }
                switch (ones) {
                    case 1:
                        System.out.print(readIsNumber + " one ");
                        break;
                    case 2:
                        System.out.print(readIsNumber + " two ");
                        break;
                    case 3:
                        System.out.print(readIsNumber + " three ");
                        break;
                    case 4:
                        System.out.print(readIsNumber + " four ");
                        break;
                    case 5:
                        System.out.print(readIsNumber + " five ");
                        break;
                    case 6:
                        System.out.print(readIsNumber + " six ");
                        break;
                    case 7:
                        System.out.print(readIsNumber + " seven ");
                        break;
                    case 8:
                        System.out.print(readIsNumber + " eight ");
                        break;
                    case 9:
                        System.out.print(readIsNumber + " nine ");
                        break;
                    default:
                        System.out.print(readIsNumber + "");
                }
            }
    }
}
