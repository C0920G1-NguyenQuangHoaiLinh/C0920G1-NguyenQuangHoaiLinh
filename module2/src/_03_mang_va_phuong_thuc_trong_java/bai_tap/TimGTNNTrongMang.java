package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimGTNNTrongMang {
    public static void main(String[] args) {
        int size = 5;
        int[] arr = new int[size];
        for (int i = 0; i < arr.length;i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter element " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        for (int j = 1; j < arr.length; j++){
            if (arr[j] < min){
                min = arr[j];
            }
        }
        System.out.println("Element min is : " + min);
    }
}
