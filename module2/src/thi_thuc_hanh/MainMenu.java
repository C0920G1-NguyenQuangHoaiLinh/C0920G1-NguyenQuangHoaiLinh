package thi_thuc_hanh;

import java.util.Scanner;

public class MainMenu {
    private static String daiHan = "DaiHan";
    private static String nganHan = "NganHan";
    private static String shortTerm = "shorTerm";
    private static String longTerm = "longTerm";
    public static void main(String[] args) {
        MainMenu.displayMenu();
    }

    public static void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        MainControl mainControl = new MainControl();
        System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SỔ TIẾT KIỆM--");
        System.out.println("1. Thêm mới sổ tiết kiệm ");
        System.out.println("2. Xóa sổ tiết kiệm ");
        System.out.println("3. Xem danh sách sổ tiết kiệm ");
        System.out.println("4. Xem thông tin khách hàng ");
        System.out.println("5. Tìm kiếm sổ tiết kiệm ");
        System.out.println("6. Thoát ");
        int choose = 0;
        do {
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("1. Dai han");
                    System.out.println("2. Ngan han");
                    int temp = scanner.nextInt();
                    if (temp == 1){
                        mainControl.themMoiSTK("DaiHan");
                    }else if (temp == 2){
                        mainControl.themMoiSTK("NganHan");
                    }
                    break;
                case 2:
                    mainControl.xoaSoTietKiem();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    return;
            }
        }while (choose >=1 && choose <=5);
    }
}
