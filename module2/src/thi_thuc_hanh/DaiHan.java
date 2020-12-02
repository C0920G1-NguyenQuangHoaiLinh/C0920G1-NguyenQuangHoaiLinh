package thi_thuc_hanh;

public class DaiHan extends SoTietKiem{
    public String kyHan;
    public String uuDai;

    public DaiHan() {
    }

    public DaiHan(String maSoSo, String maKhachHang, String ngayMoSo, String thoiGianBatDauGui,
                  String soTienGui, String laiSuat, String kyHan, String uuDai) {
        super(maSoSo, maKhachHang, ngayMoSo, thoiGianBatDauGui, soTienGui, laiSuat);
        this.kyHan = kyHan;
        this.uuDai = uuDai;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    public String getUuDai() {
        return uuDai;
    }

    public void setUuDai(String uuDai) {
        this.uuDai = uuDai;
    }

    @Override
    public String toString() {
        return super.toString()+"daiHan {" +
                "kyHan='" + kyHan + '\'' +
                ", uuDai='" + uuDai + '\'' +
                '}';
    }
}
