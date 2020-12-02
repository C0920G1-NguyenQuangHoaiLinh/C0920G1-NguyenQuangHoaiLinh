package thi_thuc_hanh;

public class CoThoiHan extends SoTietKiem {
    public String kyHan;

    public CoThoiHan() {
    }

    public CoThoiHan(String maSoSo, String maKhachHang, String ngayMoSo, String thoiGianBatDauGui, String soTienGui,
                     String laiSuat, String kyHan) {
        super(maSoSo, maKhachHang, ngayMoSo, thoiGianBatDauGui, soTienGui, laiSuat);
        this.kyHan = kyHan;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    @Override
    public String toString() {
        return super.toString()+"coThoiHan{" +
                "kyHan='" + kyHan + '\'' +
                '}';
    }
}
