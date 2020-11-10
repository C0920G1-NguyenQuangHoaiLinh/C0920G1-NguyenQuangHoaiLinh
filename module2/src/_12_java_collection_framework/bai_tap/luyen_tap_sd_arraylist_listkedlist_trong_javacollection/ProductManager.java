package _12_java_collection_framework.bai_tap.luyen_tap_sd_arraylist_listkedlist_trong_javacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    static ArrayList<Product> products = new ArrayList<Product>();
    Scanner input = new Scanner(System.in);

    public void addNewProduct(){
        Product sp = new Product();
        System.out.println("nhap id san pham : ");
        sp.setId(input.nextInt());
        input.nextLine();
        System.out.println("nhap ten san pham : ");
        sp.setTenSanPham(input.nextLine());
        System.out.println("nhap gia san pham : ");
        sp.setGiaSanPham(input.nextDouble());
        products.add(sp);
    }

    public void editProduct(){
        System.out.println("nhap id san pham can sua : ");
        for (int i = 0 ; i < products.size(); i++){
            if (input.nextInt() == products.get(i).getId()){
                System.out.println("nhap id moi cua san pham : ");
                products.get(i).setId(input.nextInt());

                input.nextLine();
                System.out.println("nhap ten moi cua san pham : ");
                products.get(i).setTenSanPham(input.nextLine());

                System.out.println("nhap gia moi cua san pham : ");
                products.get(i).setGiaSanPham(input.nextDouble());
                break;
            }
        }
    }
    public void deleteProduct(){
        System.out.println("nhap id san pham can xoa :");
        for (Product product: products) {
            if (input.nextInt() == (product.getId())){
                products.remove(product);
            }
        }
    }

    public void displayProduct(){
        System.out.println("Danh sach san pham hien tai : " );
        for (Product product: products){
            System.out.println(product.toString());
        }
    }

    public void searchProduct(){
        System.out.println("nhap ten san pham can tim : ");
        input.nextLine();
        String timKiem = input.nextLine();
        for (Product product : products) {
            if (product.getTenSanPham().contains(timKiem)){
                System.out.println(product.toString());
            }
        }
    }

    public void sortMinToMaxProduct(){
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getGiaSanPham() > o2.getGiaSanPham() ? 1 : -1;
            }
        });
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
    public void sortMaxToMinProduct(){
        Collections.sort(products, (o1, o2) -> o1.getGiaSanPham() < o2.getGiaSanPham() ? 1 : -1);
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
}
