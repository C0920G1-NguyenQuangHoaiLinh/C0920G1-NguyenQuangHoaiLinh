package _12_java_collection_framework.bai_tap.luyen_tap_sd_arraylist_listkedlist_trong_javacollection;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        MainProduct.displayMenu();
    }

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        ProductManager productManager = new ProductManager();
        do {
            System.out.println("1.\tThem san pham\n" +
                    "2.\tSua thong tin san pham\n" +
                    "3.\tXoa san pham theo id\n" +
                    "4.\tHien thi danh sach san pham\n" +
                    "5.\tTim kiem san pham theo ten\n" +
                    "6.\tSap xep san pham tang dan, giam dan theo gia\n" +
                    "7.\tThoat");
            System.out.println("Chon chuc nang 1 - 6");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    productManager.addNewProduct();
                    break;
                case 2:
                    productManager.editProduct();
                    break;
                case 3:
                    productManager.deleteProduct();
                    break;
                case 4:
                    productManager.displayProduct();
                    break;
                case 5:
                    productManager.searchProduct();
                    break;
                case 6:
                    System.out.println("nhâp 1 de hien thi tang\n nhap 2 de hien thi giam");
                    int temp = scanner.nextInt();
                    if (temp == 1) {
                        productManager.sortMinToMaxProduct();
                        break;
                    } else if (temp == 2) {
                        productManager.sortMaxToMinProduct();
                        break;
                    }
                case 7:
                    return;
            }
        } while (choose >= 1 && choose <= 6);
    }
}
