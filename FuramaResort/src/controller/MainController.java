package controller;

import commons.FileUtils;

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
            System.out.println("1.\t Add New Services\n" +
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
                case 8:
                    return;
            }

        } while (tuyChon >= 1 && tuyChon < 8);

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
                    return;
            }
        } while (tuyChon >= 1 && tuyChon < 5);
    }

    public static void addNewService(String fileName){

        scanner.nextLine();
        System.out.println("nhap id :");
        String id = scanner.nextLine();

        System.out.println("nhap ten dich vu :");
        String tenDichVu = scanner.nextLine();

        System.out.println("nhap dien tich su dung : ");
        double dienTichSuDung = scanner.nextDouble();

        System.out.println("nhap chi phi thue : ");
        double chiPhiThue = scanner.nextDouble();

        System.out.println("nhap so nguoi toi da :");
        int soNguoiToiDa = scanner.nextInt();

        scanner.nextLine();
        System.out.println("nhap kieu thue : ");
        String kieuThue = scanner.nextLine();

        FileUtils.setPath(fileName);

        if (fileName.equals(villa)){
            System.out.println("nhap tieu chuan phong : ");
            String tieuChuanPhong = scanner.nextLine();

            System.out.println("nhap mo ta tien nghi khac : ");
            String moTaTienNghiKhac = scanner.nextLine();

            System.out.println("nhap dien tich ho boi :");
            double dienTichHoBoi = scanner.nextDouble();

            System.out.println("nhap so tang :");
            int soTang = scanner.nextInt();

            FileUtils.writeFile(new String[] {id,tenDichVu, String.valueOf(dienTichSuDung),
                    String.valueOf(chiPhiThue), String.valueOf(soNguoiToiDa)
                    ,kieuThue,tieuChuanPhong,moTaTienNghiKhac,
                    String.valueOf(dienTichHoBoi), String.valueOf(soTang)});
        }else if (fileName.equals(house)){
            System.out.println("nhap tieu chuan phong : ");
            String tieuChuanPhong = scanner.nextLine();

            System.out.println("nhap mo ta tien nghi khac : ");
            String moTaTienNghiKhac = scanner.nextLine();

            System.out.println("nhap so tang :");
            int soTang = scanner.nextInt();

            FileUtils.writeFile(new String[] {id,tenDichVu, String.valueOf(dienTichSuDung),
                    String.valueOf(chiPhiThue), String.valueOf(soNguoiToiDa)
                    ,kieuThue,tieuChuanPhong,moTaTienNghiKhac
                    , String.valueOf(soTang)});
        }else if (fileName.equals(room)){
            System.out.println("nhap ten dich vu di kem :");
            String tenDichVuDiKem = scanner.nextLine();

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
