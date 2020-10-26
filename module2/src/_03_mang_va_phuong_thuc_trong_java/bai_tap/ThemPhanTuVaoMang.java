package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int N = arr.length;

        int x;
        int index;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap phan tu can them");
        x = scanner.nextInt();
        System.out.println("nhap vi tri can them");
        index = scanner.nextInt();

        int[] arr2 = new int[N +1];
        for (int i = 0;i < N;i++){
            arr2[i] = arr[i];
        }
        arr2[N] = x;
        int temp;
        for (int i = index; i < arr.length;i++){
            temp = arr2[i];
            arr2[i] = arr2[arr2.length - 1];
            arr2[arr2.length - 1] = temp;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
