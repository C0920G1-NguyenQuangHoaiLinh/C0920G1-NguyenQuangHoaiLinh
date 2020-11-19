package _18_string_and_regex.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;

public class MainNumberPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số điện thoại : ");
        String numberPhone = scanner.nextLine();

        while (!NumberPhone.checkNumberPhone(numberPhone)){
            System.out.println("NumberPhone sai định dạng !! nhập lại : ");
            System.out.println("nhập số điện thoại : ");
            numberPhone = scanner.nextLine();
        }
        System.out.println("NumberPhone hợp lệ ! ");
    }
}
