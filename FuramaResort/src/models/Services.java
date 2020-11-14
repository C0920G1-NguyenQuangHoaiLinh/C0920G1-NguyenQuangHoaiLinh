package models;

public abstract class Services {
    public String id;
    public String tenDichVu;
    public double dienTichSuDung;
    public double chiPhiThue;
    public int soLuongNguoiToiDa;
    public String kieuThue;

    public Services(String id, String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue) {
        this.id = id;
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", chiPhiThue=" + chiPhiThue +
                ", soLuongNguoiToiDa=" + soLuongNguoiToiDa +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }

    public abstract void showInfor();

}
