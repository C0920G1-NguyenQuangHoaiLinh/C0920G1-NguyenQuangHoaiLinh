package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimGTLNTrongMang2Chieu {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input element [" + i + "] [" + j + "]");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
        int max = arr[0][0];
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
