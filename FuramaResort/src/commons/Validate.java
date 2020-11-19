package commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String ID_REGEX = "^SV(VL|HO|RO)-\\d{4}$";
    private static final String TENDICHVU_REGEX = "^([A-Z]{1}[a-z]{1,}([ &a-z]*))$";
    private static final String DIENTICHSUDUNG_REGEX = "^[3-9]{1}\\d{1,}|.[0-9]$";
    private static final String DIENTICHHOBOI_REGEX = "^[3-9]{1}\\d{1,}|.[0-9]$";
    private static final String CHIPHITHUE_REGEX = "^[1-9]{1}\\d{0,}$";
    private static final String SOLUONGNGUOI_REGEX = "^([1-9]|1[0-9])$";
    private static final String DICHVUDIKEM_REGEX = "^(massge|karaoke|food|drink|car)$";
    private static final String SOTANG_REGEX = "^\\d{0,2}";
    private static final String KIEUTHUE_REGEX = "^[A-Z]{1}[a-z]{1,}$";
    private static final String TIEUCHUANPHONG_REGEX = "^[A-Z]{1}[a-z]{1,}$";
    private static final String NGAYSINH_REGEX = "^((((0[1-9]|[12]\\d|3[01])\\/(0[13578]|10|12))|((0[1-9]|[12]\\d|30)|\\" +
            "/([469]|11))|((0[1-9]|[12][0-8])\\/(02)))\\/((19([13579][^26]|[02468][^48]{2}))|(200[012]{1})))$|^((((0[1-9]|" +
            "[12]\\d|3[01])\\/(0[13578]|10|12))|((0[1-9]|[12]\\d|30)|\\/([469]|11))|((0[1-9]|[12]\\d)\\/(02)))\\/((19([13" +
            "579][26]|[02468][48]{2}))|(200[0]{1})))$";

    public Validate() {
    }

    public static boolean kiemTraId(String id){
        return id.matches(ID_REGEX);
    }
    public static boolean kiemTraTenDichVu(String tenDichVu){
        return tenDichVu.matches(TENDICHVU_REGEX);
    }
    public static boolean kiemTraDienTichSuDung(String dienTichSuDung){
        return Pattern.matches(DIENTICHSUDUNG_REGEX,dienTichSuDung);
    }
    public static boolean kiemTraDienTichHoBoi(String dienTichHoBoi){
        return dienTichHoBoi.matches(DIENTICHHOBOI_REGEX);
    }
    public static boolean kiemTraChiPhiThue(String chiPhiThue){
        return chiPhiThue.matches(CHIPHITHUE_REGEX);
    }
    public static boolean kiemTraSoLuongNguoi(String soLuongNguoi){
        return soLuongNguoi.matches(SOLUONGNGUOI_REGEX);
    }
    public static boolean kiemTraDichVuDiKem(String dichVuDiKem){
        return dichVuDiKem.matches(DICHVUDIKEM_REGEX);
    }
    public static boolean kiemTraSoTang(String soTang){
        return soTang.matches(SOTANG_REGEX);
    }
    public static boolean kiemTraKieuThue(String kieuThue){
        return kieuThue.matches(KIEUTHUE_REGEX);
    }
    public static boolean kiemTraTieuChuanPhong(String tieuChuanPhong){
        return tieuChuanPhong.matches(TIEUCHUANPHONG_REGEX);
    }
    public static boolean kiemTraNgaySinh(String ngaySinh){
        return ngaySinh.matches(NGAYSINH_REGEX);
    }

}
