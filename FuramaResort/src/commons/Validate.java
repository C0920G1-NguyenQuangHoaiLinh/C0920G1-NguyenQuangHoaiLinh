package commons;

import models.House;
import models.Room;
import models.Villa;

import java.util.regex.Pattern;

public class Validate {
    private static String ID_REGEX = "^SV(VL|HO|RO)-\\d{4}$";
    private static final String TENDICHVU_REGEX = "^([A-Z]{1}[a-z]{1,}([ &a-z]*))$";
    private static final String DIENTICHSUDUNG_REGEX = "^(([3-9]{1}\\d{1,})|([12][\\d]{2,}))[.]\\d+$";
    private static final String DIENTICHHOBOI_REGEX = "^(([3-9]{1}\\d{1,})|([12][\\d]{2,}))[.]\\d+$";
    private static final String CHIPHITHUE_REGEX = "^[1-9]{1}\\d{0,}$";
    private static final String SOLUONGNGUOI_REGEX = "^([1-9]|1[0-9])$";
    private static final String DICHVUDIKEM_REGEX = "^(massge|karaoke|food|drink|car)$";
    private static final String SOTANG_REGEX = "^\\d{0,2}";
    private static final String KIEUTHUE_REGEX = "^[A-Z]{1}[a-z]{1,}$";
    private static final String TIEUCHUANPHONG_REGEX = "^[A-Z]{1}[a-z]{1,}$";
    private static final String NGAYSINH_REGEX = "^((((0[1-9]|[12]\\d|3[01])\\/(0[13578]|10|12))|((0[1-9]|[12]\\d|30)\\" +
            "/([469]|11))|((0[1-9]|[12][0-8])\\/(02)))\\/((19([13579][^26]|[02468][^48]{2}))|(200[012]{1})))$|^((((0[1-9]|" +
            "[12]\\d|3[01])\\/(0[13578]|10|12))|((0[1-9]|[12]\\d|30)\\/([469]|11))|((0[1-9]|[12]\\d)\\/(02)))\\/((19([13" +
            "579][26]|[02468][48]{2}))|(200[0]{1})))$";

    private static String tenRegex = "^[A-Z][a-z]+([ ][A-Z][a-z]*)+$";
    private static String emailRegex = "^[\\w]{1,}[\\w.+-]{0,}@[\\w-]{2,}([.][a-zA-Z]{2,}|[.][\\w-]{2,}[.][a-zA-Z]{2,})$";
    private static String gioiTinhRegex = "^([Nn][a][m]|[Nn][u]|[Bb][e][d][e])$";
    private static String cmndRegex = "^\\d{9}$";

    public Validate() {
    }

    public static boolean kiemTraId(String id, Object service) {
        if (service instanceof Villa) {
            ID_REGEX = "^SVVL-\\d{4}";
        } else if (service instanceof House) {
            ID_REGEX = "^SVHO-\\d{4}";
        } else if (service instanceof Room) {
            ID_REGEX = "^SVRO-\\d{4}";
        }
        return id.matches(ID_REGEX);
    }

    public static boolean kiemTraTenDichVu(String tenDichVu) {
        return tenDichVu.matches(TENDICHVU_REGEX);
    }

    public static boolean kiemTraDienTichSuDung(String dienTichSuDung) {
        return Pattern.matches(DIENTICHSUDUNG_REGEX, dienTichSuDung);
    }

    public static boolean kiemTraDienTichHoBoi(String dienTichHoBoi) {
        return dienTichHoBoi.matches(DIENTICHHOBOI_REGEX);
    }

    public static boolean kiemTraChiPhiThue(String chiPhiThue) {
        return chiPhiThue.matches(CHIPHITHUE_REGEX);
    }

    public static boolean kiemTraSoLuongNguoi(String soLuongNguoi) {
        return soLuongNguoi.matches(SOLUONGNGUOI_REGEX);
    }

    public static boolean kiemTraDichVuDiKem(String dichVuDiKem) {
        return dichVuDiKem.matches(DICHVUDIKEM_REGEX);
    }

    public static boolean kiemTraSoTang(String soTang) {
        return soTang.matches(SOTANG_REGEX);
    }

    public static boolean kiemTraKieuThue(String kieuThue) {
        return kieuThue.matches(KIEUTHUE_REGEX);
    }

    public static boolean kiemTraTieuChuanPhong(String tieuChuanPhong) {
        return tieuChuanPhong.matches(TIEUCHUANPHONG_REGEX);
    }

    public static boolean kiemTraNgaySinh(String ngaySinh) {
        return ngaySinh.matches(NGAYSINH_REGEX);
    }

    public static boolean kiemTraTen(String hoTen) {
        return hoTen.matches(tenRegex);
    }

    public static boolean kiemTraEmail(String email) {
        return email.matches(emailRegex);
    }

    public static boolean kiemTraGioiTinh(String gioiTinh){
        return gioiTinh.matches(gioiTinhRegex);
    }

    public static boolean kiemTraCmnd(String cmnd){
        return cmnd.matches(cmndRegex);
    }
}
