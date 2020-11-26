package models;

public class Customer {
    public String hoTen;
    public String ngaySinh;
    public String gioiTinh;
    public String cmnd;
    public String sdt;
    public String email;
    public String loaiKhach;
    public String diaChi;
    public Services thuocTinh;

    public Customer() {
    }

    public Customer(String hoTen, String ngaySinh, String gioiTinh, String cmnd, String sdt, String email,
                    String loaiKhach, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.sdt = sdt;
        this.email = email;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public Customer(String hoTen, String ngaySinh, String gioiTinh, String cmnd, String sdt, String email,
                    String loaiKhach, String diaChi, Services thuocTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.sdt = sdt;
        this.email = email;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
        this.thuocTinh = thuocTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Services getThuocTinh() {
        return thuocTinh;
    }

    public void setThuocTinh(Services thuocTinh) {
        this.thuocTinh = thuocTinh;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", sdt='" + sdt + '\'' +
                ", email='" + email + '\'' +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", thuocTinh='" + thuocTinh + '\'' +
                '}';
    }

    public void showInfor(){
        System.out.println(this.toString());
    }

//    @Override
//    public int compare(Customer o1, Customer o2){
//        return o1.getHoTen() > o2.getHoTen()? 1: -1;
//    }
}
