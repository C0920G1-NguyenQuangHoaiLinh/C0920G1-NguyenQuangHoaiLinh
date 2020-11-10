package _11_dsa_stack_and_queue.bai_tap.demerging_su_dung_queue;

import javafx.scene.input.DataFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class NhanVien implements Comparable<NhanVien>{
    private String hoTen;
    private String gioiTinh;
    private String ngayThangNamSinh;

    @Override
    public String toString() {
        return "Ho Ten: " + this.hoTen + "\n" +
                "Gioi Tinh: " + this.gioiTinh + "\n" +
                "Ngay Thang Nam Sinh: " + this.ngayThangNamSinh;
    }

    public NhanVien() {
    }

    public NhanVien(String hoTen, String gioiTinh, String ngayThangNamSinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngayThangNamSinh = ngayThangNamSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgayThangNamSinh() {
        return ngayThangNamSinh;
    }

    public void setNgayThangNamSinh(String ngayThangNamSinh) {
        this.ngayThangNamSinh = ngayThangNamSinh;
    }

    @Override
    public int compareTo(NhanVien o) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return dateFormat.parse(getNgayThangNamSinh()).compareTo(dateFormat.parse(o.getNgayThangNamSinh()));
        } catch (ParseException e){
            throw new IllegalArgumentException(e);
        }
    }
}
