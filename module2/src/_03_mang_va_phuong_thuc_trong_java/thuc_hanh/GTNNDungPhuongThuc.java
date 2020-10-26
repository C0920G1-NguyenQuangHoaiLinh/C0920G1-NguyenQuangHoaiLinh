package _03_mang_va_phuong_thuc_trong_java.thuc_hanh;

public class GTNNDungPhuongThuc {
    public static int minValue(int[] array) {
        int index = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < index) {
                index = array[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int min = minValue(arr);
        System.out.println("The smallest element in the array is: " + min);
    }
}


