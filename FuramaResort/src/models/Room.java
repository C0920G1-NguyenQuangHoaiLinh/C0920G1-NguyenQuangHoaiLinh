package models;

public class Room extends Services {
    private DichVuDiKem dichVuDiKem;

    public Room() {
    }

    public Room(String id, String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, DichVuDiKem dichVuDiKem) {
        super(id, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.dichVuDiKem = dichVuDiKem;
    }

    public DichVuDiKem getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(DichVuDiKem dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dichVuDiKem=" + dichVuDiKem +
                '}' + super.toString();
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
