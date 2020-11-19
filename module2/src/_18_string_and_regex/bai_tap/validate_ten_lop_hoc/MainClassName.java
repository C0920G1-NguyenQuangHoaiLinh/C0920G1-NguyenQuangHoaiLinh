package _18_string_and_regex.bai_tap.validate_ten_lop_hoc;

import java.util.Scanner;

public class MainClassName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên lớp : ");
        String className = scanner.nextLine();

        while (!ClassName.check(className)){
            System.out.println("tên lớp ko đúng định dạng !! nhập lại tên lớp : ");
            className = scanner.nextLine();
        }
        System.out.println(className + "tên lớp hợp lệ");
    }
}
