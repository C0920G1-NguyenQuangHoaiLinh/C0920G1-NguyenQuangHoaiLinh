package models;

public class Employee {
    public String hoTenNhanVien;
    public String tuoiNhanVien;
    public String diaChiNhanVien;

    public Employee() {
    }

    public Employee(String hoTenNhanVien, String tuoiNhanVien, String diaChiNhanVien) {
        this.hoTenNhanVien = hoTenNhanVien;
        this.tuoiNhanVien = tuoiNhanVien;
        this.diaChiNhanVien = diaChiNhanVien;
    }

    public String getHoTenNhanVien() {
        return hoTenNhanVien;
    }

    public void setHoTenNhanVien(String hoTenNhanVien) {
        this.hoTenNhanVien = hoTenNhanVien;
    }

    public String getTuoiNhanVien() {
        return tuoiNhanVien;
    }

    public void setTuoiNhanVien(String tuoiNhanVien) {
        this.tuoiNhanVien = tuoiNhanVien;
    }

    public String getDiaChiNhanVien() {
        return diaChiNhanVien;
    }

    public void setDiaChiNhanVien(String diaChiNhanVien) {
        this.diaChiNhanVien = diaChiNhanVien;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hoTenNhanVien='" + hoTenNhanVien + '\'' +
                ", tuoiNhanVien='" + tuoiNhanVien + '\'' +
                ", diaChiNhanVien='" + diaChiNhanVien + '\'' +
                '}';
    }
}
