package _12_java_collection_framework.bai_tap.luyen_tap_sd_arraylist_listkedlist_trong_javacollection;

import java.util.Comparator;

public class Product implements Comparator<Product> {
    private int id;
    private String tenSanPham;
    private double giaSanPham;

    public Product() {
    }

    public Product(int id, String tenSanPham, double giaSanPham) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", giaSanPham=" + giaSanPham +
                '}';
    }

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getGiaSanPham() > o2.getGiaSanPham()) return 1;
        else if (o1.getGiaSanPham() < o2.getGiaSanPham()) return -1;
        else return 0;
    }
}
