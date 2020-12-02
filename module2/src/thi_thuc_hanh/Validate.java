package thi_thuc_hanh;

public class Validate {
    private static final String MASOSO = "^STK-00\\d{2}$";
    private static final String MAKHACHHANG = "^\\d{1,}$";
    private static final String NGAYMOSO = "^\\d{1,2}\\/\\d{1,2}\\/\\d{4}";
    private static final String SOTIENGUI = "^[1-9]{1}\\d{0,}$";
    private static final String LAISUAT = "^\\d{1,}|100";
    private static final String UUDAI = "^([\\w]+\\s)*([\\w]+)$";
    private static final String KYHAN = "^\\d{1,}$";

    public static boolean checkMaSoSo(String maSoSo){
        return maSoSo.matches(MASOSO);
    }
    public static boolean checkMaKhachHang(String maKhachHang){
        return maKhachHang.matches(MAKHACHHANG);
    }
    public static boolean checkNgayMoSo(String ngayMoSo){
        return ngayMoSo.matches(NGAYMOSO);
    }
    public static boolean checkSoTienGui(String soTienGui){
        return soTienGui.matches(SOTIENGUI);
    }
    public static boolean checkLaiSuat(String laiSuat){
        return laiSuat.matches(LAISUAT);
    }
    public static boolean checkUuDai(String uuDai){
        return uuDai.matches(UUDAI);
    }
    public static boolean checkKyHan(String kyHan){
        return kyHan.matches(KYHAN);
    }

}
