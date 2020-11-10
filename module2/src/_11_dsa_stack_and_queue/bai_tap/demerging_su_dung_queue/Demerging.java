package _11_dsa_stack_and_queue.bai_tap.demerging_su_dung_queue;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Demerging {
    public static void main(String[] args) {
        Queue<NhanVien> NU = new LinkedList();
        Queue<NhanVien> NAM = new LinkedList();


        List<NhanVien> danhSachNhanVien = new LinkedList<>();

        NhanVien nhanVien1 = new NhanVien("An", "Nam", "06/11/2000");
        NhanVien nhanVien2 = new NhanVien("Binh", "Nam", "22/06/1999");
        NhanVien nhanVien3 = new NhanVien("Chi", "Nu", "11/03/1997");
        NhanVien nhanVien4 = new NhanVien("Duyen", "Nu", "21/02/1997");

        danhSachNhanVien.add(nhanVien1);
        danhSachNhanVien.add(nhanVien2);
        danhSachNhanVien.add(nhanVien3);
        danhSachNhanVien.add(nhanVien4);

        for (NhanVien nhanVien : danhSachNhanVien) {
            if (nhanVien.getGioiTinh() == "Nu") {
                NU.add(nhanVien);
            } else if (nhanVien.getGioiTinh() == "Nam") {
                NAM.add(nhanVien);
            }
        }

        LinkedList<NhanVien> ketQua = new LinkedList<>();
        while (!NU.isEmpty()) {
            ketQua.add(NU.poll());
        }
        while (!NAM.isEmpty()) {
            ketQua.add(NAM.poll());
        }
        for (NhanVien i: ketQua){
            System.out.println(i.toString());
        }
    }
}
