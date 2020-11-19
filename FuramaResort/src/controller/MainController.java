package controller;

import commons.FileUtils;
import commons.Validate;
import models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    private static String villa = "villa";
    private static String house = "house";
    private static String room = "room";
    public static void main(String[] args) {
        MainController.displayMainMenu();
    }

    public static void displayMainMenu() {
        int tuyChon = 0;
        do {
            System.out.println("1.\tAdd New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tExit\n");

            System.out.println("Nhập số thứ tự của chức năng muốn chọn 1 - 7");
            tuyChon = scanner.nextInt();
            switch (tuyChon) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInformationOfCustomer();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showInformationOfEmployee();
                    break;
                case 7:
                    return;
            }
        }while (tuyChon >= 1 && tuyChon < 7);
    }

    private static void showInformationOfEmployee() {

    }

    private static void addNewBooking() {

    }

    private static void showInformationOfCustomer() {

    }

    private static void addNewCustomer() {

    }

    private static void showServices() {
        int tuyChon;
        do {
            System.out.println("1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");
            System.out.println("chon chuc nang 1-8");
            tuyChon = scanner.nextInt();
            switch (tuyChon){
                case 1:
                    showAllService(villa);
                    break;
                case 2:
                    showAllService(house);
                    break;
                case 3:
                    showAllService(room);
                    break;
                case 4:
                    showNotDuplicate(villa);
                    displayMainMenu();
                    break;
                case 5:
                    showNotDuplicate(house);
                    displayMainMenu();
                    break;
                case 6:
                    showNotDuplicate(room);
                    displayMainMenu();
                    break;
                case 7:
                    displayMainMenu();
                    break;
                case 8:
                    System.exit(0);
                    return;
            }

        } while (tuyChon >= 1 && tuyChon < 8);

    }



    private static void showNotDuplicate(String fileName) {
    }

    private static void showAllService(String fileName) {
        if (fileName.equals(villa)){
            File csvVilla = new File("src/data/villa.csv");
            String line = null;
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(csvVilla));
                while ((line = bufferedReader.readLine()) != null){
                    String[] arrVilla = line.split(",");
                    System.out.println(arrVilla[0] + arrVilla[1] + arrVilla[2] + arrVilla[3] + arrVilla[4] + arrVilla[5]
                            + arrVilla[6] + arrVilla[7] + arrVilla[8] + arrVilla[9]);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        if (fileName.equals(house)){
            File csvHouse = new File("src/data/house.csv");
            String line = null;
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(csvHouse));
                while ((line = bufferedReader.readLine()) != null){
                    String[] arrHouse = line.split(",");
                    System.out.println(arrHouse[0] + arrHouse[1] + arrHouse[2] + arrHouse[3] + arrHouse[4] + arrHouse[5]
                            + arrHouse[6] + arrHouse[7] + arrHouse[8]);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        if (fileName.equals(room)){
            File csvRoom = new File("src/data/room.csv");
            String line = null;
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(csvRoom));
                while ((line = bufferedReader.readLine()) != null){
                    String[] arrRoom = line.split(",");
                    System.out.println(arrRoom[0] + arrRoom[1] + arrRoom[2] + arrRoom[3] + arrRoom[4] + arrRoom[5]
                            + arrRoom[6] + arrRoom[7] + arrRoom[8]);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private static void addNewServices() {
        int tuyChon ;
        do {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            System.out.println("chon chuc nang 1-5");
            tuyChon = scanner.nextInt();
            switch (tuyChon) {
                case 1:
                    addNewService(villa);
                    break;
                case 2:
                    addNewService(house);
                    break;
                case 3:
                    addNewService(room);
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    System.exit(0);
                    return;
            }
        } while (tuyChon >= 1 && tuyChon < 5);
    }

    public static void addNewService(String fileName){
        scanner.nextLine();
        System.out.println("nhap id :");
        String id = scanner.nextLine();
        Validate.kiemTraId(id);
        while (!Validate.kiemTraId(id)){
            System.out.println("id khong dung ! vd:SVXX-YYYY ");
            System.out.println("nhap id :");
            id = scanner.nextLine();
            Validate.kiemTraId(id);
        }

        System.out.println("nhap ten dich vu :");
        String tenDichVu = scanner.nextLine();
        Validate.kiemTraTenDichVu(tenDichVu);
        while (!Validate.kiemTraTenDichVu(tenDichVu)){
            System.out.println("ten dich vu khong dung :");
            System.out.println("nhap ten dich vu :");
            tenDichVu = scanner.nextLine();
            Validate.kiemTraTenDichVu(tenDichVu);
        }

        System.out.println("nhap dien tich su dung : ");
        double dienTichSuDung = scanner.nextDouble();
        Validate.kiemTraDienTichSuDung(String.valueOf(dienTichSuDung));
        while (!Validate.kiemTraDienTichSuDung(String.valueOf(dienTichSuDung))){
            System.out.println("dien tich su dung khong dung : ");
            System.out.println("nhap dien tich su dung : ");
            dienTichSuDung = scanner.nextDouble();
            Validate.kiemTraDienTichSuDung(String.valueOf(dienTichSuDung));
        }

        System.out.println("nhap chi phi thue : ");
        double chiPhiThue = scanner.nextDouble();
        Validate.kiemTraChiPhiThue(String.valueOf(chiPhiThue));
        while (!Validate.kiemTraChiPhiThue(String.valueOf(chiPhiThue))){
            System.out.println("chi phi thue khong dung : ");
            System.out.println("nhap chi phi thue : ");
            chiPhiThue = scanner.nextDouble();
            Validate.kiemTraChiPhiThue(String.valueOf(chiPhiThue));
        }

        System.out.println("nhap so nguoi toi da :");
        int soNguoiToiDa = scanner.nextInt();
        Validate.kiemTraSoLuongNguoi(String.valueOf(soNguoiToiDa));
        while (!Validate.kiemTraSoLuongNguoi(String.valueOf(soNguoiToiDa))){
            System.out.println("so nguoi khong dung : ");
            System.out.println("nhap so nguoi toi da :");
            soNguoiToiDa = scanner.nextInt();
            Validate.kiemTraSoLuongNguoi(String.valueOf(soNguoiToiDa));
        }

        scanner.nextLine();
        System.out.println("nhap kieu thue : ");
        String kieuThue = scanner.nextLine();
        Validate.kiemTraKieuThue(kieuThue);
        while (!Validate.kiemTraKieuThue(kieuThue)){
            System.out.println("kieu thue khong dung : ");
            System.out.println("nhap kieu thue : ");
            kieuThue = scanner.nextLine();
        }

        FileUtils.setPath(fileName);

        if (fileName.equals(villa)){
            System.out.println("nhap tieu chuan phong : ");
            String tieuChuanPhong = scanner.nextLine();
            Validate.kiemTraTieuChuanPhong(tieuChuanPhong);
            while (!Validate.kiemTraTieuChuanPhong(tieuChuanPhong)){
                System.out.println("tieu chuan phong khong dung : ");
                System.out.println("nhap tieu chuan phong : ");
                tieuChuanPhong = scanner.nextLine();
                Validate.kiemTraTieuChuanPhong(tieuChuanPhong);
            }

            System.out.println("nhap mo ta tien nghi khac : ");
            String moTaTienNghiKhac = scanner.nextLine();

            System.out.println("nhap dien tich ho boi :");
            double dienTichHoBoi = scanner.nextDouble();
            Validate.kiemTraDienTichHoBoi(String.valueOf(dienTichHoBoi));
            while (!Validate.kiemTraDienTichHoBoi(String.valueOf(dienTichHoBoi))){
                System.out.println("dien tich ho boi khong dung : ");
                System.out.println("nhap dien tich ho boi :");
                dienTichHoBoi = scanner.nextDouble();
                Validate.kiemTraDienTichHoBoi(String.valueOf(dienTichHoBoi));
            }

            System.out.println("nhap so tang :");
            int soTang = scanner.nextInt();
            Validate.kiemTraSoTang(String.valueOf(soTang));
            while (!Validate.kiemTraSoTang(String.valueOf(soTang))){
                System.out.println("so tang khong dung : ");
                System.out.println("nhap so tang :");
                soTang = scanner.nextInt();
                Validate.kiemTraSoTang(String.valueOf(soTang));
            }

            FileUtils.writeFile(new String[] {id,tenDichVu, String.valueOf(dienTichSuDung),
                    String.valueOf(chiPhiThue), String.valueOf(soNguoiToiDa)
                    ,kieuThue,tieuChuanPhong,moTaTienNghiKhac,
                    String.valueOf(dienTichHoBoi), String.valueOf(soTang)});

        }else if (fileName.equals(house)){
            System.out.println("nhap tieu chuan phong : ");
            String tieuChuanPhong = scanner.nextLine();
            Validate.kiemTraTieuChuanPhong(tieuChuanPhong);
            while (!Validate.kiemTraTieuChuanPhong(tieuChuanPhong)){
                System.out.println("tieu chuan phong khong dung : ");
                System.out.println("nhap tieu chuan phong : ");
                tieuChuanPhong = scanner.nextLine();
                Validate.kiemTraTieuChuanPhong(tieuChuanPhong);
            }

            System.out.println("nhap mo ta tien nghi khac : ");
            String moTaTienNghiKhac = scanner.nextLine();

            System.out.println("nhap so tang :");
            int soTang = scanner.nextInt();
            Validate.kiemTraSoTang(String.valueOf(soTang));
            while (!Validate.kiemTraSoTang(String.valueOf(soTang))){
                System.out.println("so tang khong dung : ");
                System.out.println("nhap so tang :");
                soTang = scanner.nextInt();
                Validate.kiemTraSoTang(String.valueOf(soTang));
            }

            FileUtils.writeFile(new String[] {id,tenDichVu, String.valueOf(dienTichSuDung),
                    String.valueOf(chiPhiThue), String.valueOf(soNguoiToiDa)
                    ,kieuThue,tieuChuanPhong,moTaTienNghiKhac
                    , String.valueOf(soTang)});

        }else if (fileName.equals(room)){
            System.out.println("nhap ten dich vu di kem :");
            String tenDichVuDiKem = scanner.nextLine();
            Validate.kiemTraDichVuDiKem(tenDichVuDiKem);
            while (!Validate.kiemTraDichVuDiKem(tenDichVuDiKem)){
                System.out.println("ten dich vu di kem khong dung : ");
                System.out.println("nhap ten dich vu di kem :");
                tenDichVuDiKem = scanner.nextLine();
                Validate.kiemTraDichVuDiKem(tenDichVuDiKem);
            }

            System.out.println("nhap don vi :");
            String donVi = scanner.nextLine();

            System.out.println("nhap gia tien :");
            double giaTien = scanner.nextDouble();

            FileUtils.writeFile(new String[] {id,tenDichVu, String.valueOf(dienTichSuDung),
                    String.valueOf(chiPhiThue), String.valueOf(soNguoiToiDa)
                    ,kieuThue,tenDichVuDiKem,donVi, String.valueOf(giaTien)});
        }
    }
}
