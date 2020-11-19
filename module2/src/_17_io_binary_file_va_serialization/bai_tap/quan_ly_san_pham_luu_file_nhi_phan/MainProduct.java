package _17_io_binary_file_va_serialization.bai_tap.quan_ly_san_pham_luu_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProduct implements Serializable {
    public static List<Product> productList = new ArrayList<>();
    public static void main(String[] args) {
        MainProduct.displayMenu();
    }
    public static void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        do {
            System.out.println("1.\tAdd Product\n" +
                    "2.\tShow Product\n" +
                    "3.\tSearch Product\n" +
                    "4.\tExit");

            System.out.println("nhap chuc nang 1-3");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayProduct();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }

        }while (choose >= 1 && choose <= 4);

    }

    private static void searchProduct() {

    }

    private static void displayProduct() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream(new File("src/_17_io_binary_file_va_serialization/bai_tap/quan_ly_san_pham_luu_file_nhi_phan/product.csv"))
            );
            productList = (List<Product>) objectInputStream.readObject();
            System.out.println(productList);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void addProduct() {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
//        List<Product> list = new ArrayList<>();

        System.out.println("nhap ma san pham : ");
        product.setMaSanPham(scanner.nextInt());

        scanner.nextLine();
        System.out.println("nhap ten san pham : ");
        product.setTenSanPham(scanner.nextLine());

        System.out.println("nhap hang san xuat : ");
        product.setHangSanXuat(scanner.nextLine());

        System.out.println("nhap gia san pham : ");
        product.setGia(scanner.nextDouble());

        scanner.nextLine();
        System.out.println("nhap cac mo ta khac : ");
        product.setCacMoTaKhac(scanner.nextLine());

        productList.add(product);
//        list.add(product);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream(
                            new File("src/_17_io_binary_file_va_serialization/bai_tap/quan_ly_san_pham_luu_file_nhi_phan/product.csv"))
            );
            objectOutputStream.writeObject(product);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
