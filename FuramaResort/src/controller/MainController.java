package controller;

import commons.*;
import models.*;

import java.util.*;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    private static String villa = "villa";
    private static String house = "house";
    private static String room = "room";
    private static String customer = "customer";
    private static String employee = "Employee";

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
                    addNewCustomer(customer);
                    break;
                case 4:
                    showInformationOfCustomer(customer);
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showInformationOfEmployee(employee);
                    break;
                case 7:
                    return;
            }
        } while (tuyChon >= 1 && tuyChon < 7);
    }

    private static Map<Integer, Employee> readEmployee(String fileName) {
        FileUtils.setPath(fileName);
        List<String> strReadEmployee = FileUtils.readFile();
//        List<Employee> listEmployee = new ArrayList<>();
        Map<Integer, Employee> mapEmployee = new HashMap<Integer, Employee>();

        String[] temp = null;
        Employee employee = null;
        int i = 1;
        for (String str : strReadEmployee) {
            temp = str.split(",");
            employee = new Employee();
            employee.setHoTenNhanVien(temp[0]);
            employee.setTuoiNhanVien(temp[1]);
            employee.setDiaChiNhanVien(temp[2]);

//            listEmployee.add(employee);
            mapEmployee.put(i, employee);
            i++;
        }
        return mapEmployee;
    }

    private static void showInformationOfEmployee(String fileName) {
        System.out.println("Danh sach nhan vien : ");
        Map<Integer, Employee> employeeMap = readEmployee(fileName);
        System.out.println(employeeMap.entrySet());
    }

    private static void addNewBooking() {
        List<Customer> listCustomer = readCustomer(customer);
        showInformationOfCustomer(customer);
        System.out.println("Chọn customer ");
        int chooseCustomer = scanner.nextInt();

        System.out.println("1.\tBooking Villa\n2.\tBooking House\n3.\tBooking Room");
        System.out.println("chọn mục booking 1-3");
        int chooseBooking = scanner.nextInt();
        List<Services> servicesList = null;
        switch (chooseBooking) {
            case 1:
                servicesList = readServices(villa);
                showAllService(villa);
                break;
            case 2:
                servicesList = readServices(house);
                showAllService(house);
                break;
            case 3:
                servicesList = readServices(room);
                showAllService(room);
                break;
        }
        Customer customer = listCustomer.get(chooseCustomer - 1);
        customer.setThuocTinh(servicesList.get(chooseBooking - 1));

        FileUtils.setPath("Booking");
        FileUtils.writeFile(new String[]{customer.toString()});

    }

    private static List<Customer> readCustomer(String fileName) {
        FileUtils.setPath(fileName);
        List<String> strReadCustomer = FileUtils.readFile();
        List<Customer> listCustomer = new ArrayList<>();

        String[] temp = null;
        Customer customer = null;
        for (String str : strReadCustomer) {
            temp = str.split(",");
            customer = new Customer();
            customer.setHoTen(temp[0]);
            customer.setNgaySinh(temp[1]);
            customer.setGioiTinh(temp[2]);
            customer.setCmnd(temp[3]);
            customer.setSdt(temp[4]);
            customer.setEmail(temp[5]);
            customer.setLoaiKhach(temp[6]);
            customer.setDiaChi(temp[7]);

            listCustomer.add(customer);
            Collections.sort(listCustomer, new NameCustomerComparator());
        }
        return listCustomer;
    }

    private static void showInformationOfCustomer(String fileName) {
        System.out.println("Danh sach customer : ");
        Customer customer = null;
        for (int i = 0; i < readCustomer(fileName).size(); i++) {
            customer = readCustomer(fileName).get(i);
            System.out.println((i + 1) + ". ");
            customer.showInfor();
        }
    }

    private static void addNewCustomer(String fileName) {
        scanner.nextLine();
        System.out.println("nhap ten khach hang : ");
        String hoTen = scanner.nextLine();
        Validate.kiemTraTen(hoTen);
        while (!(Validate.kiemTraTen(hoTen))) {
            System.err.println(new NameException());
            System.out.println("nhap ten khach hang : ");
            hoTen = scanner.nextLine();
            Validate.kiemTraTen(hoTen);
        }

        System.out.println("nhap ngay sinh : ");
        String ngaySinh = scanner.nextLine();
        Validate.kiemTraNgaySinh(ngaySinh);
        while (!(Validate.kiemTraNgaySinh(ngaySinh))) {
            System.err.println(new BirthdayException());
            System.out.println("nhap ngay sinh : ");
            ngaySinh = scanner.nextLine();
            Validate.kiemTraNgaySinh(ngaySinh);
        }

        System.out.println("nhap gioi tinh (Nam/Nu) : ");
        String gioiTinh = scanner.nextLine();
        Validate.kiemTraGioiTinh(gioiTinh);
        while (!(Validate.kiemTraGioiTinh(gioiTinh))) {
            System.err.print(new GenderException());
            System.out.println("nhap gioi tinh (Nam/Nu/Bede) : ");
            gioiTinh = scanner.nextLine();
            Validate.kiemTraGioiTinh(gioiTinh);
        }

        System.out.println("nhap so cmnd (9 so): ");
        String cmnd = scanner.nextLine();
        Validate.kiemTraCmnd(cmnd);
        while (!(Validate.kiemTraCmnd(cmnd))) {
            System.err.print(new IdCardException());
            System.out.println("nhap so cmnd (9 so): ");
            cmnd = scanner.nextLine();
            Validate.kiemTraCmnd(cmnd);
        }

        System.out.println("nhap so dien thoai : ");
        String sdt = scanner.nextLine();

        System.out.println("nhap email : ");
        String email = scanner.nextLine();
        Validate.kiemTraEmail(email);
        while (!(Validate.kiemTraEmail(email))) {
            System.err.print(new EmailException());
            System.out.println("nhap email : ");
            email = scanner.nextLine();
            Validate.kiemTraEmail(email);
        }

        System.out.println("nhap loai khach hang : ");
        String loaiKhach = scanner.next();

        scanner.nextLine();
        System.out.println("nhap dia chi : ");
        String diaChi = scanner.nextLine();

        System.out.println("nhap thuoc tinh : ");
        String thuocTinh = scanner.nextLine();

        FileUtils.setPath(fileName);
        FileUtils.writeFile(new String[]{hoTen, ngaySinh, gioiTinh, cmnd, sdt, email, loaiKhach, diaChi, thuocTinh});
    }

    private static void showServices() {
        int tuyChon;
        do {
            System.out.println("1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Room Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");
            System.out.println("chon chuc nang 1-8");
            tuyChon = scanner.nextInt();
            switch (tuyChon) {
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
        TreeSet<Services> treeSetServices = new TreeSet<>();
        if (fileName.equals(villa)) {
            treeSetServices.addAll(readServices(villa));
        } else if (fileName.equals(house)) {
            treeSetServices.addAll(readServices(house));
        } else if (fileName.equals(room)) {
            treeSetServices.addAll(readServices(room));
        }
        Iterator<Services> iterator = treeSetServices.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "\n");
        }
    }

    private static List<Services> readServices(String fileName) {
        FileUtils.setPath(fileName);
        List<String> stringList = FileUtils.readFile();
        List<Services> listServices = new ArrayList<>();

        String[] temp = null;
        Services services = null;
        DichVuDiKem dichVuDiKem = null;
        for (String string : stringList) {
            temp = string.split(",");
            if (fileName.equals(villa)) {
                services = new Villa();
                ((Villa) services).setTieuChuanPhong(temp[6]);
                ((Villa) services).setMoTaTienNghiKhac(temp[7]);
                ((Villa) services).setDienTichHoBoi(temp[8]);
                ((Villa) services).setSoTang(temp[9]);
            } else if (fileName.equals(house)) {
                services = new House();
                ((House) services).setTieuChuanPhong(temp[6]);
                ((House) services).setMoTaTienNghiKhac(temp[7]);
                ((House) services).setSoTang(temp[8]);
            } else if (fileName.equals(room)) {
                dichVuDiKem = new DichVuDiKem(temp[6], temp[7], Double.parseDouble(temp[8]));
                services = new Room();
                ((Room) services).setDichVuDiKem(dichVuDiKem);
            }
            services.setId(temp[0]);
            services.setTenDichVu(temp[1]);
            services.setDienTichSuDung(Double.parseDouble(temp[2]));
            services.setChiPhiThue(Double.parseDouble(temp[3]));
            services.setSoLuongNguoiToiDa(temp[4]);
            services.setKieuThue(temp[5]);

            listServices.add(services);
        }
        return listServices;
    }

    private static void showAllService(String fileName) {
        System.out.println("-----------------------");
        System.out.println("Danh sach services");
        Services services = null;
        for (int i = 0; i < readServices(fileName).size(); i++) {
            services = readServices(fileName).get(i);
            System.out.println((i + 1) + ". ");
            services.showInfor();
        }
//        if (fileName.equals(villa)) {
//            File csvVilla = new File("src/data/villa.csv");
//            String line = null;
//            try {
//                BufferedReader bufferedReader = new BufferedReader(new FileReader(csvVilla));
//                while ((line = bufferedReader.readLine()) != null) {
//                    String[] arrVilla = line.split(",");
//                    System.out.println(arrVilla[0] + arrVilla[1] + arrVilla[2] + arrVilla[3] + arrVilla[4] + arrVilla[5]
//                            + arrVilla[6] + arrVilla[7] + arrVilla[8] + arrVilla[9]);
//                }
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//
//        if (fileName.equals(house)) {
//            File csvHouse = new File("src/data/house.csv");
//            String line = null;
//            try {
//                BufferedReader bufferedReader = new BufferedReader(new FileReader(csvHouse));
//                while ((line = bufferedReader.readLine()) != null) {
//                    String[] arrHouse = line.split(",");
//                    System.out.println(arrHouse[0] + arrHouse[1] + arrHouse[2] + arrHouse[3] + arrHouse[4] + arrHouse[5]
//                            + arrHouse[6] + arrHouse[7] + arrHouse[8]);
//                }
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//
//        if (fileName.equals(room)) {
//            File csvRoom = new File("src/data/room.csv");
//            String line = null;
//            try {
//                BufferedReader bufferedReader = new BufferedReader(new FileReader(csvRoom));
//                while ((line = bufferedReader.readLine()) != null) {
//                    String[] arrRoom = line.split(",");
//                    System.out.println(arrRoom[0] + arrRoom[1] + arrRoom[2] + arrRoom[3] + arrRoom[4] + arrRoom[5]
//                            + arrRoom[6] + arrRoom[7] + arrRoom[8]);
//                }
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
    }

    private static void addNewServices() {
        int tuyChon;
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

    public static void addNewService(String fileName) {
        scanner.nextLine();
        System.out.println("nhap id :");
        String id = scanner.nextLine();
        if (fileName.equals(villa)) {
            Validate.kiemTraId(id, new Villa());
            while (!Validate.kiemTraId(id, fileName)) {
                System.out.println("id khong dung ! vd:SVXX-YYYY ");
                System.out.println("nhap id :");
                id = scanner.nextLine();
                Validate.kiemTraId(id, fileName);
            }
        } else if (fileName.equals(house)) {
            Validate.kiemTraId(id, new House());
            while (!Validate.kiemTraId(id, fileName)) {
                System.out.println("id khong dung ! vd:SVXX-YYYY ");
                System.out.println("nhap id :");
                id = scanner.nextLine();
                Validate.kiemTraId(id, fileName);
            }
        } else if (fileName.equals(room)) {
            Validate.kiemTraId(id, new Room());
            while (!Validate.kiemTraId(id, fileName)) {
                System.out.println("id khong dung ! vd:SVXX-YYYY ");
                System.out.println("nhap id :");
                id = scanner.nextLine();
                Validate.kiemTraId(id, fileName);
            }
        }

        System.out.println("nhap ten dich vu :");
        String tenDichVu = scanner.nextLine();
        Validate.kiemTraTenDichVu(tenDichVu);
        while (!Validate.kiemTraTenDichVu(tenDichVu)) {
            System.out.println("ten dich vu khong dung :");
            System.out.println("nhap ten dich vu :");
            tenDichVu = scanner.nextLine();
            Validate.kiemTraTenDichVu(tenDichVu);
        }

        System.out.println("nhap dien tich su dung : ");
        String dienTichSuDung = scanner.nextLine();
        Validate.kiemTraDienTichSuDung(dienTichSuDung);
        while (!Validate.kiemTraDienTichSuDung(dienTichSuDung)) {
            System.out.println("dien tich su dung khong dung : ");
            System.out.println("nhap dien tich su dung : ");
            dienTichSuDung = scanner.nextLine();
            Validate.kiemTraDienTichSuDung(dienTichSuDung);
        }

        System.out.println("nhap chi phi thue : ");
        String chiPhiThue = scanner.nextLine();
        Validate.kiemTraChiPhiThue(chiPhiThue);
        while (!Validate.kiemTraChiPhiThue(chiPhiThue)) {
            System.out.println("chi phi thue khong dung : ");
            System.out.println("nhap chi phi thue : ");
            chiPhiThue = scanner.nextLine();
            Validate.kiemTraChiPhiThue(chiPhiThue);
        }

        System.out.println("nhap so nguoi toi da :");
        String soNguoiToiDa = scanner.nextLine();
        Validate.kiemTraSoLuongNguoi(soNguoiToiDa);
        while (!Validate.kiemTraSoLuongNguoi(soNguoiToiDa)) {
            System.out.println("so nguoi khong dung : ");
            System.out.println("nhap so nguoi toi da :");
            soNguoiToiDa = scanner.nextLine();
            Validate.kiemTraSoLuongNguoi(soNguoiToiDa);
        }

        System.out.println("nhap kieu thue : ");
        String kieuThue = scanner.nextLine();
        Validate.kiemTraKieuThue(kieuThue);
        while (!Validate.kiemTraKieuThue(kieuThue)) {
            System.out.println("kieu thue khong dung : ");
            System.out.println("nhap kieu thue : ");
            kieuThue = scanner.nextLine();
            Validate.kiemTraKieuThue(kieuThue);
        }

        FileUtils.setPath(fileName);

        if (fileName.equals(villa)) {
            System.out.println("nhap tieu chuan phong : ");
            String tieuChuanPhong = scanner.nextLine();
            Validate.kiemTraTieuChuanPhong(tieuChuanPhong);
            while (!Validate.kiemTraTieuChuanPhong(tieuChuanPhong)) {
                System.out.println("tieu chuan phong khong dung : ");
                System.out.println("nhap tieu chuan phong : ");
                tieuChuanPhong = scanner.nextLine();
                Validate.kiemTraTieuChuanPhong(tieuChuanPhong);
            }

            System.out.println("nhap mo ta tien nghi khac : ");
            String moTaTienNghiKhac = scanner.nextLine();

            System.out.println("nhap dien tich ho boi :");
            String dienTichHoBoi = scanner.nextLine();
            Validate.kiemTraDienTichHoBoi(dienTichHoBoi);
            while (!Validate.kiemTraDienTichHoBoi(dienTichHoBoi)) {
                System.out.println("dien tich ho boi khong dung : ");
                System.out.println("nhap dien tich ho boi :");
                dienTichHoBoi = scanner.nextLine();
                Validate.kiemTraDienTichHoBoi(dienTichHoBoi);
            }

            System.out.println("nhap so tang :");
            String soTang = scanner.nextLine();
            Validate.kiemTraSoTang(soTang);
            while (!Validate.kiemTraSoTang(soTang)) {
                System.out.println("so tang khong dung : ");
                System.out.println("nhap so tang :");
                soTang = scanner.nextLine();
                Validate.kiemTraSoTang(soTang);
            }

            FileUtils.writeFile(new String[]{id, tenDichVu, dienTichSuDung,
                    chiPhiThue, soNguoiToiDa
                    , kieuThue, tieuChuanPhong, moTaTienNghiKhac,
                    dienTichHoBoi, soTang});

        } else if (fileName.equals(house)) {
            System.out.println("nhap tieu chuan phong : ");
            String tieuChuanPhong = scanner.nextLine();
            Validate.kiemTraTieuChuanPhong(tieuChuanPhong);
            while (!Validate.kiemTraTieuChuanPhong(tieuChuanPhong)) {
                System.out.println("tieu chuan phong khong dung : ");
                System.out.println("nhap tieu chuan phong : ");
                tieuChuanPhong = scanner.nextLine();
                Validate.kiemTraTieuChuanPhong(tieuChuanPhong);
            }

            System.out.println("nhap mo ta tien nghi khac : ");
            String moTaTienNghiKhac = scanner.nextLine();

            System.out.println("nhap so tang :");
            String soTang = scanner.nextLine();
            Validate.kiemTraSoTang(soTang);
            while (!Validate.kiemTraSoTang(soTang)) {
                System.out.println("so tang khong dung : ");
                System.out.println("nhap so tang :");
                soTang = scanner.nextLine();
                Validate.kiemTraSoTang(soTang);
            }

            FileUtils.writeFile(new String[]{id, tenDichVu, dienTichSuDung,
                    chiPhiThue, soNguoiToiDa
                    , kieuThue, tieuChuanPhong, moTaTienNghiKhac
                    , soTang});

        } else if (fileName.equals(room)) {
            System.out.println("nhap ten dich vu di kem :");
            String tenDichVuDiKem = scanner.nextLine();
            Validate.kiemTraDichVuDiKem(tenDichVuDiKem);
            while (!Validate.kiemTraDichVuDiKem(tenDichVuDiKem)) {
                System.out.println("ten dich vu di kem khong dung : ");
                System.out.println("nhap ten dich vu di kem :");
                tenDichVuDiKem = scanner.nextLine();
                Validate.kiemTraDichVuDiKem(tenDichVuDiKem);
            }

            System.out.println("nhap don vi :");
            String donVi = scanner.nextLine();

            System.out.println("nhap gia tien :");
            double giaTien = scanner.nextDouble();

            FileUtils.writeFile(new String[]{id, tenDichVu, String.valueOf(dienTichSuDung),
                    chiPhiThue, soNguoiToiDa
                    , kieuThue, tenDichVuDiKem, donVi, String.valueOf(giaTien)});
        }
    }
}
