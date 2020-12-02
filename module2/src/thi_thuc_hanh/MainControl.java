package thi_thuc_hanh;

import case_study.bai_tap_2.Main;
import case_study.bai_tap_3.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainControl {
    static List<SoTietKiem> soTietKiemList = new ArrayList<SoTietKiem>();
    Scanner scanner = new Scanner(System.in);
    private static String daiHan = "DaiHan";
    private static String nganHan = "NganHan";
    private static String shortTerm = "shorTerm";
    private static String longTerm = "longTerm";

    public void themMoiSTK(String fileName){
        SoTietKiem soTietKiem = new SoTietKiem();

        System.out.println("Nhập ma so so : ");
        String maSoSo = scanner.nextLine();
        while (!Validate.checkMaSoSo(maSoSo)){
            System.err.println("du lieu khong dung ! ");
            System.out.println("Nhập ma so so : ");
            maSoSo = scanner.nextLine();
            Validate.checkMaSoSo(maSoSo);
        }

        System.out.println("Nhap ma khach hang : ");
        String maKhachHang = scanner.nextLine();
        while (!Validate.checkMaKhachHang(maKhachHang)){
            System.err.println("du lieu khong dung ! ");
            System.out.println("Nhập ma khach hang: ");
            maKhachHang = scanner.nextLine();
            Validate.checkMaKhachHang(maKhachHang);
        }

        System.out.println("Nhap ngay mo so : ");
        String ngayMoSo = scanner.nextLine();
        while (!Validate.checkNgayMoSo(ngayMoSo)){
            System.err.println("du lieu khong dung ! ");
            System.out.println("Nhap ngay mo so : ");
            ngayMoSo = scanner.nextLine();
            Validate.checkNgayMoSo(ngayMoSo);
        }

        System.out.println("Nhap thoi gian bat dau gui : ");
        String thoiGianBatDauGui = scanner.nextLine();

        System.out.println("Nhap so tien gui : ");
        String soTienGui = scanner.nextLine();
        while (!Validate.checkSoTienGui(soTienGui)){
            System.err.println("du lieu khong dung ! ");
            System.out.println("Nhap so tien gui : ");
            soTienGui = scanner.nextLine();
            Validate.checkSoTienGui(soTienGui);
        }

        System.out.println("Nhap lai suat : ");
        String laiSuat = scanner.nextLine();
        while (!Validate.checkLaiSuat(laiSuat)){
            System.err.println("du lieu khong dung ! ");
            System.out.println("Nhap lai suat : ");
            laiSuat = scanner.nextLine();
            Validate.checkLaiSuat(laiSuat);
        }

        if (fileName.equals(daiHan)){
            System.out.println("Nhap ky han ");
            String kyHan = scanner.nextLine();
            while (!Validate.checkKyHan(kyHan)){
                System.err.println("du lieu khong dung ! ");
                System.out.println("Nhap ky han ");
                kyHan = scanner.nextLine();
                Validate.checkKyHan(kyHan);
            }

            System.out.println("Nhap uu dai ");
            String uuDai = scanner.nextLine();
            while (!Validate.checkUuDai(uuDai)){
                System.err.println("du lieu khong dung ! ");
                System.out.println("Nhap uu dai ");
                uuDai = scanner.nextLine();
                Validate.checkUuDai(uuDai);
            }
            FileUtils.setPath(longTerm);
            FileUtils.writeFile(new String[] {maSoSo,maKhachHang,ngayMoSo,thoiGianBatDauGui,soTienGui,laiSuat,kyHan,uuDai});
            soTietKiem.setMaSoSo(maSoSo);
            soTietKiem.setMaKhachHang(maKhachHang);
            soTietKiem.setNgayMoSo(ngayMoSo);
            soTietKiem.setThoiGianBatDauGui(thoiGianBatDauGui);
            soTietKiem.setSoTienGui(soTienGui);
            soTietKiem.setLaiSuat(laiSuat);
            ((DaiHan) soTietKiem).setKyHan(kyHan);
            ((DaiHan) soTietKiem).setUuDai(uuDai);
        }else if (fileName.equals(nganHan)){
            int choose = scanner.nextInt();
            System.out.println("1. Vo thoi han ");
            System.out.println("2. Co thoi han ");
            FileUtils.setPath(shortTerm);
            switch (choose){
                case 1:
                    FileUtils.setPath(shortTerm);
                    FileUtils.writeFile(new String[] {maSoSo,maKhachHang,ngayMoSo,thoiGianBatDauGui,soTienGui,laiSuat});
                    break;
                case 2:
                    System.out.println("Nhap ky han ");
                    String kyHan = scanner.nextLine();
                    while (!Validate.checkKyHan(kyHan)){
                        System.err.println("du lieu khong dung ! ");
                        System.out.println("Nhap ky han ");
                        kyHan = scanner.nextLine();
                        Validate.checkKyHan(kyHan);
                    }
                    FileUtils.setPath(shortTerm);
                    FileUtils.writeFile(new String[]{maSoSo,maKhachHang,ngayMoSo,thoiGianBatDauGui,soTienGui,laiSuat,kyHan});
                    ((CoThoiHan) soTietKiem).setKyHan(kyHan);
                    break;
                default:
                    return;
            }
            soTietKiem.setMaSoSo(maSoSo);
            soTietKiem.setMaKhachHang(maKhachHang);
            soTietKiem.setNgayMoSo(ngayMoSo);
            soTietKiem.setThoiGianBatDauGui(thoiGianBatDauGui);
            soTietKiem.setSoTienGui(soTienGui);
            soTietKiem.setLaiSuat(laiSuat);
        }
        soTietKiemList.add(soTietKiem);
        String[] temp ;
        for (SoTietKiem soTietKiem1 :soTietKiemList) {
            temp = soTietKiem1.toString().split(",");
            FileUtils.writeFile(temp);
        }
        System.out.println("Them thanh cong ! ");
    }

    public void xoaSoTietKiem(){
        System.out.println("nhap ma so so tiet kiem muon xoa : ");
        String temp = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < soTietKiemList.size(); i++) {
            if (soTietKiemList.get(i).getMaSoSo().equals(temp)) {
                System.out.println("Xác nhận ? nhập 'y' !");
                if (scanner.nextLine().equals("y")) {
                    soTietKiemList.remove(soTietKiemList.get(i));
                } else if (scanner.nextLine().equals("")) {
                    MainMenu.displayMenu();
                }
                check = true;
            }
        }
        if (!check){
            System.err.println("Không tìm được ma so so.");
            System.out.println("Enter để quay lại menu hoặc nhập ký tự khác để quay lại chức năng xóa !");
            if (scanner.nextLine().equals("")) {
                MainMenu.displayMenu();
            } else {
                xoaSoTietKiem();
            }
        }
    }
}
