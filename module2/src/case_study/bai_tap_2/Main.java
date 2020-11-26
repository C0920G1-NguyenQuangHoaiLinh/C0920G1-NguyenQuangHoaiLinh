package case_study.bai_tap_2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.displayMenu();
    }

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        PersonManager personManager = new PersonManager();
        int choose = 0;
        do {
            System.out.println("ỨNG DỤNG QUẢN LÝ DANH BẠ");
            System.out.println("--------------------------");
            System.out.println("1. Xem danh sách ");
            System.out.println("2. Thêm mới ");
            System.out.println("3. Cập nhật ");
            System.out.println("4. Xóa ");
            System.out.println("5. Tìm kiếm ");
            System.out.println("6. Đọc từ File ");
            System.out.println("7. Ghi vào File ");
            System.out.println("8. Thoát ");
            System.out.print("Nhập chức năng (1 - 6): ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    personManager.showPerson();
                    break;
                case 2:
                    personManager.addNewPerson();
                    break;
                case 3:
                    personManager.editPerson();
                    break;
                case 4:
                    personManager.deletePerson();
                    break;
                case 5:
                    personManager.searchPerson();
                    break;
                case 6:
                    System.out.println("Bạn có chắc cập nhật lại danh bạ từ file (N để thoát)");
                    scanner.nextLine();
                    String temp = scanner.nextLine();
                    if (temp.equals("")) {
                        for (Person person : personManager.readContacts()) {
                            System.out.println(person);
                        }
                    } else if (temp.equals("N")) {
                    }
                    break;
                case 7:
                    System.out.println("Ghi file sẽ cập nhật lại file (enter)! (N để thoát) ");
                    scanner.nextLine();
                    String temp1 = scanner.nextLine();
                    if(temp1.equals("")) {
                        personManager.writeContacts();
                        break;
                    }else if (temp1.equals("N")){
                        break;
                    }
                case 8:
                    return;
            }
        } while (choose >= 1 && choose <= 7);

    }
}
