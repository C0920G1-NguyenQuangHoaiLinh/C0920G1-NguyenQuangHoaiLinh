package case_study.bai_tap_3;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        MainMenu.displayMenu();
    }

    public static void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        int choose = 0;
        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM--");
            System.out.println("1. Thêm mới\n" +
                    "2. Xóa\n" +
                    "3. Xem danh sách các sản phẩm\n" +
                    "4. Tìm kiếm\n" +
                    "5. Thoát\n");
            System.out.print("Chọn chức năng: ");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("1 .Import product ");
                    System.out.println("2 .Export product ");
                    System.out.println("3 .Back to menu ");
                    int temp = scanner.nextInt();
                    if (temp == 1){
                        productManager.addNewProduct("importProduct");
                    }else if (temp == 2){
                        productManager.addNewProduct("exportProduct");
                    }else {
                        displayMenu();
                    }
                    break;
                case 2:
                    productManager.deleteProduct();
                    break;
                case 3:
                    productManager.showProduct();
                    break;
                case 4:
                    for (Product product:productManager.readProduct()){
                        System.out.println(product);
                    }
                    break;
            }
        }while (choose >= 1 && choose <= 4);

    }
}
