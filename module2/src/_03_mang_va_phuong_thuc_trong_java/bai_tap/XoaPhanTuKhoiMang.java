package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5};
        int n = arr.length;

        System.out.print("Truoc khi xoa: ");
        System.out.println(Arrays.toString(arr));

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập phần tử cần xóa");
        int x = scanner.nextInt();
        delete(arr, x);
        System.out.println(Arrays.toString(arr));
    }
    public static void delete(int[] arr, int x){
        for (int i=0;i < arr.length; i++){
            if (x == arr[i]){
                for (int j = i;j < arr.length-1;j++){
                    arr[j] = arr[j+1];
                }
                i--;
                arr[arr.length-1] = 0;
            }
        }
    }
}
