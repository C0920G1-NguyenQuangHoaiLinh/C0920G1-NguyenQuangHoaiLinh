package models;

public class DichVuDiKem {
    private String tenDichVuDiKem;
    private String donVi;
    private double giaTien;

    public DichVuDiKem(String tenDichVuDiKem, String donVi, double giaTien) {
        this.tenDichVuDiKem = tenDichVuDiKem;
        this.donVi = donVi;
        this.giaTien = giaTien;
    }

    public String getTenDichVuDiKem() {
        return tenDichVuDiKem;
    }

    public void setTenDichVuDiKem(String tenDichVuDiKem) {
        this.tenDichVuDiKem = tenDichVuDiKem;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return "DichVuDiKem{" +
                "tenDichVuDiKem='" + tenDichVuDiKem + '\'' +
                ", donVi='" + donVi + '\'' +
                ", giaTien=" + giaTien +
                '}';
    }
}
