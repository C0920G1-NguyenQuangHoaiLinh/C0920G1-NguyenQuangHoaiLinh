package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int size1 = 3;
        int size2 = 2;
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        int[] newArr = new int[size1 + size2];

        for (int i = 0;i < arr1.length;i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter element arr1 " + (i + 1) + " : ");
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0;i < arr2.length;i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter element arr2 " + (i+1) + " : ");
            arr2[i] = scanner.nextInt();
        }


        for (int i = 0; i < arr1.length; i++){
            newArr[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++){
            newArr[arr1.length + j] = arr2[j];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
